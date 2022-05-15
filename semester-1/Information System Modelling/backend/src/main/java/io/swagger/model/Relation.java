package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Relation
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T15:15:53.592Z[GMT]")


public class Relation   {
  @JsonProperty("type")
  private BigDecimal type = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("position")
  private String position = null;

  @JsonProperty("company")
  private String company = null;

  @JsonProperty("phoneNumber")
  private String phoneNumber = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("website")
  private String website = null;

  @JsonProperty("voen")
  private String voen = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("manager")
  private String manager = null;

  @JsonProperty("description")
  private String description = null;

  public Relation type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * Type of relation. 1 for Person, 2 for Legal entity.
   * @return type
   **/
  @Schema(required = true, description = "Type of relation. 1 for Person, 2 for Legal entity.")
      @NotNull

    @Valid
    public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public Relation name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Relation position(String position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public Relation company(String company) {
    this.company = company;
    return this;
  }

  /**
   * Get company
   * @return company
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Relation phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * Get phoneNumber
   * @return phoneNumber
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Relation email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Relation website(String website) {
    this.website = website;
    return this;
  }

  /**
   * Get website
   * @return website
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Relation voen(String voen) {
    this.voen = voen;
    return this;
  }

  /**
   * Get voen
   * @return voen
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getVoen() {
    return voen;
  }

  public void setVoen(String voen) {
    this.voen = voen;
  }

  public Relation address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Relation status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the relation. 1 for Active, 2 for Deactive
   * @return status
   **/
  @Schema(required = true, description = "Status of the relation. 1 for Active, 2 for Deactive")
      @NotNull

    @Valid
    public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Relation manager(String manager) {
    this.manager = manager;
    return this;
  }

  /**
   * Get manager
   * @return manager
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public Relation description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Information about the relation.
   * @return description
   **/
  @Schema(required = true, description = "Information about the relation.")
      @NotNull

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
    Relation relation = (Relation) o;
    return Objects.equals(this.type, relation.type) &&
        Objects.equals(this.name, relation.name) &&
        Objects.equals(this.position, relation.position) &&
        Objects.equals(this.company, relation.company) &&
        Objects.equals(this.phoneNumber, relation.phoneNumber) &&
        Objects.equals(this.email, relation.email) &&
        Objects.equals(this.website, relation.website) &&
        Objects.equals(this.voen, relation.voen) &&
        Objects.equals(this.address, relation.address) &&
        Objects.equals(this.status, relation.status) &&
        Objects.equals(this.manager, relation.manager) &&
        Objects.equals(this.description, relation.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, position, company, phoneNumber, email, website, voen, address, status, manager, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Relation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    website: ").append(toIndentedString(website)).append("\n");
    sb.append("    voen: ").append(toIndentedString(voen)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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
