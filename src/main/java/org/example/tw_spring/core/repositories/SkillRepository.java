package org.example.tw_spring.core.repositories;

import org.example.tw_spring.core.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
