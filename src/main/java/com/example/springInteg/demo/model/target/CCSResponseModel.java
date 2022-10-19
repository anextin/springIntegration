package com.example.springInteg.demo.model.target;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)

@JsonPropertyOrder({
    "resultCode",
    "resultMessage",
    "fastDiscountId"
})
@Generated("jsonschema2pojo")
public class CCSResponseModel {



    @JsonProperty("resultCode")
    private String resultCode;
    @JsonProperty("resultMessage")
    private String resultMessage;
    @JsonProperty("fastDiscountId")
    private List<FastDiscountIDList> fastDiscountId = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("resultCode")
    public String getResultCode() {
        return resultCode;
    }

    @JsonProperty("resultCode")
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    @JsonProperty("resultMessage")
    public String getResultMessage() {
        return resultMessage;
    }

    @JsonProperty("resultMessage")
    public void setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
    }

    @JsonProperty("fastDiscountId")
    public List<FastDiscountIDList> getFastDiscountId() {
        return fastDiscountId;
    }

    @JsonProperty("fastDiscountId")
    public void setFastDiscountId(List<FastDiscountIDList> fastDiscountId) {
        this.fastDiscountId = fastDiscountId;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
