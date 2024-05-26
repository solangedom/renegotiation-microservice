package br.com.solangedomingues.core.mock;

import br.com.solangedomingues.core.domain.customer.Customer;
import br.com.solangedomingues.core.domain.debt.Debt;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

import static br.com.solangedomingues.core.domain.enumeration.DebtStatus.OPEN;
import static br.com.solangedomingues.core.mock.CustomerPFMock.getCustomerPF;
import static br.com.solangedomingues.core.mock.CustomerPJMock.getCustomerPJ;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class DebtMock {

    public static Debt getDebt(Long id, Customer customer) {
        return Debt.builder()
                .id(id)
                .amount_debt(BigDecimal.TEN)
                .customer(customer)
                .currentStatus(OPEN)
                .build();
    }

    public static List<Debt> debtPFList() {
        return List.of(
                getDebt(1L, getCustomerPF(1L)),
                getDebt(2L, getCustomerPF(2L)),
                getDebt(3L, getCustomerPF(3L))
        );
    }

    public static List<Debt> debtPJList() {
        return List.of(
                getDebt(4L, getCustomerPJ(4L)),
                getDebt(5L, getCustomerPJ(5L))
        );
    }
}
