package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.NewItem;
import io.swagger.model.User;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GetUser
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-12T21:10:43.629Z[GMT]")


public class GetUser extends NewItem  {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("fullName")
  private String fullName = null;

  @JsonProperty("companyName")
  private String companyName = null;

  @JsonProperty("employee_count")
  private BigDecimal employeeCount = null;

  @JsonProperty("description")
  private String description = null;

  public GetUser email(String email) {
    this.email = email;
    return this;
  }

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

  public GetUser fullName(String fullName) {
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

  public GetUser companyName(String companyName) {
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

  public GetUser employeeCount(BigDecimal employeeCount) {
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

  public GetUser description(String description) {
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
    GetUser getUser = (GetUser) o;
    return Objects.equals(this.email, getUser.email) &&
        Objects.equals(this.fullName, getUser.fullName) &&
        Objects.equals(this.companyName, getUser.companyName) &&
        Objects.equals(this.employeeCount, getUser.employeeCount) &&
        Objects.equals(this.description, getUser.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, fullName, companyName, employeeCount, description, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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
