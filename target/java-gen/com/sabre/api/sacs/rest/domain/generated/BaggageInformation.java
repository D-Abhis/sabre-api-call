
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
    "Segment",
    "Allowance"
})
public class BaggageInformation {

    @JsonProperty("Segment")
    private List<com.sabre.api.sacs.rest.domain.generated.Segment> Segment = new ArrayList<com.sabre.api.sacs.rest.domain.generated.Segment>();
    @JsonProperty("Allowance")
    private com.sabre.api.sacs.rest.domain.generated.Allowance Allowance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Segment
     */
    @JsonProperty("Segment")
    public List<com.sabre.api.sacs.rest.domain.generated.Segment> getSegment() {
        return Segment;
    }

    /**
     * 
     * @param Segment
     *     The Segment
     */
    @JsonProperty("Segment")
    public void setSegment(List<com.sabre.api.sacs.rest.domain.generated.Segment> Segment) {
        this.Segment = Segment;
    }

    public BaggageInformation withSegment(List<com.sabre.api.sacs.rest.domain.generated.Segment> Segment) {
        this.Segment = Segment;
        return this;
    }

    /**
     * 
     * @return
     *     The Allowance
     */
    @JsonProperty("Allowance")
    public com.sabre.api.sacs.rest.domain.generated.Allowance getAllowance() {
        return Allowance;
    }

    /**
     * 
     * @param Allowance
     *     The Allowance
     */
    @JsonProperty("Allowance")
    public void setAllowance(com.sabre.api.sacs.rest.domain.generated.Allowance Allowance) {
        this.Allowance = Allowance;
    }

    public BaggageInformation withAllowance(com.sabre.api.sacs.rest.domain.generated.Allowance Allowance) {
        this.Allowance = Allowance;
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

    public BaggageInformation withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Segment).append(Allowance).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaggageInformation) == false) {
            return false;
        }
        BaggageInformation rhs = ((BaggageInformation) other);
        return new EqualsBuilder().append(Segment, rhs.Segment).append(Allowance, rhs.Allowance).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
