package com.umut.demo_umut.dao;

import com.umut.demo_umut.entity.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SchoolRepository extends JpaRepository<School, UUID> {
}
