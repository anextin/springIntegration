/*
 * FastDiscount
 * This is Swagger UI environment generated for the TMF Product Ordering Management specification
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.springInteg.demo.model.eai;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * The event data structure
 */
@ApiModel(description = "The event data structure")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-08T07:10:30.175Z")
public class ProductOrderStateChangeEventPayload {
  @JsonProperty("productOrder")
  private ProductOrder productOrder = null;

  public ProductOrderStateChangeEventPayload productOrder(ProductOrder productOrder) {
    this.productOrder = productOrder;
    return this;
  }

   /**
   * The involved resource data for the event
   * @return productOrder
  **/
  @ApiModelProperty(value = "The involved resource data for the event")
  public ProductOrder getProductOrder() {
    return productOrder;
  }

  public void setProductOrder(ProductOrder productOrder) {
    this.productOrder = productOrder;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOrderStateChangeEventPayload productOrderStateChangeEventPayload = (ProductOrderStateChangeEventPayload) o;
    return Objects.equals(this.productOrder, productOrderStateChangeEventPayload.productOrder);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOrder);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOrderStateChangeEventPayload {\n");
    
    sb.append("    productOrder: ").append(toIndentedString(productOrder)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

