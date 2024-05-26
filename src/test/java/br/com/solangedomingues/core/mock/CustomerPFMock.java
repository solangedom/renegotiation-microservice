package br.com.solangedomingues.core.mock;

import br.com.solangedomingues.core.domain.customer.CustomerPF;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.List;

import static br.com.solangedomingues.core.domain.enumeration.CustomerType.PF;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerPFMock {

    public static CustomerPF getCustomerPF(Long id) {
        return CustomerPF.builder()
                .id(id)
                .name("João")
                .cpf("11111111111")
                .type(PF)
                .build();
    }

    public static List<CustomerPF> getCustomerPFList() {
        return List.of(
                getCustomerPF(1L),
                getCustomerPF(2L),
                getCustomerPF(3L),
                getCustomerPF(4L)
        );
    }

}
