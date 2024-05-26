package br.com.solangedomingues.core.service.processors;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import br.com.solangedomingues.core.domain.debt.Debt;
import br.com.solangedomingues.core.service.CustomerPJService;
import br.com.solangedomingues.core.service.DebtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;

@Slf4j
@Service
@RequiredArgsConstructor
public class RenegotiationClientProcessorPJ implements RenegotiationClientProcessor {

    private final CustomerPJService customerPJService;

    private final DebtService debtService;

    @Override
    public void processRenegotiationClient(LocalDate processDate) {
        // TODO: Business Rules PJ #fake

        List<CustomerPJ> clientPJList = customerPJService.findAll();
        log.info("Clients PJ list:{}", clientPJList);

        List<Debt> debtList = debtService.findAll();
        log.info("Debt list:{}", debtList);

    }

    @Override
    public String type() {
        return PJ.name();
    }

}
