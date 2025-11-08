package com.placementprephub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.placementprephub.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}