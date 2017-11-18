
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
    "GMTOffset"
})
public class ArrivalTimeZone {

    @JsonProperty("GMTOffset")
    private Double GMTOffset;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The GMTOffset
     */
    @JsonProperty("GMTOffset")
    public Double getGMTOffset() {
        return GMTOffset;
    }

    /**
     * 
     * @param GMTOffset
     *     The GMTOffset
     */
    @JsonProperty("GMTOffset")
    public void setGMTOffset(Double GMTOffset) {
        this.GMTOffset = GMTOffset;
    }

    public ArrivalTimeZone withGMTOffset(Double GMTOffset) {
        this.GMTOffset = GMTOffset;
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

    public ArrivalTimeZone withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(GMTOffset).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArrivalTimeZone) == false) {
            return false;
        }
        ArrivalTimeZone rhs = ((ArrivalTimeZone) other);
        return new EqualsBuilder().append(GMTOffset, rhs.GMTOffset).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
