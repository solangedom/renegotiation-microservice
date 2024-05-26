package br.com.solangedomingues.core.controller;

import br.com.solangedomingues.core.service.RenegotiationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(JobController.class)
public class JobControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private RenegotiationService renegotiationService;

    @Test
    void processRenegotiationCustomerWithSuccess() throws Exception {
        final LocalDate processDate = LocalDate.now();
        final String type = PJ.name();

        doNothing().when(renegotiationService).processRenegotiationCustomer(type, processDate);

        mockMvc.perform(post("/jobs/process-renegotiation")
                        .param("type", type)
                        .param("processDate", processDate.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent());

        verify(renegotiationService).processRenegotiationCustomer(type, processDate);
    }
}
