
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
    "DivideInParty"
})
public class TPAExtensions____ {

    @JsonProperty("DivideInParty")
    private com.sabre.api.sacs.rest.domain.generated.DivideInParty DivideInParty;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DivideInParty
     */
    @JsonProperty("DivideInParty")
    public com.sabre.api.sacs.rest.domain.generated.DivideInParty getDivideInParty() {
        return DivideInParty;
    }

    /**
     * 
     * @param DivideInParty
     *     The DivideInParty
     */
    @JsonProperty("DivideInParty")
    public void setDivideInParty(com.sabre.api.sacs.rest.domain.generated.DivideInParty DivideInParty) {
        this.DivideInParty = DivideInParty;
    }

    public TPAExtensions____ withDivideInParty(com.sabre.api.sacs.rest.domain.generated.DivideInParty DivideInParty) {
        this.DivideInParty = DivideInParty;
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

    public TPAExtensions____ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(DivideInParty).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions____) == false) {
            return false;
        }
        TPAExtensions____ rhs = ((TPAExtensions____) other);
        return new EqualsBuilder().append(DivideInParty, rhs.DivideInParty).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
