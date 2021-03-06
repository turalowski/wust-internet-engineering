/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.34).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.Product;
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
public interface ProductsApi {

    @Operation(summary = "", description = "Creates a new product. Duplicates are not allowed", tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "product response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Product> addProduct(@Parameter(in = ParameterIn.DEFAULT, description = "Add product", required=true, schema=@Schema()) @Valid @RequestBody Product body);


    @Operation(summary = "", description = "deletes a single product based on the ID supplied", tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "product response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/products/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Item> deleteProduct(@Parameter(in = ParameterIn.PATH, description = "ID of product to delete", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoints are related with the products model of the application.", tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "product response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Product.class))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/products/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Product> getProduct(@Parameter(in = ParameterIn.PATH, description = "ID of product to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "", description = "This endpoint returns all products from the database.", tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Returns list of products.", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Product.class)))),
        
        @ApiResponse(responseCode = "200", description = "This is default error response for the endpoint. For different error codes, different error messages will be generated.", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> getProducts(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "price", required = false) BigDecimal price, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "unitOfMeasurement", required = false) String unitOfMeasurement, @Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name);


    @Operation(summary = "", description = "Update product", tags={ "products" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "product response", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Item.class))),
        
        @ApiResponse(responseCode = "200", description = "unexpected error", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorModel.class))) })
    @RequestMapping(value = "/products/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Item> updateProduct(@Parameter(in = ParameterIn.PATH, description = "ID of product to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id);

}

