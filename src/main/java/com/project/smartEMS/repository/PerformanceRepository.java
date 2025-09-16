package com.project.smartEMS.repository;

import com.project.smartEMS.entity.PerformanceReview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepository extends JpaRepository<PerformanceReview, Long> {
}
