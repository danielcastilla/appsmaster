package com.dancas.appsmaster.web;


import com.dancas.appsmaster.service.IApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.dancas.appsmaster.model.*;

import java.util.List;

@RestController
public class ApplicationController {


    @Autowired
    IApplicationService applicationService;

    @GetMapping(value="/applications")
    public List<Application> getApplications(){

        System.out.println("********************");
        return applicationService.findAll();

    }




}
