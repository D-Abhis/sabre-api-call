
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
    "Amount",
    "CurrencyCode"
})
public class BaseFare_ {

    @JsonProperty("Amount")
    private Double Amount;
    @JsonProperty("CurrencyCode")
    private String CurrencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Amount
     */
    @JsonProperty("Amount")
    public Double getAmount() {
        return Amount;
    }

    /**
     * 
     * @param Amount
     *     The Amount
     */
    @JsonProperty("Amount")
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public BaseFare_ withAmount(Double Amount) {
        this.Amount = Amount;
        return this;
    }

    /**
     * 
     * @return
     *     The CurrencyCode
     */
    @JsonProperty("CurrencyCode")
    public String getCurrencyCode() {
        return CurrencyCode;
    }

    /**
     * 
     * @param CurrencyCode
     *     The CurrencyCode
     */
    @JsonProperty("CurrencyCode")
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    public BaseFare_ withCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
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

    public BaseFare_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Amount).append(CurrencyCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseFare_) == false) {
            return false;
        }
        BaseFare_ rhs = ((BaseFare_) other);
        return new EqualsBuilder().append(Amount, rhs.Amount).append(CurrencyCode, rhs.CurrencyCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
