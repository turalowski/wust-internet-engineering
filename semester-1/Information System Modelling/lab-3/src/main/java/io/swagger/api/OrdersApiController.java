package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.Order;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T17:45:23.160Z[GMT]")
@RestController
public class OrdersApiController implements OrdersApi {

    private static final Logger log = LoggerFactory.getLogger(OrdersApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdersApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Order> addOrder(@Parameter(in = ParameterIn.DEFAULT, description = "Add order", required=true, schema=@Schema()) @Valid @RequestBody Order body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"partnerName\" : \"Second company LLC\",\n  \"stage\" : \"In delivery\",\n  \"status\" : \"Active\",\n  \"type\" : 1,\n  \"deliveryDate\" : \"01.01.2022\",\n  \"direction\" : 1,\n  \"items\" : [ {\n    \"productId\" : 1,\n    \"quantity\" : 5,\n    \"price\" : 200,\n    \"currency\" : \"PLN\"\n  } ]\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Item> deleteOrder(@Parameter(in = ParameterIn.PATH, description = "ID of order to delete", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Item>(objectMapper.readValue("{\n  \"id\" : 1\n}", Item.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Item>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Item>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Order> getOrder(@Parameter(in = ParameterIn.PATH, description = "ID of order to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"partnerName\" : \"Second company LLC\",\n  \"stage\" : \"In delivery\",\n  \"status\" : \"Active\",\n  \"type\" : 1,\n  \"deliveryDate\" : \"01.01.2022\",\n  \"direction\" : 1,\n  \"items\" : [ {\n    \"productId\" : 1,\n    \"quantity\" : 5,\n    \"price\" : 200,\n    \"currency\" : \"PLN\"\n  } ]\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Order>> getOrders(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "status", required = false) BigDecimal status,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "partnerName", required = false) String partnerName,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Order>>(objectMapper.readValue("[ {\n  \"partnerName\" : \"Second company LLC\",\n  \"stage\" : \"In delivery\",\n  \"status\" : \"Active\",\n  \"type\" : 1,\n  \"deliveryDate\" : \"01.01.2022\",\n  \"direction\" : 1,\n  \"items\" : [ {\n    \"productId\" : 1,\n    \"quantity\" : 5,\n    \"price\" : 200,\n    \"currency\" : \"PLN\"\n  } ]\n}, {\n  \"partnerName\" : \"Second company LLC\",\n  \"stage\" : \"In delivery\",\n  \"status\" : \"Active\",\n  \"type\" : 1,\n  \"deliveryDate\" : \"01.01.2022\",\n  \"direction\" : 1,\n  \"items\" : [ {\n    \"productId\" : 1,\n    \"quantity\" : 5,\n    \"price\" : 200,\n    \"currency\" : \"PLN\"\n  } ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Order>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Order>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Item> updateOrder(@Parameter(in = ParameterIn.PATH, description = "ID of order to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Item>(objectMapper.readValue("{\n  \"id\" : 1\n}", Item.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Item>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Item>(HttpStatus.NOT_IMPLEMENTED);
    }

}
