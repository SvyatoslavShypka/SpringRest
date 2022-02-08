package eu.dar3.springrest.service;

import eu.dar3.springrest.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id) throws CustomerServiceImpl.UsernameNotFoundException;

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();
}
