package eu.dar3.springrest.repository;

import eu.dar3.springrest.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for {@link Customer} class.
 */

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
