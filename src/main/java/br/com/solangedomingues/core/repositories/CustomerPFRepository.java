package br.com.solangedomingues.core.repositories;

import br.com.solangedomingues.core.domain.customer.CustomerPF;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPFRepository extends JpaRepository<CustomerPF, Long> {

}
