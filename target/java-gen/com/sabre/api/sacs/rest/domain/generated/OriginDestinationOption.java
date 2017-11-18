
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
    "ElapsedTime",
    "FlightSegment"
})
public class OriginDestinationOption {

    @JsonProperty("ElapsedTime")
    private Integer ElapsedTime;
    @JsonProperty("FlightSegment")
    private List<com.sabre.api.sacs.rest.domain.generated.FlightSegment> FlightSegment = new ArrayList<com.sabre.api.sacs.rest.domain.generated.FlightSegment>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The ElapsedTime
     */
    @JsonProperty("ElapsedTime")
    public Integer getElapsedTime() {
        return ElapsedTime;
    }

    /**
     * 
     * @param ElapsedTime
     *     The ElapsedTime
     */
    @JsonProperty("ElapsedTime")
    public void setElapsedTime(Integer ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
    }

    public OriginDestinationOption withElapsedTime(Integer ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
        return this;
    }

    /**
     * 
     * @return
     *     The FlightSegment
     */
    @JsonProperty("FlightSegment")
    public List<com.sabre.api.sacs.rest.domain.generated.FlightSegment> getFlightSegment() {
        return FlightSegment;
    }

    /**
     * 
     * @param FlightSegment
     *     The FlightSegment
     */
    @JsonProperty("FlightSegment")
    public void setFlightSegment(List<com.sabre.api.sacs.rest.domain.generated.FlightSegment> FlightSegment) {
        this.FlightSegment = FlightSegment;
    }

    public OriginDestinationOption withFlightSegment(List<com.sabre.api.sacs.rest.domain.generated.FlightSegment> FlightSegment) {
        this.FlightSegment = FlightSegment;
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

    public OriginDestinationOption withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ElapsedTime).append(FlightSegment).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationOption) == false) {
            return false;
        }
        OriginDestinationOption rhs = ((OriginDestinationOption) other);
        return new EqualsBuilder().append(ElapsedTime, rhs.ElapsedTime).append(FlightSegment, rhs.FlightSegment).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
