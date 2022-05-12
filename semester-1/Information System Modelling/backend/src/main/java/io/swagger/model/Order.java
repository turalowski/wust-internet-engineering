package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.OrderItems;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Order
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-12T21:10:43.629Z[GMT]")


public class Order   {
  @JsonProperty("partnerName")
  private String partnerName = null;

  @JsonProperty("stage")
  private BigDecimal stage = null;

  @JsonProperty("status")
  private BigDecimal status = null;

  @JsonProperty("type")
  private BigDecimal type = null;

  @JsonProperty("deliveryDate")
  private String deliveryDate = null;

  @JsonProperty("direction")
  private BigDecimal direction = null;

  @JsonProperty("items")
  @Valid
  private List<OrderItems> items = new ArrayList<OrderItems>();

  public Order partnerName(String partnerName) {
    this.partnerName = partnerName;
    return this;
  }

  /**
   * Get partnerName
   * @return partnerName
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPartnerName() {
    return partnerName;
  }

  public void setPartnerName(String partnerName) {
    this.partnerName = partnerName;
  }

  public Order stage(BigDecimal stage) {
    this.stage = stage;
    return this;
  }

  /**
   * Get stage
   * @return stage
   **/
  @Schema(description = "")
  
    @Valid
    public BigDecimal getStage() {
    return stage;
  }

  public void setStage(BigDecimal stage) {
    this.stage = stage;
  }

  public Order status(BigDecimal status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getStatus() {
    return status;
  }

  public void setStatus(BigDecimal status) {
    this.status = status;
  }

  public Order type(BigDecimal type) {
    this.type = type;
    return this;
  }

  /**
   * Type of order. 1 for purchase, 2 for rent
   * @return type
   **/
  @Schema(description = "Type of order. 1 for purchase, 2 for rent")
  
    @Valid
    public BigDecimal getType() {
    return type;
  }

  public void setType(BigDecimal type) {
    this.type = type;
  }

  public Order deliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
    return this;
  }

  /**
   * Direction of order. If seller is the tenant 1, else 2
   * @return deliveryDate
   **/
  @Schema(required = true, description = "Direction of order. If seller is the tenant 1, else 2")
      @NotNull

    public String getDeliveryDate() {
    return deliveryDate;
  }

  public void setDeliveryDate(String deliveryDate) {
    this.deliveryDate = deliveryDate;
  }

  public Order direction(BigDecimal direction) {
    this.direction = direction;
    return this;
  }

  /**
   * Get direction
   * @return direction
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public BigDecimal getDirection() {
    return direction;
  }

  public void setDirection(BigDecimal direction) {
    this.direction = direction;
  }

  public Order items(List<OrderItems> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(OrderItems itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

  /**
   * Get items
   * @return items
   **/
  @Schema(required = true, description = "")
      @NotNull
    @Valid
    public List<OrderItems> getItems() {
    return items;
  }

  public void setItems(List<OrderItems> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.partnerName, order.partnerName) &&
        Objects.equals(this.stage, order.stage) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.type, order.type) &&
        Objects.equals(this.deliveryDate, order.deliveryDate) &&
        Objects.equals(this.direction, order.direction) &&
        Objects.equals(this.items, order.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(partnerName, stage, status, type, deliveryDate, direction, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    partnerName: ").append(toIndentedString(partnerName)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deliveryDate: ").append(toIndentedString(deliveryDate)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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
