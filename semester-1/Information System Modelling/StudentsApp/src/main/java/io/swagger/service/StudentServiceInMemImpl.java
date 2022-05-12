package io.swagger.service;

import java.util.List;

import io.swagger.model.Student;
import io.swagger.model.Students;
// Just to show how to implement storage in a memory
public class StudentServiceInMemImpl implements StudentService {
   private static Students sts = new Students();
   private static long rollNo = 0;
	@Override
	public Student addStudent(Student student) {
		student.setRollNo(rollNo++);
		sts.add(student);
		return student;
	}

	@Override
	public Student deleteStudentByRollNo(long rollNo) {
		Student result = findStudentByRollNo(rollNo);
		if (result !=null) {
			sts.remove(result);
	    }
		//sts.removeIf(x ->{ return x.getRollNo()== rollNo;});
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public List<Student> findAllStudents() {
		return sts;
	}

	@Override
	public Student updateStudent(Student student) {
	    System.out.println(student);
		Student result = findStudentByRollNo(student.getRollNo());
		if (result !=null) {
				result.setName(student.getName());
				result.setSurname(student.getSurname());
				}
		//sts.removeIf(x ->{ return x.getRollNo()== rollNo;});
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public Student findStudentByRollNo(long id) {
		Student result = null;
		for(Student s : sts)
			if (s.getRollNo() == id) {
				result = s;
				break;
			}
		return result;
	}
}
