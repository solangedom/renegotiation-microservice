package br.com.solangedomingues.core.repositories;

import br.com.solangedomingues.core.domain.customer.CustomerPJ;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPJRepository extends JpaRepository<CustomerPJ, Long> {

}
