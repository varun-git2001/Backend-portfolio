package com.portfolio.demo.Repository;

import com.portfolio.demo.Table.Skill;

//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> 
{
    // Optional<Skill> findByuserId(Long userId);
}

