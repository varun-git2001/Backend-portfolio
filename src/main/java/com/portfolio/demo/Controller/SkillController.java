package com.portfolio.demo.Controller;

import com.portfolio.demo.Service.SkillService;
import com.portfolio.demo.Table.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//import java.util.Optional;

@RestController
@RequestMapping("/skill")
public class SkillController 
{

    private final SkillService skillService;

    @Autowired
    public SkillController(SkillService skillService) 
    {
        this.skillService = skillService;
    }

    @GetMapping("/2")
    public ResponseEntity<List<Skill>> getAllSkills() 
    {
        List<Skill> skills = skillService.getAllSkills();
        return ResponseEntity.ok(skills);
    }
}
