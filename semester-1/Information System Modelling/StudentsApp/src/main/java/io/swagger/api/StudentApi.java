/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.25).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Student;
import io.swagger.model.Students;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-24T23:01:48.272Z[GMT]")
@Validated
public interface StudentApi {

    @Operation(summary = "add a new student", description = "", security = {
        @SecurityRequirement(name = "persistdata_auth", scopes = {
            "write:students",
"read:students"        })    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student added", content = @Content(schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/student",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.POST)
    ResponseEntity<Student> addStudent(@Parameter(in = ParameterIn.DEFAULT, description = "Record object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Student body);


    @Operation(summary = "delete a student by rollNo", description = "", security = {
        @SecurityRequirement(name = "persistdata_auth", scopes = {
            "write:students",
"read:students"        })    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid rollNo supplied"),
        
        @ApiResponse(responseCode = "404", description = "Student not found") })
    @RequestMapping(value = "/student/{rollNo}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Student> deleteStudentByRollNo(@Parameter(in = ParameterIn.PATH, description = "Numeric ID of the user to get.", required=true, schema=@Schema()) @PathVariable("rollNo") Long rollNo);


    @Operation(summary = "find all students", description = "", security = {
        @SecurityRequirement(name = "persistdata_auth", scopes = {
            "write:students",
"read:students"        })    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Students.class))) })
    @RequestMapping(value = "/student",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Students> findAllStudents();


    @Operation(summary = "find a student by rollNo", description = "", security = {
        @SecurityRequirement(name = "persistdata_auth", scopes = {
            "write:students",
"read:students"        })    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "successful operation", content = @Content(schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "400", description = "Invalid rollNo supplied"),
        
        @ApiResponse(responseCode = "404", description = "Student not found") })
    @RequestMapping(value = "/student/{rollNo}",
        produces = { "application/json", "application/xml" }, 
        method = RequestMethod.GET)
    ResponseEntity<Student> findStudentByRollNo(@Parameter(in = ParameterIn.PATH, description = "Numeric ID of the user to get.", required=true, schema=@Schema()) @PathVariable("rollNo") Long rollNo);


    @Operation(summary = "update an existing student", description = "", security = {
        @SecurityRequirement(name = "persistdata_auth", scopes = {
            "write:students",
"read:students"        })    }, tags={ "student" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Student updated", content = @Content(schema = @Schema(implementation = Student.class))),
        
        @ApiResponse(responseCode = "404", description = "Student not found"),
        
        @ApiResponse(responseCode = "405", description = "Validation exception") })
    @RequestMapping(value = "/student",
        produces = { "application/json", "application/xml" }, 
        consumes = { "application/json", "application/xml" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Student> updateStudent(@Parameter(in = ParameterIn.DEFAULT, description = "Student object that needs to be added to the store", required=true, schema=@Schema()) @Valid @RequestBody Student body);

}

