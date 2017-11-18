
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
    "FareReference",
    "TPA_Extensions"
})
public class FareInfo {

    @JsonProperty("FareReference")
    private String FareReference;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions___ TPAExtensions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FareReference
     */
    @JsonProperty("FareReference")
    public String getFareReference() {
        return FareReference;
    }

    /**
     * 
     * @param FareReference
     *     The FareReference
     */
    @JsonProperty("FareReference")
    public void setFareReference(String FareReference) {
        this.FareReference = FareReference;
    }

    public FareInfo withFareReference(String FareReference) {
        this.FareReference = FareReference;
        return this;
    }

    /**
     * 
     * @return
     *     The TPAExtensions
     */
    @JsonProperty("TPA_Extensions")
    public TPAExtensions___ getTPAExtensions() {
        return TPAExtensions;
    }

    /**
     * 
     * @param TPAExtensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions___ TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    public FareInfo withTPAExtensions(TPAExtensions___ TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
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

    public FareInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(FareReference).append(TPAExtensions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareInfo) == false) {
            return false;
        }
        FareInfo rhs = ((FareInfo) other);
        return new EqualsBuilder().append(FareReference, rhs.FareReference).append(TPAExtensions, rhs.TPAExtensions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
