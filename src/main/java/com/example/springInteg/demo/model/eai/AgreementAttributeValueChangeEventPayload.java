
package com.example.springInteg.demo.model.eai;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * The event data structure
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-19T08:51:48.657Z")
public class AgreementAttributeValueChangeEventPayload {
  @JsonProperty("agreement")
  private Agreement agreement = null;

  public AgreementAttributeValueChangeEventPayload agreement(Agreement agreement) {
    this.agreement = agreement;
    return this;
  }

   /**
   * The involved resource data for the event
   * @return agreement
  **/
  @ApiModelProperty(value = "The involved resource data for the event")
  public Agreement getAgreement() {
    return agreement;
  }

  public void setAgreement(Agreement agreement) {
    this.agreement = agreement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementAttributeValueChangeEventPayload agreementAttributeValueChangeEventPayload = (AgreementAttributeValueChangeEventPayload) o;
    return Objects.equals(this.agreement, agreementAttributeValueChangeEventPayload.agreement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreement);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementAttributeValueChangeEventPayload {\n");
    
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
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

