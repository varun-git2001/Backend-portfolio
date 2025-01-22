package com.portfolio.demo.Repository;

import com.portfolio.demo.Table.Education;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> 
{
    Optional<Education> findByuserId(Long userId);
}
