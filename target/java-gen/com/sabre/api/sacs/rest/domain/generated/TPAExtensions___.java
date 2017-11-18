
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
    "SeatsRemaining",
    "Cabin",
    "Meal"
})
public class TPAExtensions___ {

    @JsonProperty("SeatsRemaining")
    private com.sabre.api.sacs.rest.domain.generated.SeatsRemaining SeatsRemaining;
    @JsonProperty("Cabin")
    private com.sabre.api.sacs.rest.domain.generated.Cabin Cabin;
    @JsonProperty("Meal")
    private com.sabre.api.sacs.rest.domain.generated.Meal Meal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The SeatsRemaining
     */
    @JsonProperty("SeatsRemaining")
    public com.sabre.api.sacs.rest.domain.generated.SeatsRemaining getSeatsRemaining() {
        return SeatsRemaining;
    }

    /**
     * 
     * @param SeatsRemaining
     *     The SeatsRemaining
     */
    @JsonProperty("SeatsRemaining")
    public void setSeatsRemaining(com.sabre.api.sacs.rest.domain.generated.SeatsRemaining SeatsRemaining) {
        this.SeatsRemaining = SeatsRemaining;
    }

    public TPAExtensions___ withSeatsRemaining(com.sabre.api.sacs.rest.domain.generated.SeatsRemaining SeatsRemaining) {
        this.SeatsRemaining = SeatsRemaining;
        return this;
    }

    /**
     * 
     * @return
     *     The Cabin
     */
    @JsonProperty("Cabin")
    public com.sabre.api.sacs.rest.domain.generated.Cabin getCabin() {
        return Cabin;
    }

    /**
     * 
     * @param Cabin
     *     The Cabin
     */
    @JsonProperty("Cabin")
    public void setCabin(com.sabre.api.sacs.rest.domain.generated.Cabin Cabin) {
        this.Cabin = Cabin;
    }

    public TPAExtensions___ withCabin(com.sabre.api.sacs.rest.domain.generated.Cabin Cabin) {
        this.Cabin = Cabin;
        return this;
    }

    /**
     * 
     * @return
     *     The Meal
     */
    @JsonProperty("Meal")
    public com.sabre.api.sacs.rest.domain.generated.Meal getMeal() {
        return Meal;
    }

    /**
     * 
     * @param Meal
     *     The Meal
     */
    @JsonProperty("Meal")
    public void setMeal(com.sabre.api.sacs.rest.domain.generated.Meal Meal) {
        this.Meal = Meal;
    }

    public TPAExtensions___ withMeal(com.sabre.api.sacs.rest.domain.generated.Meal Meal) {
        this.Meal = Meal;
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

    public TPAExtensions___ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(SeatsRemaining).append(Cabin).append(Meal).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions___) == false) {
            return false;
        }
        TPAExtensions___ rhs = ((TPAExtensions___) other);
        return new EqualsBuilder().append(SeatsRemaining, rhs.SeatsRemaining).append(Cabin, rhs.Cabin).append(Meal, rhs.Meal).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
