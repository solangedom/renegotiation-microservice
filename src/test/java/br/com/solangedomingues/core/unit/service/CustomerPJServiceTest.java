package br.com.solangedomingues.core.unit.service;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import br.com.solangedomingues.core.repositories.CustomerPJRepository;
import br.com.solangedomingues.core.service.CustomerPJService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static br.com.solangedomingues.core.mock.CustomerPJMock.getCustomerPJList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class CustomerPJServiceTest {

    @SpyBean
    private CustomerPJService customerPJService;

    @MockBean
    private CustomerPJRepository repository;

    @Test
    void findAllCustomerPJSuccess() {
        List<CustomerPJ> customerPJList = getCustomerPJList();
        when(repository.findAll()).thenReturn(customerPJList);

        List<CustomerPJ> result = customerPJService.findAll();

        assertNotNull(result);
        assertEquals(result.size(), 2);
        verify(repository).findAll();
    }

}
