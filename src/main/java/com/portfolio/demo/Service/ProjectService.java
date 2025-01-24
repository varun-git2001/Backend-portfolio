package com.portfolio.demo.Service;

import com.portfolio.demo.Table.Project;
import com.portfolio.demo.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    // public Optional<Project> getProjectById(Long id) {
    //     return projectRepository.findById(id);
    // }

    // public List<Project> getProjectsByUserId(Long userId) {
    //     return projectRepository.findAll().stream()
    //             .filter(project -> project.getUser().getId().equals(userId))
    //             .toList();
    // }

}
