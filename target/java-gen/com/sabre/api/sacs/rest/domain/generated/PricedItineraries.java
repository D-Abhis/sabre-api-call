
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
    "PricedItinerary"
})
public class PricedItineraries {

    @JsonProperty("PricedItinerary")
    private List<com.sabre.api.sacs.rest.domain.generated.PricedItinerary> PricedItinerary = new ArrayList<com.sabre.api.sacs.rest.domain.generated.PricedItinerary>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PricedItinerary
     */
    @JsonProperty("PricedItinerary")
    public List<com.sabre.api.sacs.rest.domain.generated.PricedItinerary> getPricedItinerary() {
        return PricedItinerary;
    }

    /**
     * 
     * @param PricedItinerary
     *     The PricedItinerary
     */
    @JsonProperty("PricedItinerary")
    public void setPricedItinerary(List<com.sabre.api.sacs.rest.domain.generated.PricedItinerary> PricedItinerary) {
        this.PricedItinerary = PricedItinerary;
    }

    public PricedItineraries withPricedItinerary(List<com.sabre.api.sacs.rest.domain.generated.PricedItinerary> PricedItinerary) {
        this.PricedItinerary = PricedItinerary;
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

    public PricedItineraries withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(PricedItinerary).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PricedItineraries) == false) {
            return false;
        }
        PricedItineraries rhs = ((PricedItineraries) other);
        return new EqualsBuilder().append(PricedItinerary, rhs.PricedItinerary).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
