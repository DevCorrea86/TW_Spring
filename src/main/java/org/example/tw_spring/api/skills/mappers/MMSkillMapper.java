package org.example.tw_spring.api.skills.mappers;

import lombok.RequiredArgsConstructor;
import org.example.tw_spring.api.skills.dtos.SkillRequest;
import org.example.tw_spring.api.skills.dtos.SkillResponse;
import org.example.tw_spring.core.entities.Skill;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MMSkillMapper implements SkillMappers{

    private final ModelMapper modelMapper;
    @Override
    public Skill toSkill(SkillRequest skillRequest) {
        return modelMapper.map(
                skillRequest,
                Skill.class
        );
    }

    @Override
    public SkillResponse toSkillResponse(Skill skill) {
        return modelMapper.map(
                skill,
                SkillResponse.class
        );
    }
}
