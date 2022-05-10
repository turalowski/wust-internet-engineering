/*
 * Surfing/kiting spot
 * Restful API for management of Surfing/kitting spot.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import java.math.BigDecimal;
import io.swagger.client.model.ErrorModel;
import io.swagger.client.model.GetRelation;
import io.swagger.client.model.Item;
import io.swagger.client.model.NewItem;
import io.swagger.client.model.Relation;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for RelationsApi
 */
@Ignore
public class RelationsApiTest {

    private final RelationsApi api = new RelationsApi();

    /**
     * 
     *
     * Creates a new relation. Duplicates are not allowed
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addRelationTest() throws Exception {
        Relation body = null;
        NewItem response = api.addRelation(body);

        // TODO: test validations
    }
    /**
     * 
     *
     * deletes a single relation based on the ID supplied
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteRelationTest() throws Exception {
        Long id = null;
        Item response = api.deleteRelation(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * This endpoints are related with the relations model of the application.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRelationTest() throws Exception {
        Long id = null;
        GetRelation response = api.getRelation(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * This endpoint returns all relations from the database.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRelationsTest() throws Exception {
        BigDecimal type = null;
        String name = null;
        List<GetRelation> response = api.getRelations(type, name);

        // TODO: test validations
    }
    /**
     * 
     *
     * Update relation
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updateRelationTest() throws Exception {
        Long id = null;
        Item response = api.updateRelation(id);

        // TODO: test validations
    }
}