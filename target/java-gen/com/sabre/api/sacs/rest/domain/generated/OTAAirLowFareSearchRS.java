
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
    "PricedItinCount",
    "BrandedOneWayItinCount",
    "SimpleOneWayItinCount",
    "DepartedItinCount",
    "SoldOutItinCount",
    "AvailableItinCount",
    "Version",
    "Success",
    "Warnings",
    "PricedItineraries"
})
public class OTAAirLowFareSearchRS {

    @JsonProperty("PricedItinCount")
    private Integer PricedItinCount;
    @JsonProperty("BrandedOneWayItinCount")
    private Integer BrandedOneWayItinCount;
    @JsonProperty("SimpleOneWayItinCount")
    private Integer SimpleOneWayItinCount;
    @JsonProperty("DepartedItinCount")
    private Integer DepartedItinCount;
    @JsonProperty("SoldOutItinCount")
    private Integer SoldOutItinCount;
    @JsonProperty("AvailableItinCount")
    private Integer AvailableItinCount;
    @JsonProperty("Version")
    private String Version;
    @JsonProperty("Success")
    private com.sabre.api.sacs.rest.domain.generated.Success Success;
    @JsonProperty("Warnings")
    private com.sabre.api.sacs.rest.domain.generated.Warnings Warnings;
    @JsonProperty("PricedItineraries")
    private com.sabre.api.sacs.rest.domain.generated.PricedItineraries PricedItineraries;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PricedItinCount
     */
    @JsonProperty("PricedItinCount")
    public Integer getPricedItinCount() {
        return PricedItinCount;
    }

    /**
     * 
     * @param PricedItinCount
     *     The PricedItinCount
     */
    @JsonProperty("PricedItinCount")
    public void setPricedItinCount(Integer PricedItinCount) {
        this.PricedItinCount = PricedItinCount;
    }

    public OTAAirLowFareSearchRS withPricedItinCount(Integer PricedItinCount) {
        this.PricedItinCount = PricedItinCount;
        return this;
    }

    /**
     * 
     * @return
     *     The BrandedOneWayItinCount
     */
    @JsonProperty("BrandedOneWayItinCount")
    public Integer getBrandedOneWayItinCount() {
        return BrandedOneWayItinCount;
    }

    /**
     * 
     * @param BrandedOneWayItinCount
     *     The BrandedOneWayItinCount
     */
    @JsonProperty("BrandedOneWayItinCount")
    public void setBrandedOneWayItinCount(Integer BrandedOneWayItinCount) {
        this.BrandedOneWayItinCount = BrandedOneWayItinCount;
    }

    public OTAAirLowFareSearchRS withBrandedOneWayItinCount(Integer BrandedOneWayItinCount) {
        this.BrandedOneWayItinCount = BrandedOneWayItinCount;
        return this;
    }

    /**
     * 
     * @return
     *     The SimpleOneWayItinCount
     */
    @JsonProperty("SimpleOneWayItinCount")
    public Integer getSimpleOneWayItinCount() {
        return SimpleOneWayItinCount;
    }

    /**
     * 
     * @param SimpleOneWayItinCount
     *     The SimpleOneWayItinCount
     */
    @JsonProperty("SimpleOneWayItinCount")
    public void setSimpleOneWayItinCount(Integer SimpleOneWayItinCount) {
        this.SimpleOneWayItinCount = SimpleOneWayItinCount;
    }

    public OTAAirLowFareSearchRS withSimpleOneWayItinCount(Integer SimpleOneWayItinCount) {
        this.SimpleOneWayItinCount = SimpleOneWayItinCount;
        return this;
    }

    /**
     * 
     * @return
     *     The DepartedItinCount
     */
    @JsonProperty("DepartedItinCount")
    public Integer getDepartedItinCount() {
        return DepartedItinCount;
    }

    /**
     * 
     * @param DepartedItinCount
     *     The DepartedItinCount
     */
    @JsonProperty("DepartedItinCount")
    public void setDepartedItinCount(Integer DepartedItinCount) {
        this.DepartedItinCount = DepartedItinCount;
    }

    public OTAAirLowFareSearchRS withDepartedItinCount(Integer DepartedItinCount) {
        this.DepartedItinCount = DepartedItinCount;
        return this;
    }

    /**
     * 
     * @return
     *     The SoldOutItinCount
     */
    @JsonProperty("SoldOutItinCount")
    public Integer getSoldOutItinCount() {
        return SoldOutItinCount;
    }

    /**
     * 
     * @param SoldOutItinCount
     *     The SoldOutItinCount
     */
    @JsonProperty("SoldOutItinCount")
    public void setSoldOutItinCount(Integer SoldOutItinCount) {
        this.SoldOutItinCount = SoldOutItinCount;
    }

    public OTAAirLowFareSearchRS withSoldOutItinCount(Integer SoldOutItinCount) {
        this.SoldOutItinCount = SoldOutItinCount;
        return this;
    }

    /**
     * 
     * @return
     *     The AvailableItinCount
     */
    @JsonProperty("AvailableItinCount")
    public Integer getAvailableItinCount() {
        return AvailableItinCount;
    }

    /**
     * 
     * @param AvailableItinCount
     *     The AvailableItinCount
     */
    @JsonProperty("AvailableItinCount")
    public void setAvailableItinCount(Integer AvailableItinCount) {
        this.AvailableItinCount = AvailableItinCount;
    }

    public OTAAirLowFareSearchRS withAvailableItinCount(Integer AvailableItinCount) {
        this.AvailableItinCount = AvailableItinCount;
        return this;
    }

    /**
     * 
     * @return
     *     The Version
     */
    @JsonProperty("Version")
    public String getVersion() {
        return Version;
    }

    /**
     * 
     * @param Version
     *     The Version
     */
    @JsonProperty("Version")
    public void setVersion(String Version) {
        this.Version = Version;
    }

    public OTAAirLowFareSearchRS withVersion(String Version) {
        this.Version = Version;
        return this;
    }

    /**
     * 
     * @return
     *     The Success
     */
    @JsonProperty("Success")
    public com.sabre.api.sacs.rest.domain.generated.Success getSuccess() {
        return Success;
    }

    /**
     * 
     * @param Success
     *     The Success
     */
    @JsonProperty("Success")
    public void setSuccess(com.sabre.api.sacs.rest.domain.generated.Success Success) {
        this.Success = Success;
    }

    public OTAAirLowFareSearchRS withSuccess(com.sabre.api.sacs.rest.domain.generated.Success Success) {
        this.Success = Success;
        return this;
    }

    /**
     * 
     * @return
     *     The Warnings
     */
    @JsonProperty("Warnings")
    public com.sabre.api.sacs.rest.domain.generated.Warnings getWarnings() {
        return Warnings;
    }

    /**
     * 
     * @param Warnings
     *     The Warnings
     */
    @JsonProperty("Warnings")
    public void setWarnings(com.sabre.api.sacs.rest.domain.generated.Warnings Warnings) {
        this.Warnings = Warnings;
    }

    public OTAAirLowFareSearchRS withWarnings(com.sabre.api.sacs.rest.domain.generated.Warnings Warnings) {
        this.Warnings = Warnings;
        return this;
    }

    /**
     * 
     * @return
     *     The PricedItineraries
     */
    @JsonProperty("PricedItineraries")
    public com.sabre.api.sacs.rest.domain.generated.PricedItineraries getPricedItineraries() {
        return PricedItineraries;
    }

    /**
     * 
     * @param PricedItineraries
     *     The PricedItineraries
     */
    @JsonProperty("PricedItineraries")
    public void setPricedItineraries(com.sabre.api.sacs.rest.domain.generated.PricedItineraries PricedItineraries) {
        this.PricedItineraries = PricedItineraries;
    }

    public OTAAirLowFareSearchRS withPricedItineraries(com.sabre.api.sacs.rest.domain.generated.PricedItineraries PricedItineraries) {
        this.PricedItineraries = PricedItineraries;
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

    public OTAAirLowFareSearchRS withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(PricedItinCount).append(BrandedOneWayItinCount).append(SimpleOneWayItinCount).append(DepartedItinCount).append(SoldOutItinCount).append(AvailableItinCount).append(Version).append(Success).append(Warnings).append(PricedItineraries).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OTAAirLowFareSearchRS) == false) {
            return false;
        }
        OTAAirLowFareSearchRS rhs = ((OTAAirLowFareSearchRS) other);
        return new EqualsBuilder().append(PricedItinCount, rhs.PricedItinCount).append(BrandedOneWayItinCount, rhs.BrandedOneWayItinCount).append(SimpleOneWayItinCount, rhs.SimpleOneWayItinCount).append(DepartedItinCount, rhs.DepartedItinCount).append(SoldOutItinCount, rhs.SoldOutItinCount).append(AvailableItinCount, rhs.AvailableItinCount).append(Version, rhs.Version).append(Success, rhs.Success).append(Warnings, rhs.Warnings).append(PricedItineraries, rhs.PricedItineraries).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
