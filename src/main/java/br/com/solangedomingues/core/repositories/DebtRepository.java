package br.com.solangedomingues.core.repositories;

import br.com.solangedomingues.core.domain.debt.Debt;
import br.com.solangedomingues.core.domain.enumeration.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Long> {

    List<Debt> findDebtByCustomerType(CustomerType type);

}
