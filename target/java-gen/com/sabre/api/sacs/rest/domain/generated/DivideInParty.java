
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
    "Indicator"
})
public class DivideInParty {

    @JsonProperty("Indicator")
    private Boolean Indicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Indicator
     */
    @JsonProperty("Indicator")
    public Boolean getIndicator() {
        return Indicator;
    }

    /**
     * 
     * @param Indicator
     *     The Indicator
     */
    @JsonProperty("Indicator")
    public void setIndicator(Boolean Indicator) {
        this.Indicator = Indicator;
    }

    public DivideInParty withIndicator(Boolean Indicator) {
        this.Indicator = Indicator;
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

    public DivideInParty withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Indicator).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DivideInParty) == false) {
            return false;
        }
        DivideInParty rhs = ((DivideInParty) other);
        return new EqualsBuilder().append(Indicator, rhs.Indicator).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
