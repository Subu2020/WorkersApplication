package com.UST.WorkersApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UST.WorkersApplication.Model.WorkerInfo;

@Repository
public interface WorkerRepository extends JpaRepository<WorkerInfo,Long>{
    
}
