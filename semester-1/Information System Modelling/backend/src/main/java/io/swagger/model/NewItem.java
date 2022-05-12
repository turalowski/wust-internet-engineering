package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Item;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NewItem
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-12T21:10:43.629Z[GMT]")


public class NewItem extends Item  {
  @JsonProperty("id")
  private BigDecimal newItemId = null;

  @JsonProperty("createdAt")
  private String createdAt = null;

  public NewItem newItemId(BigDecimal newItemId) {
    this.newItemId = newItemId;
    return this;
  }

  /**
   * Get newItemId
   * @return newItemId
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getNewItemId() {
    return newItemId;
  }

  public void setNewItemId(BigDecimal newItemId) {
    this.newItemId = newItemId;
  }

  public NewItem createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Created date
   * @return createdAt
   **/
  @Schema(required = true, description = "Created date")
      @NotNull

    public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NewItem newItem = (NewItem) o;
    return Objects.equals(this.newItemId, newItem.newItemId) &&
        Objects.equals(this.createdAt, newItem.createdAt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newItemId, createdAt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NewItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    newItemId: ").append(toIndentedString(newItemId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
