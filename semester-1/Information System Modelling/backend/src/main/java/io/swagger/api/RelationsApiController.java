package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.ErrorModel;
import io.swagger.model.Item;
import io.swagger.model.Relation;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
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

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T15:15:53.592Z[GMT]")
@RestController
public class RelationsApiController implements RelationsApi {

    private static final Logger log = LoggerFactory.getLogger(RelationsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RelationsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Relation> addRelation(@Parameter(in = ParameterIn.DEFAULT, description = "Add relation", required=true, schema=@Schema()) @Valid @RequestBody Relation body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Relation>(objectMapper.readValue("{\n  \"type\" : 1,\n  \"name\" : \"Tural Hajiyev\",\n  \"position\" : \"Manager\",\n  \"company\" : \"Yachta LLC\",\n  \"phoneNumber\" : 48515513743,\n  \"email\" : \"270010@pwr.edu.pl\",\n  \"status\" : \"Active\",\n  \"description\" : \"Example Relation\"\n}", Relation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Relation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Relation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Item> deleteRelation(@Parameter(in = ParameterIn.PATH, description = "ID of relation to delete", required=true, schema=@Schema()) @PathVariable("id") Long id) {
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

    public ResponseEntity<Relation> getRelation(@Parameter(in = ParameterIn.PATH, description = "ID of relation to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Relation>(objectMapper.readValue("{\n  \"type\" : 1,\n  \"name\" : \"Tural Hajiyev\",\n  \"position\" : \"Manager\",\n  \"company\" : \"Yachta LLC\",\n  \"phoneNumber\" : 48515513743,\n  \"email\" : \"270010@pwr.edu.pl\",\n  \"status\" : \"Active\",\n  \"description\" : \"Example Relation\"\n}", Relation.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Relation>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Relation>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Relation>> getRelations(@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "type", required = false) BigDecimal type,@Parameter(in = ParameterIn.QUERY, description = "" ,schema=@Schema()) @Valid @RequestParam(value = "name", required = false) String name) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Relation>>(objectMapper.readValue("[ {\n  \"type\" : 1,\n  \"name\" : \"Tural Hajiyev\",\n  \"position\" : \"Manager\",\n  \"company\" : \"Yachta LLC\",\n  \"phoneNumber\" : 48515513743,\n  \"email\" : \"270010@pwr.edu.pl\",\n  \"status\" : \"Active\",\n  \"description\" : \"Example Relation\"\n}, {\n  \"type\" : 1,\n  \"name\" : \"Tural Hajiyev\",\n  \"position\" : \"Manager\",\n  \"company\" : \"Yachta LLC\",\n  \"phoneNumber\" : 48515513743,\n  \"email\" : \"270010@pwr.edu.pl\",\n  \"status\" : \"Active\",\n  \"description\" : \"Example Relation\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Relation>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Relation>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Item> updateRelation(@Parameter(in = ParameterIn.PATH, description = "ID of relation to fetch", required=true, schema=@Schema()) @PathVariable("id") Long id) {
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
