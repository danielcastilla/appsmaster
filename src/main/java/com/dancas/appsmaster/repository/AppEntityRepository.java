package com.dancas.appsmaster.repository;

import com.dancas.appsmaster.model.AppEntity;
import org.springframework.data.repository.CrudRepository;

public interface AppEntityRepository extends CrudRepository<AppEntity, Long> {
}
