package com.UST.WorkersApplication.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UST.WorkersApplication.Model.WorkerInfo;
import com.UST.WorkersApplication.Repository.WorkerRepository;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    public WorkerInfo addworker(WorkerInfo workerinfo)
    {
        return repository.save(workerinfo);
    }

    public List<WorkerInfo> getallworkers() {
        return repository.findAll();
    }

    public WorkerInfo getworkerbyid(Long id) {
        return repository.findById(id).orElse(null);
    }

    public String deleteworkerbyid(Long id) {
        repository.deleteById(id);
        return "Worker "+id+" was deleted.";
    }

    public WorkerInfo updateworkerdetails(Long id, WorkerInfo workerinfo) {
        WorkerInfo exsistinfworkerinfo = repository.findById(id).orElse(null);
        exsistinfworkerinfo.setName(workerinfo.getName());
        exsistinfworkerinfo.setRole(workerinfo.getRole());
        exsistinfworkerinfo.setEmail(workerinfo.getEmail());
        exsistinfworkerinfo.setExperience(workerinfo.getExperience());
        exsistinfworkerinfo.setSalary(workerinfo.getSalary());
        return repository.save(exsistinfworkerinfo);
    }
}
