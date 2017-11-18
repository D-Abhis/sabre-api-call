
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
    "PassengerTypeQuantity",
    "FareBasisCodes",
    "PassengerFare",
    "Endorsements",
    "TPA_Extensions"
})
public class PTCFareBreakdown {

    @JsonProperty("PassengerTypeQuantity")
    private com.sabre.api.sacs.rest.domain.generated.PassengerTypeQuantity PassengerTypeQuantity;
    @JsonProperty("FareBasisCodes")
    private com.sabre.api.sacs.rest.domain.generated.FareBasisCodes FareBasisCodes;
    @JsonProperty("PassengerFare")
    private com.sabre.api.sacs.rest.domain.generated.PassengerFare PassengerFare;
    @JsonProperty("Endorsements")
    private com.sabre.api.sacs.rest.domain.generated.Endorsements Endorsements;
    @JsonProperty("TPA_Extensions")
    private TPAExtensions__ TPAExtensions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The PassengerTypeQuantity
     */
    @JsonProperty("PassengerTypeQuantity")
    public com.sabre.api.sacs.rest.domain.generated.PassengerTypeQuantity getPassengerTypeQuantity() {
        return PassengerTypeQuantity;
    }

    /**
     * 
     * @param PassengerTypeQuantity
     *     The PassengerTypeQuantity
     */
    @JsonProperty("PassengerTypeQuantity")
    public void setPassengerTypeQuantity(com.sabre.api.sacs.rest.domain.generated.PassengerTypeQuantity PassengerTypeQuantity) {
        this.PassengerTypeQuantity = PassengerTypeQuantity;
    }

    public PTCFareBreakdown withPassengerTypeQuantity(com.sabre.api.sacs.rest.domain.generated.PassengerTypeQuantity PassengerTypeQuantity) {
        this.PassengerTypeQuantity = PassengerTypeQuantity;
        return this;
    }

    /**
     * 
     * @return
     *     The FareBasisCodes
     */
    @JsonProperty("FareBasisCodes")
    public com.sabre.api.sacs.rest.domain.generated.FareBasisCodes getFareBasisCodes() {
        return FareBasisCodes;
    }

    /**
     * 
     * @param FareBasisCodes
     *     The FareBasisCodes
     */
    @JsonProperty("FareBasisCodes")
    public void setFareBasisCodes(com.sabre.api.sacs.rest.domain.generated.FareBasisCodes FareBasisCodes) {
        this.FareBasisCodes = FareBasisCodes;
    }

    public PTCFareBreakdown withFareBasisCodes(com.sabre.api.sacs.rest.domain.generated.FareBasisCodes FareBasisCodes) {
        this.FareBasisCodes = FareBasisCodes;
        return this;
    }

    /**
     * 
     * @return
     *     The PassengerFare
     */
    @JsonProperty("PassengerFare")
    public com.sabre.api.sacs.rest.domain.generated.PassengerFare getPassengerFare() {
        return PassengerFare;
    }

    /**
     * 
     * @param PassengerFare
     *     The PassengerFare
     */
    @JsonProperty("PassengerFare")
    public void setPassengerFare(com.sabre.api.sacs.rest.domain.generated.PassengerFare PassengerFare) {
        this.PassengerFare = PassengerFare;
    }

    public PTCFareBreakdown withPassengerFare(com.sabre.api.sacs.rest.domain.generated.PassengerFare PassengerFare) {
        this.PassengerFare = PassengerFare;
        return this;
    }

    /**
     * 
     * @return
     *     The Endorsements
     */
    @JsonProperty("Endorsements")
    public com.sabre.api.sacs.rest.domain.generated.Endorsements getEndorsements() {
        return Endorsements;
    }

    /**
     * 
     * @param Endorsements
     *     The Endorsements
     */
    @JsonProperty("Endorsements")
    public void setEndorsements(com.sabre.api.sacs.rest.domain.generated.Endorsements Endorsements) {
        this.Endorsements = Endorsements;
    }

    public PTCFareBreakdown withEndorsements(com.sabre.api.sacs.rest.domain.generated.Endorsements Endorsements) {
        this.Endorsements = Endorsements;
        return this;
    }

    /**
     * 
     * @return
     *     The TPAExtensions
     */
    @JsonProperty("TPA_Extensions")
    public TPAExtensions__ getTPAExtensions() {
        return TPAExtensions;
    }

    /**
     * 
     * @param TPAExtensions
     *     The TPA_Extensions
     */
    @JsonProperty("TPA_Extensions")
    public void setTPAExtensions(TPAExtensions__ TPAExtensions) {
        this.TPAExtensions = TPAExtensions;
    }

    public PTCFareBreakdown withTPAExtensions(TPAExtensions__ TPAExtensions) {
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

    public PTCFareBreakdown withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(PassengerTypeQuantity).append(FareBasisCodes).append(PassengerFare).append(Endorsements).append(TPAExtensions).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PTCFareBreakdown) == false) {
            return false;
        }
        PTCFareBreakdown rhs = ((PTCFareBreakdown) other);
        return new EqualsBuilder().append(PassengerTypeQuantity, rhs.PassengerTypeQuantity).append(FareBasisCodes, rhs.FareBasisCodes).append(PassengerFare, rhs.PassengerFare).append(Endorsements, rhs.Endorsements).append(TPAExtensions, rhs.TPAExtensions).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
