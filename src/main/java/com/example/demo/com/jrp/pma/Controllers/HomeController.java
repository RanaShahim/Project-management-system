package com.example.demo.com.jrp.pma.Controllers;

import com.example.demo.com.jrp.pma.dao.EmployeeRepo;
import com.example.demo.com.jrp.pma.dao.ProjectRepo;
import com.example.demo.com.jrp.pma.entities.Employee;
import com.example.demo.com.jrp.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    EmployeeRepo empRepo;

    @GetMapping("/AllProjects")
    public String displayProjects(Model model){
        List<Project> projects = projectRepo.findAll();
        model.addAttribute("projects", projects);
        return "Projects/home";
    }

    @GetMapping("/AllEmployees")
    public String displayEmployees(Model model){
        List<Employee> projects = empRepo.findAll();
        model.addAttribute("employee", projects);
        return "Employees/EmployeeHome";
    }
}
