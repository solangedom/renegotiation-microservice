package br.com.solangedomingues.core.service.processors;

import br.com.solangedomingues.core.domain.customer.CustomerPF;
import br.com.solangedomingues.core.domain.debt.Debt;
import br.com.solangedomingues.core.service.CustomerPFService;
import br.com.solangedomingues.core.service.DebtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;

@Slf4j
@Service
@RequiredArgsConstructor
public class RenegotiationCustomerProcessorPF implements RenegotiationCustomerProcessor {

    private final CustomerPFService customerPFService;

    private final DebtService debtService;

    @Override
    public void process(LocalDate processDate) {
        // TODO: Business Rules PF #fake

        List<CustomerPF> clientPFList = customerPFService.findAll();
        log.info("Clients PF list:{}", clientPFList);

        List<Debt> debtList = debtService.findDebtByCustomerType(PF);
        log.info("Debt Customer PF list:{}", debtList);

    }

    @Override
    public String type() {
        return PF.name();
    }

}
