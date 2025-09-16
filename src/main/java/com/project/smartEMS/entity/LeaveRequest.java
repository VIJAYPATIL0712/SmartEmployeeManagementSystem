package com.project.smartEMS.entity;


import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "leave_requests")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeaveRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    private LocalDate startDate;
    private LocalDate endDate;

    private String reason;

    @Column(nullable = false)
    private String status; // PENDING, APPROVED, REJECTED
}
