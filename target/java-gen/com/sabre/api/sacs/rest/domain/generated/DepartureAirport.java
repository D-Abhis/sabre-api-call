
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
    "LocationCode",
    "TerminalID",
    "content"
})
public class DepartureAirport {

    @JsonProperty("LocationCode")
    private String LocationCode;
    @JsonProperty("TerminalID")
    private String TerminalID;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The LocationCode
     */
    @JsonProperty("LocationCode")
    public String getLocationCode() {
        return LocationCode;
    }

    /**
     * 
     * @param LocationCode
     *     The LocationCode
     */
    @JsonProperty("LocationCode")
    public void setLocationCode(String LocationCode) {
        this.LocationCode = LocationCode;
    }

    public DepartureAirport withLocationCode(String LocationCode) {
        this.LocationCode = LocationCode;
        return this;
    }

    /**
     * 
     * @return
     *     The TerminalID
     */
    @JsonProperty("TerminalID")
    public String getTerminalID() {
        return TerminalID;
    }

    /**
     * 
     * @param TerminalID
     *     The TerminalID
     */
    @JsonProperty("TerminalID")
    public void setTerminalID(String TerminalID) {
        this.TerminalID = TerminalID;
    }

    public DepartureAirport withTerminalID(String TerminalID) {
        this.TerminalID = TerminalID;
        return this;
    }

    /**
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public DepartureAirport withContent(String content) {
        this.content = content;
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

    public DepartureAirport withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(LocationCode).append(TerminalID).append(content).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DepartureAirport) == false) {
            return false;
        }
        DepartureAirport rhs = ((DepartureAirport) other);
        return new EqualsBuilder().append(LocationCode, rhs.LocationCode).append(TerminalID, rhs.TerminalID).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
