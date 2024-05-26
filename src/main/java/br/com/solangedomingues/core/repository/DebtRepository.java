package br.com.solangedomingues.core.repository;

import br.com.solangedomingues.core.domain.debt.Debt;
import br.com.solangedomingues.core.domain.enumeration.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DebtRepository extends JpaRepository<Debt, Long> {

    @Query("""
            SELECT d FROM Debt d
            JOIN d.customer c
            WHERE c.type = :type
            """)
    List<Debt> findDebtByCustomerType(CustomerType type);

}
