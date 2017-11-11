
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
    "DirectionInd",
    "OriginDestinationOptions"
})
public class AirItinerary {

    @JsonProperty("DirectionInd")
    private String DirectionInd;
    @JsonProperty("OriginDestinationOptions")
    private com.sabre.api.sacs.rest.domain.generated.OriginDestinationOptions OriginDestinationOptions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DirectionInd
     */
    @JsonProperty("DirectionInd")
    public String getDirectionInd() {
        return DirectionInd;
    }

    /**
     * 
     * @param DirectionInd
     *     The DirectionInd
     */
    @JsonProperty("DirectionInd")
    public void setDirectionInd(String DirectionInd) {
        this.DirectionInd = DirectionInd;
    }

    public AirItinerary withDirectionInd(String DirectionInd) {
        this.DirectionInd = DirectionInd;
        return this;
    }

    /**
     * 
     * @return
     *     The OriginDestinationOptions
     */
    @JsonProperty("OriginDestinationOptions")
    public com.sabre.api.sacs.rest.domain.generated.OriginDestinationOptions getOriginDestinationOptions() {
        return OriginDestinationOptions;
    }

    /**
     * 
     * @param OriginDestinationOptions
     *     The OriginDestinationOptions
     */
    @JsonProperty("OriginDestinationOptions")
    public void setOriginDestinationOptions(com.sabre.api.sacs.rest.domain.generated.OriginDestinationOptions OriginDestinationOptions) {
        this.OriginDestinationOptions = OriginDestinationOptions;
    }

    public AirItinerary withOriginDestinationOptions(com.sabre.api.sacs.rest.domain.generated.OriginDestinationOptions OriginDestinationOptions) {
        this.OriginDestinationOptions = OriginDestinationOptions;
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

    public AirItinerary withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(DirectionInd).append(OriginDestinationOptions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirItinerary) == false) {
            return false;
        }
        AirItinerary rhs = ((AirItinerary) other);
        return new EqualsBuilder().append(DirectionInd, rhs.DirectionInd).append(OriginDestinationOptions, rhs.OriginDestinationOptions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
