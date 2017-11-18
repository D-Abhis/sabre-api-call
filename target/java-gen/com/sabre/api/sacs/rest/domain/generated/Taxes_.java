
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
    "Tax",
    "TotalTax"
})
public class Taxes_ {

    @JsonProperty("Tax")
    private List<Tax_> Tax = new ArrayList<Tax_>();
    @JsonProperty("TotalTax")
    private com.sabre.api.sacs.rest.domain.generated.TotalTax TotalTax;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Tax
     */
    @JsonProperty("Tax")
    public List<Tax_> getTax() {
        return Tax;
    }

    /**
     * 
     * @param Tax
     *     The Tax
     */
    @JsonProperty("Tax")
    public void setTax(List<Tax_> Tax) {
        this.Tax = Tax;
    }

    public Taxes_ withTax(List<Tax_> Tax) {
        this.Tax = Tax;
        return this;
    }

    /**
     * 
     * @return
     *     The TotalTax
     */
    @JsonProperty("TotalTax")
    public com.sabre.api.sacs.rest.domain.generated.TotalTax getTotalTax() {
        return TotalTax;
    }

    /**
     * 
     * @param TotalTax
     *     The TotalTax
     */
    @JsonProperty("TotalTax")
    public void setTotalTax(com.sabre.api.sacs.rest.domain.generated.TotalTax TotalTax) {
        this.TotalTax = TotalTax;
    }

    public Taxes_ withTotalTax(com.sabre.api.sacs.rest.domain.generated.TotalTax TotalTax) {
        this.TotalTax = TotalTax;
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

    public Taxes_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Tax).append(TotalTax).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Taxes_) == false) {
            return false;
        }
        Taxes_ rhs = ((Taxes_) other);
        return new EqualsBuilder().append(Tax, rhs.Tax).append(TotalTax, rhs.TotalTax).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
