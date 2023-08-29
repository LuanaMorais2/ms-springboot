package com.lumorais.hrworker.repositories;

import com.lumorais.hrworker.entities.Worker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkerRepository extends CrudRepository<Worker, Long> {
}
