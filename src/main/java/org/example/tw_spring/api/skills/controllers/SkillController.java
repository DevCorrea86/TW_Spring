package org.example.tw_spring.api.skills.controllers;

import lombok.RequiredArgsConstructor;
import org.example.tw_spring.api.skills.dtos.SkillResponse;
import org.example.tw_spring.api.skills.mappers.SkillMappers;
import org.example.tw_spring.core.repositories.SkillRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
public class SkillController {

    private final SkillRepository skillRepository;
    private final SkillMappers skillMappers;

    @GetMapping
    public List<SkillResponse> findAll(){
        return skillRepository
                .findAll()
                .stream()
                .map(skillMappers::toSkillResponse)
                .toList();
    }
}
