package com.umut.demo_umut.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.UUID;


/**
 * Bu class veri tabanı tablosudur aslında.
 * Hibernate aracılığıyla @Entity anotasyonu aracılıyla bunun bir veritabanı nesnesi olduğu belirtir.
 * @Table anatasyonu bu tablonun db üzerindeki adını belirtir.
 * @Entity olmazsa JPA bunun ne olduğunu anlayamaz ve db üzerine herhangi bir kayıt atamaz UNUTMA.
 * Diğer anotasyonlar klasik kapsülleme için kullanılır JPA ile ilişkisi yoktur.
 * Önemli Eğer bir entity oluştururken NoArgsConstructor olmazsa JPA bu class için constructor set edemeyeceği için patlar. Kesinlikle NoArgsContructor gerekiyor.
 *
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="student")
public class Student {
    @Id
    private UUID id = UUID.randomUUID();

    @Column(name="name")
    private String name;

    @Column(name = "surName")
    private String surName;

    @Column(name="studentNo")
    private String studentNo;
}
