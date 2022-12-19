package com.prog3_td2.prog3.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "sponsor")
public class SponsorEntity {
    @Id
    private Long id;
    private  String name;

    @ManyToMany
    @JoinTable(
            name = "have",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id"))
    @JsonIgnore
    private List<TeamEntity > teamEntity;
}
