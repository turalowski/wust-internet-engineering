package io.swagger.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import io.swagger.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
	@Modifying
	@Query("update Student s set s.name = ?1, s.surname = ?2 where s.rollNo = ?3")
	void updateStudentById(String name, String surname, Long rollNo);
}
