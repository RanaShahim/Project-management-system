package com.example.demo.com.jrp.pma.entities;

import javax.persistence.*;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long EmployeeId;
    private String firstName;
    private String lastName;
    private String email;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH, CascadeType.PERSIST}, fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project theProject;

    public Employee(){

    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Project getTheProject() {
        return theProject;
    }

    public void setTheProject(Project theProject) {
        this.theProject = theProject;
    }

    public long getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(long employeeId) {
        EmployeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
