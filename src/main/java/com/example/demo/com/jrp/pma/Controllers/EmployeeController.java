package com.example.demo.com.jrp.pma.Controllers;

import com.example.demo.com.jrp.pma.dao.EmployeeRepo;
import com.example.demo.com.jrp.pma.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepo empRepo;

    @RequestMapping(value = "/newEmp")
    public String createEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "Employees/New-employee";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Employee employee, Model model){
        empRepo.save(employee); //The Employee Object gets binded to the form in the thymeleaf where we do
        //th:object = ${employee} and that's how we're able to use the object here and bind it.

        //Use redirect to prevent duplicate submissions because user can click submit 2,3 times
        return "redirect:/employee/newEmp";
        //This method handles saving data to the db
    }


}
