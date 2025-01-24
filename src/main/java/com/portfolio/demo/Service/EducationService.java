package com.portfolio.demo.Service;

import com.portfolio.demo.Table.Education;
import com.portfolio.demo.Repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService 
{

    private final EducationRepository educationRepository;

    @Autowired
    public EducationService(EducationRepository educationRepository) {
        this.educationRepository = educationRepository;
    }
    public List<Education> getAllEducation() {
        return educationRepository.findAll();
    }

    public void deleteEducationById(Long id) {
        educationRepository.deleteById(id);
    }
}
