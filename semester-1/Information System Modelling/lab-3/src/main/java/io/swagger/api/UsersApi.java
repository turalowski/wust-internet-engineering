/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.User;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T17:45:23.160Z[GMT]")
@Validated
public interface UsersApi {

    @Operation(summary = "", description = "Creates a new user. Duplicates are not allowed", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "user response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<User> addUser(@Parameter(in = ParameterIn.DEFAULT, description = "Add user", required=true, schema=@Schema()) @Valid @RequestBody User body);


    @Operation(summary = "", description = "deletes a single user based on the ID supplied", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "user response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/users/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<User> deleteUser(@Parameter(in = ParameterIn.PATH, description = "ID of user to delete", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoints are related with the Users model of the application.", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "User response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = User.class))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/users/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<User> getUser(@Parameter(in = ParameterIn.PATH, description = "ID of user to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoint returns all Users from the database.", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns list of users.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = User.class)))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<User>> getUsers(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "email", required = false) String email, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "fullName", required = false) String fullName, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "companyName", required = false) String companyName, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "employeeCount", required = false) BigDecimal employeeCount);


    @Operation(summary = "", description = "Update user", tags={ "users" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "user response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/users/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<User> updateUser(@Parameter(in = ParameterIn.PATH, description = "ID of user to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id, @RequestBody User body);

}

