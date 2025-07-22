package com.works.entities;

import com.works.utils.EUser;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long uid;

    @Size(min=2, max=20)
    @NotNull
    @NotEmpty
    private String username;

    @Column(unique = true)
    @NotNull
    @Email
    private String email;

    @NotNull
    @Enumerated
    private EUser task;

    @NotNull
    private BigDecimal salary;

    @DateTimeFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    //@JsonFormat(pattern = "dd-MM-yyyy")
    private Date created;
}
