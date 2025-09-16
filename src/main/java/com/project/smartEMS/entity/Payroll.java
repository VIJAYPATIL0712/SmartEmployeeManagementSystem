package com.project.smartEMS.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "payroll")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payroll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private Double basicSalary;
    private Double bonus;
    private Double tax;
    private Double netPay;

    private LocalDate salaryMonth;
}
