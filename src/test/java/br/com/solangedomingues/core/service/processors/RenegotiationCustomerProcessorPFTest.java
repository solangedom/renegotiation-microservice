package br.com.solangedomingues.core.service.processors;

import br.com.solangedomingues.core.service.CustomerPFService;
import br.com.solangedomingues.core.service.DebtService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;
import static br.com.solangedomingues.core.mock.CustomerPFMock.getCustomerPFList;
import static br.com.solangedomingues.core.mock.DebtMock.debtPFList;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class RenegotiationCustomerProcessorPFTest {

    @SpyBean
    private RenegotiationCustomerProcessorPF renegotiationClientProcessorPF;

    @MockBean
    private DebtService debtService;

    @MockBean
    private CustomerPFService customerPFService;

    @Test
    void processSuccess() {
        LocalDate processDate = LocalDate.now();

        when(debtService.findDebtByCustomerType(PF)).thenReturn(debtPFList());
        when(customerPFService.findAll()).thenReturn(getCustomerPFList());

        renegotiationClientProcessorPF.process(processDate);

        verify(debtService).findDebtByCustomerType(PF);
        verify(customerPFService).findAll();
    }

}
