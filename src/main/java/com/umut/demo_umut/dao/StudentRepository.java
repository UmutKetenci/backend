package com.umut.demo_umut.dao;

import com.umut.demo_umut.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepository extends JpaRepository<Student, UUID> {
    Student readById(UUID id);
}
