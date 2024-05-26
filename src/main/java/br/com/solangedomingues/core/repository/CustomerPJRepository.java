package br.com.solangedomingues.core.repository;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPJRepository extends JpaRepository<CustomerPJ, Long> {

}
