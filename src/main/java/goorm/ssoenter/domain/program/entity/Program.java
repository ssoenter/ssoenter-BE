package goorm.ssoenter.domain.program.entity;

import goorm.ssoenter.domain.enterprise.entity.Category;
import goorm.ssoenter.domain.enterprise.entity.Enterprise;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "program")
public class Program {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long programId;

    @ManyToOne
    @JoinColumn(name = "enterpriseId", nullable = false)
    private Enterprise enterprise;

    @Column(nullable = false)
    private String name;

    @Enumerated(EnumType.STRING)
    @Column
    private Category category;

    @Column
    private String description;

    @Column
    private LocalDate date;

    @Column
    private String location;

}
