package br.com.solangedomingues.core.service;

import br.com.solangedomingues.core.domain.customer.CustomerPF;
import br.com.solangedomingues.core.repositories.CustomerPFRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class CustomerPFService {

    private final CustomerPFRepository customerPFRepository;

    public List<CustomerPF> findAll() {
        return customerPFRepository.findAll();
    }

}
