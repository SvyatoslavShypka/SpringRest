package eu.dar3.springrest.service;

import eu.dar3.springrest.model.Customer;
import eu.dar3.springrest.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.AuthenticationException;
import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) throws UsernameNotFoundException {
        log.info("IN CustomerServiceImpl getById {}", id);
//        return customerRepository.findById(id);
        return customerRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("user with Id " + id + " not found"));
    }
    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl delete {}", id);

    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl getAll");
        return customerRepository.findAll();
    }
    public class UsernameNotFoundException extends AuthenticationException {

        /**
         * Constructs a <code>UsernameNotFoundException</code> with the specified message.
         *
         * @param msg the detail message.
         */
        public UsernameNotFoundException(String msg) {
            super(msg);
        }
    }
}
