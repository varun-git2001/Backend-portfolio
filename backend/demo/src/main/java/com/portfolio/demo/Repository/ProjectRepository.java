package com.portfolio.demo.Repository;

import com.portfolio.demo.Table.Project;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> 
{
    Optional<Project> findByuserId(Long userId);
}

