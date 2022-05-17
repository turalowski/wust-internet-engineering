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
 * OrderItems
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-15T17:45:23.160Z[GMT]")


public class OrderItems   {
  @JsonProperty("productId")
  private BigDecimal productId = null;

  @JsonProperty("quantity")
  private BigDecimal quantity = null;

  @JsonProperty("price")
  private BigDecimal price = null;

  @JsonProperty("currency")
  private String currency = null;

  public OrderItems productId(BigDecimal productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getProductId() {
    return productId;
  }

  public void setProductId(BigDecimal productId) {
    this.productId = productId;
  }

  public OrderItems quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public OrderItems price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public OrderItems currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   **/
  @Schema(description = "")
  
    public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderItems orderItems = (OrderItems) o;
    return Objects.equals(this.productId, orderItems.productId) &&
        Objects.equals(this.quantity, orderItems.quantity) &&
        Objects.equals(this.price, orderItems.price) &&
        Objects.equals(this.currency, orderItems.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, quantity, price, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItems {\n");
    
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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
