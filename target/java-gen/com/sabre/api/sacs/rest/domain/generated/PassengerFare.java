
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
    "TotalFare",
    "TPA_Extensions"
})
public class PassengerFare {

    @JsonProperty("BaseFare")
    private BaseFare_ BaseFare;
    @JsonProperty("FareConstruction")
    private FareConstruction_ FareConstruction;
    @JsonProperty("EquivFare")
    private EquivFare_ EquivFare;
    @JsonProperty("Taxes")
    private Taxes_ Taxes;
    @JsonProperty("TotalFare")
    private TotalFare_ TotalFare;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions_ TPAExtensions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The BaseFare
     */
    @JsonProperty("BaseFare")
    public BaseFare_ getBaseFare() {
        return BaseFare;
    }

    /**
     * 
     * @param BaseFare
     *     The BaseFare
     */
    @JsonProperty("BaseFare")
    public void setBaseFare(BaseFare_ BaseFare) {
        this.BaseFare = BaseFare;
    }

    public PassengerFare withBaseFare(BaseFare_ BaseFare) {
        this.BaseFare = BaseFare;
        return this;
    }

    /**
     * 
     * @return
     *     The FareConstruction
     */
    @JsonProperty("FareConstruction")
    public FareConstruction_ getFareConstruction() {
        return FareConstruction;
    }

    /**
     * 
     * @param FareConstruction
     *     The FareConstruction
     */
    @JsonProperty("FareConstruction")
    public void setFareConstruction(FareConstruction_ FareConstruction) {
        this.FareConstruction = FareConstruction;
    }

    public PassengerFare withFareConstruction(FareConstruction_ FareConstruction) {
        this.FareConstruction = FareConstruction;
        return this;
    }

    /**
     * 
     * @return
     *     The EquivFare
     */
    @JsonProperty("EquivFare")
    public EquivFare_ getEquivFare() {
        return EquivFare;
    }

    /**
     * 
     * @param EquivFare
     *     The EquivFare
     */
    @JsonProperty("EquivFare")
    public void setEquivFare(EquivFare_ EquivFare) {
        this.EquivFare = EquivFare;
    }

    public PassengerFare withEquivFare(EquivFare_ EquivFare) {
        this.EquivFare = EquivFare;
        return this;
    }

    /**
     * 
     * @return
     *     The Taxes
     */
    @JsonProperty("Taxes")
    public Taxes_ getTaxes() {
        return Taxes;
    }

    /**
     * 
     * @param Taxes
     *     The Taxes
     */
    @JsonProperty("Taxes")
    public void setTaxes(Taxes_ Taxes) {
        this.Taxes = Taxes;
    }

    public PassengerFare withTaxes(Taxes_ Taxes) {
        this.Taxes = Taxes;
        return this;
    }

    /**
     * 
     * @return
     *     The TotalFare
     */
    @JsonProperty("TotalFare")
    public TotalFare_ getTotalFare() {
        return TotalFare;
    }

    /**
     * 
     * @param TotalFare
     *     The TotalFare
     */
    @JsonProperty("TotalFare")
    public void setTotalFare(TotalFare_ TotalFare) {
        this.TotalFare = TotalFare;
    }

    public PassengerFare withTotalFare(TotalFare_ TotalFare) {
        this.TotalFare = TotalFare;
        return this;
    }

    /**
     * 
     * @return
     *     The TPAExtensions
     */
    @JsonProperty("TPA_Extensions")
    public TPAExtensions_ getTPAExtensions() {
        return TPAExtensions;
    }

    /**
     * 
     * @param TPAExtensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions_ TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    public PassengerFare withTPAExtensions(TPAExtensions_ TPAExtensions) {
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

    public PassengerFare withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(BaseFare).append(FareConstruction).append(EquivFare).append(Taxes).append(TotalFare).append(TPAExtensions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PassengerFare) == false) {
            return false;
        }
        PassengerFare rhs = ((PassengerFare) other);
        return new EqualsBuilder().append(BaseFare, rhs.BaseFare).append(FareConstruction, rhs.FareConstruction).append(EquivFare, rhs.EquivFare).append(Taxes, rhs.Taxes).append(TotalFare, rhs.TotalFare).append(TPAExtensions, rhs.TPAExtensions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
