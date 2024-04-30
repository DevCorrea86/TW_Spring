package org.example.tw_spring.api.skills.mappers;

import org.example.tw_spring.api.skills.dtos.SkillRequest;
import org.example.tw_spring.api.skills.dtos.SkillResponse;
import org.example.tw_spring.core.entities.Skill;

public interface SkillMappers {

    Skill toSkill(SkillRequest skillRequest);
    SkillResponse toSkillResponse(Skill skill);
}
