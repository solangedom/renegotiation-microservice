package br.com.solangedomingues.core.repository;

import br.com.solangedomingues.core.domain.debt.Debt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Long> {

}
