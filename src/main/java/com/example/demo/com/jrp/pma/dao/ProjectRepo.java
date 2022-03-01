package com.example.demo.com.jrp.pma.dao;

import com.example.demo.com.jrp.pma.entities.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectRepo extends CrudRepository<Project, Long> {

    public List<Project> findAll();
}
