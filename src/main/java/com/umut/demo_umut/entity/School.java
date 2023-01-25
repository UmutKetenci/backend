package com.umut.demo_umut.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "school")
public class School {
    @Id
    private UUID schoolId = UUID.randomUUID();

    @Column(name = "schoolName")
    private String  schoolName;

    @Column(name = "schoolCapacity")
    private String schoolCapacity;
}
