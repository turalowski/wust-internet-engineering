package io.swagger.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {
		return studentRepository.save(student);
	}	

	@Override
	public Student deleteStudentByRollNo(long id) {
		Optional<Student> os = studentRepository.findById(id);
		if(os.isPresent()) studentRepository.deleteById(id);
		return os.get();
	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student findStudentByRollNo(long id) {
		Optional<Student> os = studentRepository.findById(id);
		if(os.isPresent()) return os.get();
		else return null;
	}

	@Override
	public Student updateStudent(Student student) {
		studentRepository.updateStudentById(student.getName(), student.getSurname(), student.getRollNo());
		return student;
//// if you want to check rollNo first:
//		Optional<Student> os = studentRepository.findById(student.getRollNo());
//		if(os.isPresent())
//		{ os.get().setName(student.getName());
//		  os.get().setSurname(student.getSurname());
//		  studentRepository.save(os.get());
//		  return os.get();}
//		else return null;
		
	}
}
