
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
    "NonRefundableIndicator"
})
public class Endorsements {

    @JsonProperty("NonRefundableIndicator")
    private Boolean NonRefundableIndicator;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The NonRefundableIndicator
     */
    @JsonProperty("NonRefundableIndicator")
    public Boolean getNonRefundableIndicator() {
        return NonRefundableIndicator;
    }

    /**
     * 
     * @param NonRefundableIndicator
     *     The NonRefundableIndicator
     */
    @JsonProperty("NonRefundableIndicator")
    public void setNonRefundableIndicator(Boolean NonRefundableIndicator) {
        this.NonRefundableIndicator = NonRefundableIndicator;
    }

    public Endorsements withNonRefundableIndicator(Boolean NonRefundableIndicator) {
        this.NonRefundableIndicator = NonRefundableIndicator;
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

    public Endorsements withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(NonRefundableIndicator).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Endorsements) == false) {
            return false;
        }
        Endorsements rhs = ((Endorsements) other);
        return new EqualsBuilder().append(NonRefundableIndicator, rhs.NonRefundableIndicator).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
