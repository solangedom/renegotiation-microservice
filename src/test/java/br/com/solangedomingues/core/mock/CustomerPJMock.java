package br.com.solangedomingues.core.mock;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PJ;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerPJMock {

    public static CustomerPJ getCustomerPJ(Long id) {
        return CustomerPJ.builder()
                .id(id)
                .name("Loja do Pedro")
                .cnpj("00000000000-0003")
                .type(PJ)
                .build();
    }

    public static List<CustomerPJ> getCustomerPJList() {
        return List.of(
                getCustomerPJ(1L),
                getCustomerPJ(2L)
        );
    }
}
