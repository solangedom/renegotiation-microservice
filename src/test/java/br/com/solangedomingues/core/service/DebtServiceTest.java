package br.com.solangedomingues.core.service;

import br.com.solangedomingues.core.domain.debt.Debt;
import br.com.solangedomingues.core.repository.DebtRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;
import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;
import static br.com.solangedomingues.core.mock.DebtMock.debtPFList;
import static br.com.solangedomingues.core.mock.DebtMock.debtPJList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class DebtServiceTest {

    @SpyBean
    private DebtService debtService;

    @MockBean
    private DebtRepository repository;

    @Test
    void findAllDebtPFSuccess() {
        List<Debt> debtList = debtPFList();
        when(repository.findDebtByCustomerType(PF)).thenReturn(debtList);

        List<Debt> result = debtService.findDebtByCustomerType(PF);

        assertNotNull(result);
        assertEquals(result.size(), 3);
        verify(repository).findDebtByCustomerType(PF);
    }

    @Test
    void findAllDebtPJSuccess() {
        List<Debt> debtList = debtPJList();
        when(repository.findDebtByCustomerType(PJ)).thenReturn(debtList);

        List<Debt> result = debtService.findDebtByCustomerType(PJ);

        assertNotNull(result);
        assertEquals(result.size(), 2);
        verify(repository).findDebtByCustomerType(PJ);
    }

}
