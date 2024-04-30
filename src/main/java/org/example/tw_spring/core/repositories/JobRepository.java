package org.example.tw_spring.core.repositories;

import org.example.tw_spring.core.entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {
}
