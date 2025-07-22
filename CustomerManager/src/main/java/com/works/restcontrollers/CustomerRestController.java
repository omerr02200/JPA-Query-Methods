package com.works.restcontrollers;

import com.works.entities.Customer;
import com.works.services.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("customer")
@RequiredArgsConstructor
public class CustomerRestController {
    private final CustomerService customerService;

    @PostMapping("save")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PostMapping("saveAll")
    public List<Customer> saveAll(@RequestBody List<Customer> customers){
        return customerService.saveAll(customers);
    }

    @GetMapping("list")
    public List<Customer> list(){
        return customerService.findAll();
    }

    @GetMapping("singleCustomer")
    public Customer singleCustomer(@RequestParam(defaultValue = "1") long id){
        return customerService.singleCustomer(id);
    }

    @GetMapping("equals")
    public List<Customer> equals(String text){
        return customerService.equals(text);
    }

    @GetMapping("like")
    public List<Customer> like(String text){
        return customerService.like(text);
    }

    @GetMapping("notlike")
    public List<Customer> notLike(String text){
        return customerService.notLike(text);
    }

    @GetMapping("starswith")
    public List<Customer> starsWith(String text){
        return customerService.startsWith(text);
    }

    @GetMapping("endswith")
    public List<Customer> endsWith(String text){
        return customerService.endsWith(text);
    }

    @GetMapping("contains")
    public List<Customer> contains(String text){
        return customerService.contains(text);
    }

    @GetMapping("notcontains")
    public List<Customer> notContains(String text){
        return customerService.notContains(text);
    }

    @GetMapping("in")
    public List<Customer> in(@RequestParam Collection<String> texts){
        return customerService.in(texts);
    }

    @GetMapping("notin")
    public List<Customer> notIn(@RequestParam Collection<String> texts){
        return customerService.notIn(texts);
    }

    @GetMapping("between")
    public List<Customer> between(@RequestParam BigDecimal salaryStart, BigDecimal salaryEnd){
        return  customerService.between(salaryStart, salaryEnd);
    }

    @GetMapping("lessthan")
    public List<Customer> lessThan(@RequestParam BigDecimal salary){
        return customerService.lessThan(salary);
    }

    @GetMapping("greaterthan")
    public List<Customer> greaterThan(@RequestParam BigDecimal salary){
        return customerService.greaterThan(salary);
    }

}
