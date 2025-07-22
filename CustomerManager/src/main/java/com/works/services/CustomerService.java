package com.works.services;

import com.works.entities.Customer;
import com.works.repositories.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;

    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public List<Customer> saveAll(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    public Customer singleCustomer(long id) {
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        return optionalCustomer.orElse(null);
    }

    public List<Customer> equals(String text){
        return customerRepository.findByUsernameEqualsIgnoreCase(text);
    }

    public List<Customer> like(String text){
        return customerRepository.findByUsernameLikeIgnoreCase("%" + text);
    }

    public List<Customer> notLike(String text){
        return customerRepository.findByUsernameNotLikeIgnoreCase(text + "%");
    }

    public List<Customer> startsWith(String text){
        return customerRepository.findByUsernameStartsWithIgnoreCase(text);
    }

    public List<Customer> endsWith(String text){
        return customerRepository.findByUsernameEndsWithIgnoreCase(text);
    }

    public List<Customer> contains(String text){
        return customerRepository.findByUsernameContainsIgnoreCase(text);
    }

    public List<Customer> notContains(String text){
        return customerRepository.findByUsernameNotContainsIgnoreCase(text);
    }

    public List<Customer> in(Collection<String> texts){
        return customerRepository.findByUsernameInIgnoreCase(texts);
    }

    public List<Customer> notIn(Collection<String> texts){
        return customerRepository.findByUsernameNotInIgnoreCase(texts);
    }

    public List<Customer> between(BigDecimal salaryStart, BigDecimal salaryEnd){
        return customerRepository.findBySalaryBetween(salaryStart, salaryEnd);
    }

    public List<Customer> lessThan(BigDecimal salary){
        return customerRepository.findBySalaryLessThan(salary);
    }

    public List<Customer> greaterThan(BigDecimal salary){
        return customerRepository.findBySalaryGreaterThan(salary);
    }

}
