package com.matthew.jobportal.repository;

import com.matthew.jobportal.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}