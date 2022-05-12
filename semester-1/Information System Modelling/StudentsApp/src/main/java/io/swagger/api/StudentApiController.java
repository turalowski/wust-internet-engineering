package io.swagger.api;

import io.swagger.model.Student;
import io.swagger.model.Students;
import io.swagger.service.StudentService;
import io.swagger.service.StudentServiceInMemImpl;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-24T23:01:48.272Z[GMT]")
@RestController
public class StudentApiController implements StudentApi {
	@Autowired
	private StudentService studentService;
	//without DI you can create service using new on a chosen class
	//private StudentService studentService = new StudentServiceInMemImpl();
	
    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Student> addStudent(@Parameter(in = ParameterIn.DEFAULT, description = "Record object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Student body) {
        String accept = request.getHeader("Accept");
     if (accept != null && accept.contains("application/xml")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("<Student>
			// <rollNo>123456789</rollNo> <name>John</name>
			// <surname>Kowalski</surname></Student>", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/xml", e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }

			return ResponseEntity.ok(studentService.addStudent(body));

		}

		if (accept != null && accept.contains("application/json")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("{ \"surname\" :
			// \"Kowalski\", \"name\" : \"John\", \"rollNo\" : 0}", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/json",
			// e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			return ResponseEntity.ok(studentService.addStudent(body));

		}
        
        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> deleteStudentByRollNo(@Parameter(in = ParameterIn.PATH, description = "Numeric ID of the user to get.", required=true, schema=@Schema()) @PathVariable("rollNo") Long rollNo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("{ \"surname\" :
			// \"Kowalski\", \"name\" : \"John\", \"rollNo\" : 0}", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/json",
			// e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			return ResponseEntity.ok(studentService.deleteStudentByRollNo(rollNo));

		}

		if (accept != null && accept.contains("application/xml")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("<Student>
			// <rollNo>123456789</rollNo> <name>John</name>
			// <surname>Kowalski</surname></Student>", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/xml", e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			return ResponseEntity.ok(studentService.deleteStudentByRollNo(rollNo));
		}

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Students> findAllStudents() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
			// try {
			// return new ResponseEntity<List<Student>>(objectMapper.readValue(" <Student>
			// <rollNo>123456789</rollNo> <name>John</name> <surname>Kowalski</surname>
			// </Student>", List.class), HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/xml", e);
			// return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			Students sts = new Students();
			sts.addAll(studentService.findAllStudents());
			return ResponseEntity.ok(sts);
		}

		if (accept != null && accept.contains("application/json")) {
			// try {
			// return new ResponseEntity<List<Student>>(objectMapper.readValue("[ {
			// \"surname\" : \"Kowalski\", \"name\" : \"John\", \"rollNo\" : 0}, {
			// \"surname\" : \"Kowalski\", \"name\" : \"John\", \"rollNo\" : 0} ]",
			// List.class), HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/json",
			// e);
			// return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			Students sts = new Students();
			sts.addAll(studentService.findAllStudents());
			return ResponseEntity.ok(sts);
		}

        return new ResponseEntity<Students>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> findStudentByRollNo(@Parameter(in = ParameterIn.PATH, description = "Numeric ID of the user to get.", required=true, schema=@Schema()) @PathVariable("rollNo") Long rollNo) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("<Student>
			// <rollNo>123456789</rollNo> <name>John</name>
			// <surname>Kowalski</surname></Student>", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/xml", e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			Student s = studentService.findStudentByRollNo(rollNo);
			
			if (s != null)
				return ResponseEntity.ok(s);
			else 
				// return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				 return ResponseEntity.notFound().header("Reason", "MMM").build();
		}
		if (accept != null && accept.contains("application/json")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("{ \"surname\" :
			// \"Kowalski\", \"name\" : \"John\", \"rollNo\" : 0}", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/json",
			// e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			Student s = studentService.findStudentByRollNo(rollNo);
			if (s != null)
				return ResponseEntity.ok(s);
			else
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);

			/*
			 * return Optional .ofNullable( userRepository.findOne(id) ) .map( user ->
			 * ResponseEntity.ok().body(user) ) //200 OK .orElseGet( () ->
			 * ResponseEntity.notFound().build() ); //404 Not found
			 */
		}

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> updateStudent(@Parameter(in = ParameterIn.DEFAULT, description = "Student object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Student body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("<Student>
			// <rollNo>123456789</rollNo> <name>John</name>
			// <surname>Kowalski</surname></Student>", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/xml", e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			return ResponseEntity.ok(studentService.updateStudent(body));
		}

		if (accept != null && accept.contains("application/json")) {
			// try {
			// return new ResponseEntity<Student>(objectMapper.readValue("{ \"surname\" :
			// \"Kowalski\", \"name\" : \"John\", \"rollNo\" : 0}", Student.class),
			// HttpStatus.NOT_IMPLEMENTED);
			// } catch (IOException e) {
			// log.error("Couldn't serialize response for content type application/json",
			// e);
			// return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
			// }
			return ResponseEntity.ok(studentService.updateStudent(body));
		}

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

}
