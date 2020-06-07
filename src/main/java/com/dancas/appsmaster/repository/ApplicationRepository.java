package com.dancas.appsmaster.repository;

import com.dancas.appsmaster.model.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Integer> {
}
