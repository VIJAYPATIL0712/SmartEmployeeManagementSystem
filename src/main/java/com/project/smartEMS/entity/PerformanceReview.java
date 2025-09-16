package com.project.smartEMS.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "performance_reviews")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PerformanceReview {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private String reviewer; // HR/Admin name
    private String feedback;
    private Integer rating; // 1–5
    private LocalDate reviewDate;
}
