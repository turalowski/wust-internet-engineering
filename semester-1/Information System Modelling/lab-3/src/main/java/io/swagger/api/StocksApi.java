/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.Stock;
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
public interface StocksApi {

    @Operation(summary = "", description = "Creates a new stock. Duplicates are not allowed", tags={ "stocks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "stock response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Stock.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/stocks",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Stock> addStock(@Parameter(in = ParameterIn.DEFAULT, description = "Add stock", required=true, schema=@Schema()) @Valid @RequestBody Stock body);


    @Operation(summary = "", description = "deletes a single stock based on the ID supplied", tags={ "stocks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "stock response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/stocks/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Item> deleteStock(@Parameter(in = ParameterIn.PATH, description = "ID of stock to delete", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoints are related with the stocks model of the application.", tags={ "stocks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "stock response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Stock.class))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/stocks/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Stock> getStock(@Parameter(in = ParameterIn.PATH, description = "ID of stock to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoint returns all stocks from the database.", tags={ "stocks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns list of stocks.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Stock.class)))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/stocks",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Stock>> getStocks(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "responsiblePerson", required = false) String responsiblePerson, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name);


    @Operation(summary = "", description = "Update stock", tags={ "stocks" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "stock response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/stocks/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Item> updateStock(@Parameter(in = ParameterIn.PATH, description = "ID of stock to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);

}

