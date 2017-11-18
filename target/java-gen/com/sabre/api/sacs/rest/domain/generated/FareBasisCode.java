
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
    "BookingCode",
    "AvailabilityBreak",
    "DepartureAirportCode",
    "ArrivalAirportCode",
    "content"
})
public class FareBasisCode {

    @JsonProperty("BookingCode")
    private String BookingCode;
    @JsonProperty("AvailabilityBreak")
    private Boolean AvailabilityBreak;
    @JsonProperty("DepartureAirportCode")
    private String DepartureAirportCode;
    @JsonProperty("ArrivalAirportCode")
    private String ArrivalAirportCode;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BookingCode
     */
    @JsonProperty("BookingCode")
    public String getBookingCode() {
        return BookingCode;
    }

    /**
     * 
     * @param BookingCode
     *     The BookingCode
     */
    @JsonProperty("BookingCode")
    public void setBookingCode(String BookingCode) {
        this.BookingCode = BookingCode;
    }

    public FareBasisCode withBookingCode(String BookingCode) {
        this.BookingCode = BookingCode;
        return this;
    }

    /**
     * 
     * @return
     *     The AvailabilityBreak
     */
    @JsonProperty("AvailabilityBreak")
    public Boolean getAvailabilityBreak() {
        return AvailabilityBreak;
    }

    /**
     * 
     * @param AvailabilityBreak
     *     The AvailabilityBreak
     */
    @JsonProperty("AvailabilityBreak")
    public void setAvailabilityBreak(Boolean AvailabilityBreak) {
        this.AvailabilityBreak = AvailabilityBreak;
    }

    public FareBasisCode withAvailabilityBreak(Boolean AvailabilityBreak) {
        this.AvailabilityBreak = AvailabilityBreak;
        return this;
    }

    /**
     * 
     * @return
     *     The DepartureAirportCode
     */
    @JsonProperty("DepartureAirportCode")
    public String getDepartureAirportCode() {
        return DepartureAirportCode;
    }

    /**
     * 
     * @param DepartureAirportCode
     *     The DepartureAirportCode
     */
    @JsonProperty("DepartureAirportCode")
    public void setDepartureAirportCode(String DepartureAirportCode) {
        this.DepartureAirportCode = DepartureAirportCode;
    }

    public FareBasisCode withDepartureAirportCode(String DepartureAirportCode) {
        this.DepartureAirportCode = DepartureAirportCode;
        return this;
    }

    /**
     * 
     * @return
     *     The ArrivalAirportCode
     */
    @JsonProperty("ArrivalAirportCode")
    public String getArrivalAirportCode() {
        return ArrivalAirportCode;
    }

    /**
     * 
     * @param ArrivalAirportCode
     *     The ArrivalAirportCode
     */
    @JsonProperty("ArrivalAirportCode")
    public void setArrivalAirportCode(String ArrivalAirportCode) {
        this.ArrivalAirportCode = ArrivalAirportCode;
    }

    public FareBasisCode withArrivalAirportCode(String ArrivalAirportCode) {
        this.ArrivalAirportCode = ArrivalAirportCode;
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

    public FareBasisCode withContent(String content) {
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

    public FareBasisCode withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BookingCode).append(AvailabilityBreak).append(DepartureAirportCode).append(ArrivalAirportCode).append(content).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareBasisCode) == false) {
            return false;
        }
        FareBasisCode rhs = ((FareBasisCode) other);
        return new EqualsBuilder().append(BookingCode, rhs.BookingCode).append(AvailabilityBreak, rhs.AvailabilityBreak).append(DepartureAirportCode, rhs.DepartureAirportCode).append(ArrivalAirportCode, rhs.ArrivalAirportCode).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
