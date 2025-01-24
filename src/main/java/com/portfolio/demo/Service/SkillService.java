package com.portfolio.demo.Service;

import com.portfolio.demo.Table.Skill;
import com.portfolio.demo.Repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//import java.util.Optional;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    @Autowired
    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    // public Skill saveSkill(Skill skill) {
    //     return skillRepository.save(skill);
    // }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    // public Optional<Skill> getSkillById(Long id) {
    //     return skillRepository.findById(id);
    // }

    // public List<Skill> getSkillsByUserId(Long userId) {
    //     return skillRepository.findAll().stream()
    //             .filter(skill -> skill.getUser().getId().equals(userId))
    //             .toList();
    // }

    public void deleteSkillById(Long id) {
        skillRepository.deleteById(id);
    }
}
