package com.example.domain.user.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="t_salary")
public class Salary {
    // private String userId;
    // private String yearMonth;
    @EmbeddedId
    private SalaryKey salaryKey;

    private Integer salary;
}
