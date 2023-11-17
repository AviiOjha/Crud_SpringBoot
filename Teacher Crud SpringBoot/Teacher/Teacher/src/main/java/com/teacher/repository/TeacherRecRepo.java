package com.teacher.repository;

import com.teacher.entities.TeacherRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRecRepo extends JpaRepository<TeacherRec, Integer> {
}
