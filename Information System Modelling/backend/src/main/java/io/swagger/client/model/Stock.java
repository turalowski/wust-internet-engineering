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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
/**
 * Stock
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-04-03T23:35:29.473682+02:00[Europe/Warsaw]")
public class Stock {
  @SerializedName("name")
  private String name = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("responsiblePerson")
  private String responsiblePerson = null;

  @SerializedName("description")
  private String description = null;

  public Stock name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Stock location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @Schema(required = true, description = "")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Stock size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * Get size
   * @return size
  **/
  @Schema(required = true, description = "")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public Stock responsiblePerson(String responsiblePerson) {
    this.responsiblePerson = responsiblePerson;
    return this;
  }

   /**
   * Get responsiblePerson
   * @return responsiblePerson
  **/
  @Schema(required = true, description = "")
  public String getResponsiblePerson() {
    return responsiblePerson;
  }

  public void setResponsiblePerson(String responsiblePerson) {
    this.responsiblePerson = responsiblePerson;
  }

  public Stock description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stock stock = (Stock) o;
    return Objects.equals(this.name, stock.name) &&
        Objects.equals(this.location, stock.location) &&
        Objects.equals(this.size, stock.size) &&
        Objects.equals(this.responsiblePerson, stock.responsiblePerson) &&
        Objects.equals(this.description, stock.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, location, size, responsiblePerson, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stock {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    responsiblePerson: ").append(toIndentedString(responsiblePerson)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}