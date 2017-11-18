
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
    "BaseFare",
    "FareConstruction",
    "EquivFare",
    "Taxes",
    "TotalFare"
})
public class ItinTotalFare {

    @JsonProperty("BaseFare")
    private com.sabre.api.sacs.rest.domain.generated.BaseFare BaseFare;
    @JsonProperty("FareConstruction")
    private com.sabre.api.sacs.rest.domain.generated.FareConstruction FareConstruction;
    @JsonProperty("EquivFare")
    private com.sabre.api.sacs.rest.domain.generated.EquivFare EquivFare;
    @JsonProperty("Taxes")
    private com.sabre.api.sacs.rest.domain.generated.Taxes Taxes;
    @JsonProperty("TotalFare")
    private com.sabre.api.sacs.rest.domain.generated.TotalFare TotalFare;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BaseFare
     */
    @JsonProperty("BaseFare")
    public com.sabre.api.sacs.rest.domain.generated.BaseFare getBaseFare() {
        return BaseFare;
    }

    /**
     * 
     * @param BaseFare
     *     The BaseFare
     */
    @JsonProperty("BaseFare")
    public void setBaseFare(com.sabre.api.sacs.rest.domain.generated.BaseFare BaseFare) {
        this.BaseFare = BaseFare;
    }

    public ItinTotalFare withBaseFare(com.sabre.api.sacs.rest.domain.generated.BaseFare BaseFare) {
        this.BaseFare = BaseFare;
        return this;
    }

    /**
     * 
     * @return
     *     The FareConstruction
     */
    @JsonProperty("FareConstruction")
    public com.sabre.api.sacs.rest.domain.generated.FareConstruction getFareConstruction() {
        return FareConstruction;
    }

    /**
     * 
     * @param FareConstruction
     *     The FareConstruction
     */
    @JsonProperty("FareConstruction")
    public void setFareConstruction(com.sabre.api.sacs.rest.domain.generated.FareConstruction FareConstruction) {
        this.FareConstruction = FareConstruction;
    }

    public ItinTotalFare withFareConstruction(com.sabre.api.sacs.rest.domain.generated.FareConstruction FareConstruction) {
        this.FareConstruction = FareConstruction;
        return this;
    }

    /**
     * 
     * @return
     *     The EquivFare
     */
    @JsonProperty("EquivFare")
    public com.sabre.api.sacs.rest.domain.generated.EquivFare getEquivFare() {
        return EquivFare;
    }

    /**
     * 
     * @param EquivFare
     *     The EquivFare
     */
    @JsonProperty("EquivFare")
    public void setEquivFare(com.sabre.api.sacs.rest.domain.generated.EquivFare EquivFare) {
        this.EquivFare = EquivFare;
    }

    public ItinTotalFare withEquivFare(com.sabre.api.sacs.rest.domain.generated.EquivFare EquivFare) {
        this.EquivFare = EquivFare;
        return this;
    }

    /**
     * 
     * @return
     *     The Taxes
     */
    @JsonProperty("Taxes")
    public com.sabre.api.sacs.rest.domain.generated.Taxes getTaxes() {
        return Taxes;
    }

    /**
     * 
     * @param Taxes
     *     The Taxes
     */
    @JsonProperty("Taxes")
    public void setTaxes(com.sabre.api.sacs.rest.domain.generated.Taxes Taxes) {
        this.Taxes = Taxes;
    }

    public ItinTotalFare withTaxes(com.sabre.api.sacs.rest.domain.generated.Taxes Taxes) {
        this.Taxes = Taxes;
        return this;
    }

    /**
     * 
     * @return
     *     The TotalFare
     */
    @JsonProperty("TotalFare")
    public com.sabre.api.sacs.rest.domain.generated.TotalFare getTotalFare() {
        return TotalFare;
    }

    /**
     * 
     * @param TotalFare
     *     The TotalFare
     */
    @JsonProperty("TotalFare")
    public void setTotalFare(com.sabre.api.sacs.rest.domain.generated.TotalFare TotalFare) {
        this.TotalFare = TotalFare;
    }

    public ItinTotalFare withTotalFare(com.sabre.api.sacs.rest.domain.generated.TotalFare TotalFare) {
        this.TotalFare = TotalFare;
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

    public ItinTotalFare withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BaseFare).append(FareConstruction).append(EquivFare).append(Taxes).append(TotalFare).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ItinTotalFare) == false) {
            return false;
        }
        ItinTotalFare rhs = ((ItinTotalFare) other);
        return new EqualsBuilder().append(BaseFare, rhs.BaseFare).append(FareConstruction, rhs.FareConstruction).append(EquivFare, rhs.EquivFare).append(Taxes, rhs.Taxes).append(TotalFare, rhs.TotalFare).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
