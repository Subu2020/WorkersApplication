package com.UST.WorkersApplication.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UST.WorkersApplication.Model.WorkerInfo;
import com.UST.WorkersApplication.Service.WorkerService;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/ust")
public class WorkerController {

    @Autowired
    private WorkerService service;
    
    @PostMapping("/addworker")
    public WorkerInfo addworker(@RequestBody WorkerInfo workerinfo)
    {
        return service.addworker(workerinfo);
    }
    @GetMapping("/getallworkers")
    public List<WorkerInfo> getallworkers()
    {
        return service.getallworkers();
    }
    @GetMapping("/getworkerbyid/{id}")
    public WorkerInfo getworkerbyid(@PathVariable Long id)
    {
        return service.getworkerbyid(id);
    }
    @DeleteMapping("/deleteworkerbyid/{id}")
    public String deleteworkerbyid(@PathVariable Long id)
    {
        return service.deleteworkerbyid(id);
    }
    @PutMapping("/updateworkerdetails/{id}")
    public WorkerInfo updateworkerdetails(@PathVariable Long id,@RequestBody WorkerInfo workerinfo)
    {
        return service.updateworkerdetails(id,workerinfo);
    }
}
