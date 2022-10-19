
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
public class AgreementSpecificationDeleteEventPayload {
  @JsonProperty("agreementSpecification")
  private AgreementSpecification agreementSpecification = null;

  public AgreementSpecificationDeleteEventPayload agreementSpecification(AgreementSpecification agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
    return this;
  }

   /**
   * The involved resource data for the event
   * @return agreementSpecification
  **/
  @ApiModelProperty(value = "The involved resource data for the event")
  public AgreementSpecification getAgreementSpecification() {
    return agreementSpecification;
  }

  public void setAgreementSpecification(AgreementSpecification agreementSpecification) {
    this.agreementSpecification = agreementSpecification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementSpecificationDeleteEventPayload agreementSpecificationDeleteEventPayload = (AgreementSpecificationDeleteEventPayload) o;
    return Objects.equals(this.agreementSpecification, agreementSpecificationDeleteEventPayload.agreementSpecification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementSpecification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementSpecificationDeleteEventPayload {\n");
    
    sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
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

