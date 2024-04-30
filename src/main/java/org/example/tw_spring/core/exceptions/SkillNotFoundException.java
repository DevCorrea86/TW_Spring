package org.example.tw_spring.core.exceptions;

public class SkillNotFoundException extends ModelNotFoundException{
    public SkillNotFoundException(String message) {
        super(message);
    }

    public SkillNotFoundException(){
        super("Skill not found!");
    }
}
