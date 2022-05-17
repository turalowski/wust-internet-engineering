package io.swagger.api;

import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.Stock;
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
public class StocksApiController implements StocksApi {

    private static final Logger log = LoggerFactory.getLogger(StocksApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public StocksApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Stock> addStock(@Parameter(in = ParameterIn.DEFAULT, description = "Add stock", required=true, schema=@Schema()) @Valid @RequestBody Stock body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Stock>(objectMapper.readValue("{\n  \"name\" : \"Stock N1\",\n  \"location\" : \"Wroclaw, Poland\",\n  \"size\" : 200,\n  \"responsiblePerson\" : \"Tural Hajiyev\",\n  \"description\" : \"It's example stock\"\n}", Stock.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Stock>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Stock>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Item> deleteStock(@Parameter(in = ParameterIn.PATH, description = "ID of stock to delete", required=true, schema=@Schema()) @PathVariable("id") Long id) {
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

    public ResponseEntity<Stock> getStock(@Parameter(in = ParameterIn.PATH, description = "ID of stock to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Stock>(objectMapper.readValue("{\n  \"name\" : \"Stock N1\",\n  \"location\" : \"Wroclaw, Poland\",\n  \"size\" : 200,\n  \"responsiblePerson\" : \"Tural Hajiyev\",\n  \"description\" : \"It's example stock\"\n}", Stock.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Stock>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Stock>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Stock>> getStocks(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "responsiblePerson", required = false) String responsiblePerson,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Stock>>(objectMapper.readValue("[ {\n  \"name\" : \"Stock N1\",\n  \"location\" : \"Wroclaw, Poland\",\n  \"size\" : 200,\n  \"responsiblePerson\" : \"Tural Hajiyev\",\n  \"description\" : \"It's example stock\"\n}, {\n  \"name\" : \"Stock N1\",\n  \"location\" : \"Wroclaw, Poland\",\n  \"size\" : 200,\n  \"responsiblePerson\" : \"Tural Hajiyev\",\n  \"description\" : \"It's example stock\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Stock>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Stock>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Item> updateStock(@Parameter(in = ParameterIn.PATH, description = "ID of stock to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id) {
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
