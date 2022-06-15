package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;

import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlRootElement;
import javax.persistence.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T17:45:23.160Z[GMT]")
@XmlRootElement(name = "User")
@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)	
  @JsonProperty("id")
  private Long id;
  
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("employeeCount")
  private BigDecimal employeeCount = null;

  @JsonProperty("description")
  private String description = null;


  /**
   * Email of the user
   * @return email
   **/
  @Schema(required = true, description = "Email of the user")
      @NotNull

    public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User fullName(String fullName) {
    this.fullName = fullName;
    return this;
  }

  /**
   * Full name of the user
   * @return fullName
   **/
  @Schema(required = true, description = "Full name of the user")
      @NotNull

    public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public User companyName(String companyName) {
    this.companyName = companyName;
    return this;
  }

  /**
   * Company name of the user
   * @return companyName
   **/
  @Schema(required = true, description = "Company name of the user")
      @NotNull

    public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public User employeeCount(BigDecimal employeeCount) {
    this.employeeCount = employeeCount;
    return this;
  }

  /**
   * Employee count of the company
   * @return employeeCount
   **/
  @Schema(required = true, description = "Employee count of the company")
      @NotNull

    @Valid
    public BigDecimal getEmployeeCount() {
    return employeeCount;
  }

  public void setEmployeeCount(BigDecimal employeeCount) {
    this.employeeCount = employeeCount;
  }

  public User description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(required = true, description = "")
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
    User user = (User) o;
    return Objects.equals(this.email, user.email) &&
        Objects.equals(this.fullName, user.fullName) &&
        Objects.equals(this.companyName, user.companyName) &&
        Objects.equals(this.employeeCount, user.employeeCount) &&
        Objects.equals(this.description, user.description) &&
        Objects.equals(this.id, user.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, email, fullName, companyName, employeeCount, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
    sb.append("    employeeCount: ").append(toIndentedString(employeeCount)).append("\n");
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
