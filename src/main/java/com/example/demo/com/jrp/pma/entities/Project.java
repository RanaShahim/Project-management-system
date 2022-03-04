package com.example.demo.com.jrp.pma.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String stage; //Started/In progress etc..
    private String desc;

    @OneToMany(mappedBy = "theProject")
    private List<Employee> employees;

    public Project(){

    }

    public Project(String name, String stage, String desc) {
        this.name = name;
        this.stage = stage;
        this.desc = desc;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
