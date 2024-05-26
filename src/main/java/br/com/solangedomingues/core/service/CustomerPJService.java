package br.com.solangedomingues.core.service;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import br.com.solangedomingues.core.repository.CustomerPJRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerPJService {

    private final CustomerPJRepository customerPJRepository;

    public List<CustomerPJ> findAll() {
        return customerPJRepository.findAll();
    }

}
