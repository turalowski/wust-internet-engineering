package io.swagger.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import io.swagger.model.Student;

public interface StudentService {
    public Student addStudent(Student student);
    public Student deleteStudentByRollNo(long rollNo);
	public List<Student> findAllStudents();
	public Student updateStudent(Student student);
	//@Cacheable ("students")
	public Student findStudentByRollNo(long id);
}
