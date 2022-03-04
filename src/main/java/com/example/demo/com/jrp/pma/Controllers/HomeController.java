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

    @GetMapping("/")
    public String displayAll(Model model){
        List<Project> projects = projectRepo.findAll();
        List<Employee> employee = empRepo.findAll();
        model.addAttribute("projects", projects);
        model.addAttribute("employee", employee);
        return "Main/home";
    }
}
