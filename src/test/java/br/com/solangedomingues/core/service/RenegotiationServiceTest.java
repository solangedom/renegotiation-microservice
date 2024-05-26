package br.com.solangedomingues.core.service;

import br.com.solangedomingues.core.service.processors.RenegotiationCustomerProcessorPF;
import br.com.solangedomingues.core.service.processors.RenegotiationCustomerProcessorPJ;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;
import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
public class RenegotiationServiceTest {

    @SpyBean
    private RenegotiationService renegotiationService;

    @MockBean(name = "renegotiationClientProcessorPJ")
    private RenegotiationCustomerProcessorPJ renegotiationCustomerProcessorPJ;

    @MockBean(name = "renegotiationClientProcessorPF")
    private RenegotiationCustomerProcessorPF renegotiationCustomerProcessorPF;

    @Test
    void processRenegotiationCustomerWithSuccess() {
        final LocalDate processDate = LocalDate.now();
        final String type = PJ.name();

        when(renegotiationCustomerProcessorPJ.type()).thenReturn(PJ.name());
        when(renegotiationCustomerProcessorPF.type()).thenReturn(PF.name());

        renegotiationService.processRenegotiationCustomer(type, processDate);

        verify(renegotiationCustomerProcessorPF).type();
        verify(renegotiationCustomerProcessorPJ).type();

        verify(renegotiationCustomerProcessorPF, never()).process(processDate);
        verify(renegotiationCustomerProcessorPJ).process(processDate);
    }

    @Test
    void processRenegotiationCustomerWhenProcessorNotExist() {
        final LocalDate processDate = LocalDate.now();
        final String type = "AAA";

        when(renegotiationCustomerProcessorPJ.type()).thenReturn(PJ.name());
        when(renegotiationCustomerProcessorPF.type()).thenReturn(PF.name());

        renegotiationService.processRenegotiationCustomer(type, processDate);

        verify(renegotiationCustomerProcessorPF).type();
        verify(renegotiationCustomerProcessorPJ).type();

        verify(renegotiationCustomerProcessorPF, never()).process(processDate);
        verify(renegotiationCustomerProcessorPJ, never()).process(processDate);
    }

}
