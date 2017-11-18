
package com.sabre.api.sacs.rest.domain.generated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "BaggageInformation"
})
public class BaggageInformationList {

    @JsonProperty("BaggageInformation")
    private List<com.sabre.api.sacs.rest.domain.generated.BaggageInformation> BaggageInformation = new ArrayList<com.sabre.api.sacs.rest.domain.generated.BaggageInformation>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BaggageInformation
     */
    @JsonProperty("BaggageInformation")
    public List<com.sabre.api.sacs.rest.domain.generated.BaggageInformation> getBaggageInformation() {
        return BaggageInformation;
    }

    /**
     * 
     * @param BaggageInformation
     *     The BaggageInformation
     */
    @JsonProperty("BaggageInformation")
    public void setBaggageInformation(List<com.sabre.api.sacs.rest.domain.generated.BaggageInformation> BaggageInformation) {
        this.BaggageInformation = BaggageInformation;
    }

    public BaggageInformationList withBaggageInformation(List<com.sabre.api.sacs.rest.domain.generated.BaggageInformation> BaggageInformation) {
        this.BaggageInformation = BaggageInformation;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public BaggageInformationList withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BaggageInformation).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaggageInformationList) == false) {
            return false;
        }
        BaggageInformationList rhs = ((BaggageInformationList) other);
        return new EqualsBuilder().append(BaggageInformation, rhs.BaggageInformation).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
