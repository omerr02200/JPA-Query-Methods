package com.works.repositories;

import com.works.entities.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  List<Customer> findByUsernameEqualsIgnoreCase(String username);

  List<Customer> findByUsernameLikeIgnoreCase(String username);

  List<Customer> findByUsernameNotLikeIgnoreCase(String username);

  List<Customer> findByUsernameStartsWithIgnoreCase(String username);

  List<Customer> findByUsernameEndsWithIgnoreCase(String username);

  List<Customer> findByUsernameContainsIgnoreCase(String username);

  List<Customer> findByUsernameNotContainsIgnoreCase(String username);

  List<Customer> findByUsernameInIgnoreCase(Collection<String> usernames);

  List<Customer> findByUsernameNotInIgnoreCase(Collection<String> usernames);

  List<Customer> findBySalaryBetween(BigDecimal salaryStart, BigDecimal salaryEnd);

  List<Customer> findBySalaryLessThan(BigDecimal salary);

  List<Customer> findBySalaryGreaterThan(BigDecimal salary);
}