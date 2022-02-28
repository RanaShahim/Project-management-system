package com.example.demo.com.jrp.pma.Controllers;

import com.example.demo.com.jrp.pma.entities.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/projects")
public class ProjectController {

    @RequestMapping(value = "/new")
    public String displayProjectForm(Model model){
        model.addAttribute("project", new Project());
        return "New-project";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Project project, Model model){

        //This method handles saving data to the db
    }
}
