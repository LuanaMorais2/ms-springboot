package com.lumorais.microsservicescourse.repositories;

import com.lumorais.microsservicescourse.entities.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
}
