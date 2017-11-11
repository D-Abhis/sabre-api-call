
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
    "PTC_FareBreakdown"
})
public class PTCFareBreakdowns {

    @JsonProperty("PTC_FareBreakdown")
    private List<com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdown> PTCFareBreakdown = new ArrayList<com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdown>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PTCFareBreakdown
     */
    @JsonProperty("PTC_FareBreakdown")
    public List<com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdown> getPTCFareBreakdown() {
        return PTCFareBreakdown;
    }

    /**
     * 
     * @param PTCFareBreakdown
     *     The PTC_FareBreakdown
     */
    @JsonProperty("PTC_FareBreakdown")
    public void setPTCFareBreakdown(List<com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdown> PTCFareBreakdown) {
        this.PTCFareBreakdown = PTCFareBreakdown;
    }

    public PTCFareBreakdowns withPTCFareBreakdown(List<com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdown> PTCFareBreakdown) {
        this.PTCFareBreakdown = PTCFareBreakdown;
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

    public PTCFareBreakdowns withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(PTCFareBreakdown).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PTCFareBreakdowns) == false) {
            return false;
        }
        PTCFareBreakdowns rhs = ((PTCFareBreakdowns) other);
        return new EqualsBuilder().append(PTCFareBreakdown, rhs.PTCFareBreakdown).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
