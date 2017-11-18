
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
    "LastTicketDate",
    "PricingSource",
    "PricingSubSource",
    "ItinTotalFare",
    "PTC_FareBreakdowns",
    "FareInfos",
    "TPA_Extensions"
})
public class AirItineraryPricingInfo {

    @JsonProperty("LastTicketDate")
    private String LastTicketDate;
    @JsonProperty("PricingSource")
    private String PricingSource;
    @JsonProperty("PricingSubSource")
    private String PricingSubSource;
    @JsonProperty("ItinTotalFare")
    private com.sabre.api.sacs.rest.domain.generated.ItinTotalFare ItinTotalFare;
    @JsonProperty("PTC_FareBreakdowns")
    private com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdowns PTCFareBreakdowns;
    @JsonProperty("FareInfos")
    private com.sabre.api.sacs.rest.domain.generated.FareInfos FareInfos;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions____ TPAExtensions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The LastTicketDate
     */
    @JsonProperty("LastTicketDate")
    public String getLastTicketDate() {
        return LastTicketDate;
    }

    /**
     * 
     * @param LastTicketDate
     *     The LastTicketDate
     */
    @JsonProperty("LastTicketDate")
    public void setLastTicketDate(String LastTicketDate) {
        this.LastTicketDate = LastTicketDate;
    }

    public AirItineraryPricingInfo withLastTicketDate(String LastTicketDate) {
        this.LastTicketDate = LastTicketDate;
        return this;
    }

    /**
     * 
     * @return
     *     The PricingSource
     */
    @JsonProperty("PricingSource")
    public String getPricingSource() {
        return PricingSource;
    }

    /**
     * 
     * @param PricingSource
     *     The PricingSource
     */
    @JsonProperty("PricingSource")
    public void setPricingSource(String PricingSource) {
        this.PricingSource = PricingSource;
    }

    public AirItineraryPricingInfo withPricingSource(String PricingSource) {
        this.PricingSource = PricingSource;
        return this;
    }

    /**
     * 
     * @return
     *     The PricingSubSource
     */
    @JsonProperty("PricingSubSource")
    public String getPricingSubSource() {
        return PricingSubSource;
    }

    /**
     * 
     * @param PricingSubSource
     *     The PricingSubSource
     */
    @JsonProperty("PricingSubSource")
    public void setPricingSubSource(String PricingSubSource) {
        this.PricingSubSource = PricingSubSource;
    }

    public AirItineraryPricingInfo withPricingSubSource(String PricingSubSource) {
        this.PricingSubSource = PricingSubSource;
        return this;
    }

    /**
     * 
     * @return
     *     The ItinTotalFare
     */
    @JsonProperty("ItinTotalFare")
    public com.sabre.api.sacs.rest.domain.generated.ItinTotalFare getItinTotalFare() {
        return ItinTotalFare;
    }

    /**
     * 
     * @param ItinTotalFare
     *     The ItinTotalFare
     */
    @JsonProperty("ItinTotalFare")
    public void setItinTotalFare(com.sabre.api.sacs.rest.domain.generated.ItinTotalFare ItinTotalFare) {
        this.ItinTotalFare = ItinTotalFare;
    }

    public AirItineraryPricingInfo withItinTotalFare(com.sabre.api.sacs.rest.domain.generated.ItinTotalFare ItinTotalFare) {
        this.ItinTotalFare = ItinTotalFare;
        return this;
    }

    /**
     * 
     * @return
     *     The PTCFareBreakdowns
     */
    @JsonProperty("PTC_FareBreakdowns")
    public com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdowns getPTCFareBreakdowns() {
        return PTCFareBreakdowns;
    }

    /**
     * 
     * @param PTCFareBreakdowns
     *     The PTC_FareBreakdowns
     */
    @JsonProperty("PTC_FareBreakdowns")
    public void setPTCFareBreakdowns(com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdowns PTCFareBreakdowns) {
        this.PTCFareBreakdowns = PTCFareBreakdowns;
    }

    public AirItineraryPricingInfo withPTCFareBreakdowns(com.sabre.api.sacs.rest.domain.generated.PTCFareBreakdowns PTCFareBreakdowns) {
        this.PTCFareBreakdowns = PTCFareBreakdowns;
        return this;
    }

    /**
     * 
     * @return
     *     The FareInfos
     */
    @JsonProperty("FareInfos")
    public com.sabre.api.sacs.rest.domain.generated.FareInfos getFareInfos() {
        return FareInfos;
    }

    /**
     * 
     * @param FareInfos
     *     The FareInfos
     */
    @JsonProperty("FareInfos")
    public void setFareInfos(com.sabre.api.sacs.rest.domain.generated.FareInfos FareInfos) {
        this.FareInfos = FareInfos;
    }

    public AirItineraryPricingInfo withFareInfos(com.sabre.api.sacs.rest.domain.generated.FareInfos FareInfos) {
        this.FareInfos = FareInfos;
        return this;
    }

    /**
     * 
     * @return
     *     The TPAExtensions
     */
    @JsonProperty("TPA_Extensions")
    public TPAExtensions____ getTPAExtensions() {
        return TPAExtensions;
    }

    /**
     * 
     * @param TPAExtensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions____ TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    public AirItineraryPricingInfo withTPAExtensions(TPAExtensions____ TPAExtensions) {
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

    public AirItineraryPricingInfo withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(LastTicketDate).append(PricingSource).append(PricingSubSource).append(ItinTotalFare).append(PTCFareBreakdowns).append(FareInfos).append(TPAExtensions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AirItineraryPricingInfo) == false) {
            return false;
        }
        AirItineraryPricingInfo rhs = ((AirItineraryPricingInfo) other);
        return new EqualsBuilder().append(LastTicketDate, rhs.LastTicketDate).append(PricingSource, rhs.PricingSource).append(PricingSubSource, rhs.PricingSubSource).append(ItinTotalFare, rhs.ItinTotalFare).append(PTCFareBreakdowns, rhs.PTCFareBreakdowns).append(FareInfos, rhs.FareInfos).append(TPAExtensions, rhs.TPAExtensions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
