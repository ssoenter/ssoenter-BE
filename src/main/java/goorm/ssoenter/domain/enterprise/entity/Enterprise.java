package goorm.ssoenter.domain.enterprise.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Table(name = "enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long enterpriseId;

    @Column(nullable = false)
    private String name;

    @Column
    private String representative;

    @Column
    private String contactInfo;

    @Enumerated(EnumType.STRING)
    @Column
    private Region region;

    @Column
    private String address;

    @Enumerated(EnumType.STRING)
    @Column
    private Category category;

    @Column
    private String description;

    @Column
    private String website;

    @Column
    private String story;

    @Column
    private int temperature;

    @Column
    private double latitude;

    @Column
    private double longitude;
}

