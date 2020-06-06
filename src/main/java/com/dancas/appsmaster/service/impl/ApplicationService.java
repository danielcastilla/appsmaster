package com.dancas.appsmaster.service.impl;

import com.dancas.appsmaster.model.Application;
import com.dancas.appsmaster.service.IApplicationService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ApplicationService implements IApplicationService{


    @Override
    public List<Application> findAll() {


        ArrayList applications = new ArrayList<Application>();

        applications.add(new Application("name1","description"));
        applications.add(new Application("name2", "description2"));
        applications.add(new Application("name3", "description3"));

        return applications;
    }
}
