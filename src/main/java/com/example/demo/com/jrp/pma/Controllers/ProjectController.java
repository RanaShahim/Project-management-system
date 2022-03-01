package com.example.demo.com.jrp.pma.Controllers;

import com.example.demo.com.jrp.pma.dao.ProjectRepo;
import com.example.demo.com.jrp.pma.entities.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectRepo projRepo;

    @RequestMapping(value = "/new")
    public String displayProjectForm(Model model){
        model.addAttribute("project", new Project());
        return "Projects/New-project";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String createProject(Project project, Model model){
            projRepo.save(project);

            //Use redirect to prevent duplicate submissions because user can click submit 2,3 times
            return "redirect:/projects/new";
        //This method handles saving data to the db
    }
}
