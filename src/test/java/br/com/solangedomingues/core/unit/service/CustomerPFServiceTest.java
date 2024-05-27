package br.com.solangedomingues.core.unit.service;

import br.com.solangedomingues.core.domain.customer.CustomerPF;
import br.com.solangedomingues.core.repositories.CustomerPFRepository;
import br.com.solangedomingues.core.service.CustomerPFService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static br.com.solangedomingues.core.mock.CustomerPFMock.getCustomerPFList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class CustomerPFServiceTest {

    @SpyBean
    private CustomerPFService customerPFService;

    @MockBean
    private CustomerPFRepository repository;

    @Test
    void findAllCustomerPFSuccess() {
        List<CustomerPF> customerPFList = getCustomerPFList();
        when(repository.findAll()).thenReturn(customerPFList);

        List<CustomerPF> result = customerPFService.findAll();

        assertNotNull(result);
        assertEquals(result.size(), 4);
        verify(repository).findAll();
    }

}
