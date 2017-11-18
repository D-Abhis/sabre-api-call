
package com.sabre.api.sacs.rest.domain.generated;

import java.util.HashMap;
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
    "Number",
    "BelowMin"
})
public class SeatsRemaining {

    @JsonProperty("Number")
    private Integer Number;
    @JsonProperty("BelowMin")
    private Boolean BelowMin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Number
     */
    @JsonProperty("Number")
    public Integer getNumber() {
        return Number;
    }

    /**
     * 
     * @param Number
     *     The Number
     */
    @JsonProperty("Number")
    public void setNumber(Integer Number) {
        this.Number = Number;
    }

    public SeatsRemaining withNumber(Integer Number) {
        this.Number = Number;
        return this;
    }

    /**
     * 
     * @return
     *     The BelowMin
     */
    @JsonProperty("BelowMin")
    public Boolean getBelowMin() {
        return BelowMin;
    }

    /**
     * 
     * @param BelowMin
     *     The BelowMin
     */
    @JsonProperty("BelowMin")
    public void setBelowMin(Boolean BelowMin) {
        this.BelowMin = BelowMin;
    }

    public SeatsRemaining withBelowMin(Boolean BelowMin) {
        this.BelowMin = BelowMin;
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

    public SeatsRemaining withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Number).append(BelowMin).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SeatsRemaining) == false) {
            return false;
        }
        SeatsRemaining rhs = ((SeatsRemaining) other);
        return new EqualsBuilder().append(Number, rhs.Number).append(BelowMin, rhs.BelowMin).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
