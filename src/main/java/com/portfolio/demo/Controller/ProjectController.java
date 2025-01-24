package com.portfolio.demo.Controller;

import com.portfolio.demo.Service.ProjectService;
import com.portfolio.demo.Table.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/2")
    public ResponseEntity<List<Project>> getAllProjects() {
        List<Project> projects = projectService.getAllProjects();
        return ResponseEntity.ok(projects);
    }

    // @GetMapping("/{id}")
    // public ResponseEntity<Project> getProjectById(@PathVariable Long id) {
    //     Optional<Project> project = projectService.getProjectById(id);
    //     return project.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    // }

    // @GetMapping("/user/{userId}")
    // public ResponseEntity<List<Project>> getProjectsByUserId(@PathVariable Long userId) {
    //     List<Project> projects = projectService.getProjectsByUserId(userId);
    //     return ResponseEntity.ok(projects);
    // }
}
