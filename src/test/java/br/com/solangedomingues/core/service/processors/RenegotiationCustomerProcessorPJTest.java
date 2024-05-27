package br.com.solangedomingues.core.service.processors;

import br.com.solangedomingues.core.service.CustomerPJService;
import br.com.solangedomingues.core.service.DebtService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;
import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;
import static br.com.solangedomingues.core.mock.CustomerPJMock.getCustomerPJList;
import static br.com.solangedomingues.core.mock.DebtMock.debtPJList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class RenegotiationCustomerProcessorPJTest {

    @SpyBean
    private RenegotiationCustomerProcessorPJ renegotiationClientProcessorPJ;

    @MockBean
    private DebtService debtService;

    @MockBean
    private CustomerPJService customerPJService;

    @Test
    void processSuccess() {
        LocalDate processDate = LocalDate.now();

        when(debtService.findDebtByCustomerType(PJ)).thenReturn(debtPJList());
        when(customerPJService.findAll()).thenReturn(getCustomerPJList());

        renegotiationClientProcessorPJ.process(processDate);

        verify(debtService).findDebtByCustomerType(PJ);
        verify(customerPJService).findAll();
    }

    @Test
    void typeCurrentPFTest(){
        String type = renegotiationClientProcessorPJ.type();
        assertEquals(type, PJ.name());
    }

}
