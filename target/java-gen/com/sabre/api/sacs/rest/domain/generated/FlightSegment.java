
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
    "DepartureDateTime",
    "ArrivalDateTime",
    "StopQuantity",
    "FlightNumber",
    "ResBookDesigCode",
    "ElapsedTime",
    "DepartureAirport",
    "ArrivalAirport",
    "OperatingAirline",
    "Equipment",
    "MarketingAirline",
    "MarriageGrp",
    "DepartureTimeZone",
    "ArrivalTimeZone",
    "OnTimePerformance",
    "TPA_Extensions"
})
public class FlightSegment {

    @JsonProperty("DepartureDateTime")
    private String DepartureDateTime;
    @JsonProperty("ArrivalDateTime")
    private String ArrivalDateTime;
    @JsonProperty("StopQuantity")
    private Integer StopQuantity;
    @JsonProperty("FlightNumber")
    private String FlightNumber;
    @JsonProperty("ResBookDesigCode")
    private String ResBookDesigCode;
    @JsonProperty("ElapsedTime")
    private Integer ElapsedTime;
    @JsonProperty("DepartureAirport")
    private com.sabre.api.sacs.rest.domain.generated.DepartureAirport DepartureAirport;
    @JsonProperty("ArrivalAirport")
    private com.sabre.api.sacs.rest.domain.generated.ArrivalAirport ArrivalAirport;
    @JsonProperty("OperatingAirline")
    private com.sabre.api.sacs.rest.domain.generated.OperatingAirline OperatingAirline;
    @JsonProperty("Equipment")
    private List<com.sabre.api.sacs.rest.domain.generated.Equipment> Equipment = new ArrayList<com.sabre.api.sacs.rest.domain.generated.Equipment>();
    @JsonProperty("MarketingAirline")
    private com.sabre.api.sacs.rest.domain.generated.MarketingAirline MarketingAirline;
    @JsonProperty("MarriageGrp")
    private String MarriageGrp;
    @JsonProperty("DepartureTimeZone")
    private com.sabre.api.sacs.rest.domain.generated.DepartureTimeZone DepartureTimeZone;
    @JsonProperty("ArrivalTimeZone")
    private com.sabre.api.sacs.rest.domain.generated.ArrivalTimeZone ArrivalTimeZone;
    @JsonProperty("OnTimePerformance")
    private com.sabre.api.sacs.rest.domain.generated.OnTimePerformance OnTimePerformance;
    @JsonProperty("TPA_Extensions")
    private com.sabre.api.sacs.rest.domain.generated.TPAExtensions TPAExtensions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The DepartureDateTime
     */
    @JsonProperty("DepartureDateTime")
    public String getDepartureDateTime() {
        return DepartureDateTime;
    }

    /**
     * 
     * @param DepartureDateTime
     *     The DepartureDateTime
     */
    @JsonProperty("DepartureDateTime")
    public void setDepartureDateTime(String DepartureDateTime) {
        this.DepartureDateTime = DepartureDateTime;
    }

    public FlightSegment withDepartureDateTime(String DepartureDateTime) {
        this.DepartureDateTime = DepartureDateTime;
        return this;
    }

    /**
     * 
     * @return
     *     The ArrivalDateTime
     */
    @JsonProperty("ArrivalDateTime")
    public String getArrivalDateTime() {
        return ArrivalDateTime;
    }

    /**
     * 
     * @param ArrivalDateTime
     *     The ArrivalDateTime
     */
    @JsonProperty("ArrivalDateTime")
    public void setArrivalDateTime(String ArrivalDateTime) {
        this.ArrivalDateTime = ArrivalDateTime;
    }

    public FlightSegment withArrivalDateTime(String ArrivalDateTime) {
        this.ArrivalDateTime = ArrivalDateTime;
        return this;
    }

    /**
     * 
     * @return
     *     The StopQuantity
     */
    @JsonProperty("StopQuantity")
    public Integer getStopQuantity() {
        return StopQuantity;
    }

    /**
     * 
     * @param StopQuantity
     *     The StopQuantity
     */
    @JsonProperty("StopQuantity")
    public void setStopQuantity(Integer StopQuantity) {
        this.StopQuantity = StopQuantity;
    }

    public FlightSegment withStopQuantity(Integer StopQuantity) {
        this.StopQuantity = StopQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The FlightNumber
     */
    @JsonProperty("FlightNumber")
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     * 
     * @param FlightNumber
     *     The FlightNumber
     */
    @JsonProperty("FlightNumber")
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public FlightSegment withFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
        return this;
    }

    /**
     * 
     * @return
     *     The ResBookDesigCode
     */
    @JsonProperty("ResBookDesigCode")
    public String getResBookDesigCode() {
        return ResBookDesigCode;
    }

    /**
     * 
     * @param ResBookDesigCode
     *     The ResBookDesigCode
     */
    @JsonProperty("ResBookDesigCode")
    public void setResBookDesigCode(String ResBookDesigCode) {
        this.ResBookDesigCode = ResBookDesigCode;
    }

    public FlightSegment withResBookDesigCode(String ResBookDesigCode) {
        this.ResBookDesigCode = ResBookDesigCode;
        return this;
    }

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

    public FlightSegment withElapsedTime(Integer ElapsedTime) {
        this.ElapsedTime = ElapsedTime;
        return this;
    }

    /**
     * 
     * @return
     *     The DepartureAirport
     */
    @JsonProperty("DepartureAirport")
    public com.sabre.api.sacs.rest.domain.generated.DepartureAirport getDepartureAirport() {
        return DepartureAirport;
    }

    /**
     * 
     * @param DepartureAirport
     *     The DepartureAirport
     */
    @JsonProperty("DepartureAirport")
    public void setDepartureAirport(com.sabre.api.sacs.rest.domain.generated.DepartureAirport DepartureAirport) {
        this.DepartureAirport = DepartureAirport;
    }

    public FlightSegment withDepartureAirport(com.sabre.api.sacs.rest.domain.generated.DepartureAirport DepartureAirport) {
        this.DepartureAirport = DepartureAirport;
        return this;
    }

    /**
     * 
     * @return
     *     The ArrivalAirport
     */
    @JsonProperty("ArrivalAirport")
    public com.sabre.api.sacs.rest.domain.generated.ArrivalAirport getArrivalAirport() {
        return ArrivalAirport;
    }

    /**
     * 
     * @param ArrivalAirport
     *     The ArrivalAirport
     */
    @JsonProperty("ArrivalAirport")
    public void setArrivalAirport(com.sabre.api.sacs.rest.domain.generated.ArrivalAirport ArrivalAirport) {
        this.ArrivalAirport = ArrivalAirport;
    }

    public FlightSegment withArrivalAirport(com.sabre.api.sacs.rest.domain.generated.ArrivalAirport ArrivalAirport) {
        this.ArrivalAirport = ArrivalAirport;
        return this;
    }

    /**
     * 
     * @return
     *     The OperatingAirline
     */
    @JsonProperty("OperatingAirline")
    public com.sabre.api.sacs.rest.domain.generated.OperatingAirline getOperatingAirline() {
        return OperatingAirline;
    }

    /**
     * 
     * @param OperatingAirline
     *     The OperatingAirline
     */
    @JsonProperty("OperatingAirline")
    public void setOperatingAirline(com.sabre.api.sacs.rest.domain.generated.OperatingAirline OperatingAirline) {
        this.OperatingAirline = OperatingAirline;
    }

    public FlightSegment withOperatingAirline(com.sabre.api.sacs.rest.domain.generated.OperatingAirline OperatingAirline) {
        this.OperatingAirline = OperatingAirline;
        return this;
    }

    /**
     * 
     * @return
     *     The Equipment
     */
    @JsonProperty("Equipment")
    public List<com.sabre.api.sacs.rest.domain.generated.Equipment> getEquipment() {
        return Equipment;
    }

    /**
     * 
     * @param Equipment
     *     The Equipment
     */
    @JsonProperty("Equipment")
    public void setEquipment(List<com.sabre.api.sacs.rest.domain.generated.Equipment> Equipment) {
        this.Equipment = Equipment;
    }

    public FlightSegment withEquipment(List<com.sabre.api.sacs.rest.domain.generated.Equipment> Equipment) {
        this.Equipment = Equipment;
        return this;
    }

    /**
     * 
     * @return
     *     The MarketingAirline
     */
    @JsonProperty("MarketingAirline")
    public com.sabre.api.sacs.rest.domain.generated.MarketingAirline getMarketingAirline() {
        return MarketingAirline;
    }

    /**
     * 
     * @param MarketingAirline
     *     The MarketingAirline
     */
    @JsonProperty("MarketingAirline")
    public void setMarketingAirline(com.sabre.api.sacs.rest.domain.generated.MarketingAirline MarketingAirline) {
        this.MarketingAirline = MarketingAirline;
    }

    public FlightSegment withMarketingAirline(com.sabre.api.sacs.rest.domain.generated.MarketingAirline MarketingAirline) {
        this.MarketingAirline = MarketingAirline;
        return this;
    }

    /**
     * 
     * @return
     *     The MarriageGrp
     */
    @JsonProperty("MarriageGrp")
    public String getMarriageGrp() {
        return MarriageGrp;
    }

    /**
     * 
     * @param MarriageGrp
     *     The MarriageGrp
     */
    @JsonProperty("MarriageGrp")
    public void setMarriageGrp(String MarriageGrp) {
        this.MarriageGrp = MarriageGrp;
    }

    public FlightSegment withMarriageGrp(String MarriageGrp) {
        this.MarriageGrp = MarriageGrp;
        return this;
    }

    /**
     * 
     * @return
     *     The DepartureTimeZone
     */
    @JsonProperty("DepartureTimeZone")
    public com.sabre.api.sacs.rest.domain.generated.DepartureTimeZone getDepartureTimeZone() {
        return DepartureTimeZone;
    }

    /**
     * 
     * @param DepartureTimeZone
     *     The DepartureTimeZone
     */
    @JsonProperty("DepartureTimeZone")
    public void setDepartureTimeZone(com.sabre.api.sacs.rest.domain.generated.DepartureTimeZone DepartureTimeZone) {
        this.DepartureTimeZone = DepartureTimeZone;
    }

    public FlightSegment withDepartureTimeZone(com.sabre.api.sacs.rest.domain.generated.DepartureTimeZone DepartureTimeZone) {
        this.DepartureTimeZone = DepartureTimeZone;
        return this;
    }

    /**
     * 
     * @return
     *     The ArrivalTimeZone
     */
    @JsonProperty("ArrivalTimeZone")
    public com.sabre.api.sacs.rest.domain.generated.ArrivalTimeZone getArrivalTimeZone() {
        return ArrivalTimeZone;
    }

    /**
     * 
     * @param ArrivalTimeZone
     *     The ArrivalTimeZone
     */
    @JsonProperty("ArrivalTimeZone")
    public void setArrivalTimeZone(com.sabre.api.sacs.rest.domain.generated.ArrivalTimeZone ArrivalTimeZone) {
        this.ArrivalTimeZone = ArrivalTimeZone;
    }

    public FlightSegment withArrivalTimeZone(com.sabre.api.sacs.rest.domain.generated.ArrivalTimeZone ArrivalTimeZone) {
        this.ArrivalTimeZone = ArrivalTimeZone;
        return this;
    }

    /**
     * 
     * @return
     *     The OnTimePerformance
     */
    @JsonProperty("OnTimePerformance")
    public com.sabre.api.sacs.rest.domain.generated.OnTimePerformance getOnTimePerformance() {
        return OnTimePerformance;
    }

    /**
     * 
     * @param OnTimePerformance
     *     The OnTimePerformance
     */
    @JsonProperty("OnTimePerformance")
    public void setOnTimePerformance(com.sabre.api.sacs.rest.domain.generated.OnTimePerformance OnTimePerformance) {
        this.OnTimePerformance = OnTimePerformance;
    }

    public FlightSegment withOnTimePerformance(com.sabre.api.sacs.rest.domain.generated.OnTimePerformance OnTimePerformance) {
        this.OnTimePerformance = OnTimePerformance;
        return this;
    }

    /**
     * 
     * @return
     *     The TPAExtensions
     */
    @JsonProperty("TPA_Extensions")
    public com.sabre.api.sacs.rest.domain.generated.TPAExtensions getTPAExtensions() {
        return TPAExtensions;
    }

    /**
     * 
     * @param TPAExtensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(com.sabre.api.sacs.rest.domain.generated.TPAExtensions TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    public FlightSegment withTPAExtensions(com.sabre.api.sacs.rest.domain.generated.TPAExtensions TPAExtensions) {
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

    public FlightSegment withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(DepartureDateTime).append(ArrivalDateTime).append(StopQuantity).append(FlightNumber).append(ResBookDesigCode).append(ElapsedTime).append(DepartureAirport).append(ArrivalAirport).append(OperatingAirline).append(Equipment).append(MarketingAirline).append(MarriageGrp).append(DepartureTimeZone).append(ArrivalTimeZone).append(OnTimePerformance).append(TPAExtensions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FlightSegment) == false) {
            return false;
        }
        FlightSegment rhs = ((FlightSegment) other);
        return new EqualsBuilder().append(DepartureDateTime, rhs.DepartureDateTime).append(ArrivalDateTime, rhs.ArrivalDateTime).append(StopQuantity, rhs.StopQuantity).append(FlightNumber, rhs.FlightNumber).append(ResBookDesigCode, rhs.ResBookDesigCode).append(ElapsedTime, rhs.ElapsedTime).append(DepartureAirport, rhs.DepartureAirport).append(ArrivalAirport, rhs.ArrivalAirport).append(OperatingAirline, rhs.OperatingAirline).append(Equipment, rhs.Equipment).append(MarketingAirline, rhs.MarketingAirline).append(MarriageGrp, rhs.MarriageGrp).append(DepartureTimeZone, rhs.DepartureTimeZone).append(ArrivalTimeZone, rhs.ArrivalTimeZone).append(OnTimePerformance, rhs.OnTimePerformance).append(TPAExtensions, rhs.TPAExtensions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
