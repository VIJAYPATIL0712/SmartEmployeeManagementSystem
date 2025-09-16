package com.project.smartEMS.repository;

import com.project.smartEMS.entity.PerformanceReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PerformanceRepository extends JpaRepository<PerformanceReview, Long> {
}
