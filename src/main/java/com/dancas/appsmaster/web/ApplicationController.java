package com.dancas.appsmaster.web;


import com.dancas.appsmaster.model.Application;
import com.dancas.appsmaster.repository.ApplicationRepository;
import com.dancas.appsmaster.service.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import java.util.List;

@RestController
public class ApplicationController {


    @Autowired
    private final ApplicationRepository applicationRepository;


    public ApplicationController(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    @GetMapping("/applications")
    public List<Application> getApplications(){
        return (List<Application>) applicationRepository.findAll();
    }

    @PostMapping(path="/application")
    void addApplication(@RequestBody Application application){
        applicationRepository.save(application);
    }


    /*@PostMapping(path="/add")
    public @ResponseBody String addNewApplication(@RequestParam String name, @RequestParam String description){
        Application app = new Application(name, description);
        applicationRepository.save(app);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Application> getAllUsers() {
        return applicationRepository.findAll();
    }
*/

}
