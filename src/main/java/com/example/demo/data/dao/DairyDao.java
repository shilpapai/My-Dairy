package com.example.demo.data.dao;

import com.example.demo.data.model.Dairy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface DairyDao extends CrudRepository<Dairy,Long>{

}
