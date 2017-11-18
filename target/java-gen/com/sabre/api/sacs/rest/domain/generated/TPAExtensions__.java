
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
    "FareCalcLine"
})
public class TPAExtensions__ {

    @JsonProperty("FareCalcLine")
    private com.sabre.api.sacs.rest.domain.generated.FareCalcLine FareCalcLine;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FareCalcLine
     */
    @JsonProperty("FareCalcLine")
    public com.sabre.api.sacs.rest.domain.generated.FareCalcLine getFareCalcLine() {
        return FareCalcLine;
    }

    /**
     * 
     * @param FareCalcLine
     *     The FareCalcLine
     */
    @JsonProperty("FareCalcLine")
    public void setFareCalcLine(com.sabre.api.sacs.rest.domain.generated.FareCalcLine FareCalcLine) {
        this.FareCalcLine = FareCalcLine;
    }

    public TPAExtensions__ withFareCalcLine(com.sabre.api.sacs.rest.domain.generated.FareCalcLine FareCalcLine) {
        this.FareCalcLine = FareCalcLine;
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

    public TPAExtensions__ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(FareCalcLine).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions__) == false) {
            return false;
        }
        TPAExtensions__ rhs = ((TPAExtensions__) other);
        return new EqualsBuilder().append(FareCalcLine, rhs.FareCalcLine).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
