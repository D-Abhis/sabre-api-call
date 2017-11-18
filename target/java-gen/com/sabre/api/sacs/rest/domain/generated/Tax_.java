
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
    "TaxCode",
    "Amount",
    "CurrencyCode",
    "DecimalPlaces",
    "content"
})
public class Tax_ {

    @JsonProperty("TaxCode")
    private String TaxCode;
    @JsonProperty("Amount")
    private Double Amount;
    @JsonProperty("CurrencyCode")
    private String CurrencyCode;
    @JsonProperty("DecimalPlaces")
    private Integer DecimalPlaces;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The TaxCode
     */
    @JsonProperty("TaxCode")
    public String getTaxCode() {
        return TaxCode;
    }

    /**
     * 
     * @param TaxCode
     *     The TaxCode
     */
    @JsonProperty("TaxCode")
    public void setTaxCode(String TaxCode) {
        this.TaxCode = TaxCode;
    }

    public Tax_ withTaxCode(String TaxCode) {
        this.TaxCode = TaxCode;
        return this;
    }

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

    public Tax_ withAmount(Double Amount) {
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

    public Tax_ withCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
        return this;
    }

    /**
     * 
     * @return
     *     The DecimalPlaces
     */
    @JsonProperty("DecimalPlaces")
    public Integer getDecimalPlaces() {
        return DecimalPlaces;
    }

    /**
     * 
     * @param DecimalPlaces
     *     The DecimalPlaces
     */
    @JsonProperty("DecimalPlaces")
    public void setDecimalPlaces(Integer DecimalPlaces) {
        this.DecimalPlaces = DecimalPlaces;
    }

    public Tax_ withDecimalPlaces(Integer DecimalPlaces) {
        this.DecimalPlaces = DecimalPlaces;
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

    public Tax_ withContent(String content) {
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

    public Tax_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(TaxCode).append(Amount).append(CurrencyCode).append(DecimalPlaces).append(content).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Tax_) == false) {
            return false;
        }
        Tax_ rhs = ((Tax_) other);
        return new EqualsBuilder().append(TaxCode, rhs.TaxCode).append(Amount, rhs.Amount).append(CurrencyCode, rhs.CurrencyCode).append(DecimalPlaces, rhs.DecimalPlaces).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
