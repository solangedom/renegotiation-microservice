package br.com.solangedomingues.core.service;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import br.com.solangedomingues.core.domain.debt.Debt;
import br.com.solangedomingues.core.repository.CustomerPJRepository;
import br.com.solangedomingues.core.repository.DebtRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class DebtService {

    private final DebtRepository debtRepository;

    public List<Debt> findAll(){
        return debtRepository.findAll();
    }
}
