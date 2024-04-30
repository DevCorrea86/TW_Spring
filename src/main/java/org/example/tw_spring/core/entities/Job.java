package org.example.tw_spring.core.entities;

import jakarta.persistence.*;
import lombok.*;
import org.example.tw_spring.core.enums.JobLevel;
import org.example.tw_spring.core.enums.JobType;

import java.math.BigDecimal;
import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(onlyExplicitlyIncluded = true)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ToString.Include
    @EqualsAndHashCode.Include
    private Long id;

    @ToString.Include
    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false, length = 50)
    private String company;

    @Column(nullable = false, length = 100)
    private String location;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private JobType type;

    @Column(nullable = false, length = 10)
    @Enumerated(EnumType.STRING)
    private JobLevel level;

    @Column(nullable = false, scale = 2)
    private BigDecimal salary;

    @ManyToMany
    private List<Skill> skills;
}
