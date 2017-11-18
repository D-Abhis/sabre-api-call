
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
    "Tax"
})
public class Taxes {

    @JsonProperty("Tax")
    private List<com.sabre.api.sacs.rest.domain.generated.Tax> Tax = new ArrayList<com.sabre.api.sacs.rest.domain.generated.Tax>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Tax
     */
    @JsonProperty("Tax")
    public List<com.sabre.api.sacs.rest.domain.generated.Tax> getTax() {
        return Tax;
    }

    /**
     * 
     * @param Tax
     *     The Tax
     */
    @JsonProperty("Tax")
    public void setTax(List<com.sabre.api.sacs.rest.domain.generated.Tax> Tax) {
        this.Tax = Tax;
    }

    public Taxes withTax(List<com.sabre.api.sacs.rest.domain.generated.Tax> Tax) {
        this.Tax = Tax;
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

    public Taxes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Tax).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Taxes) == false) {
            return false;
        }
        Taxes rhs = ((Taxes) other);
        return new EqualsBuilder().append(Tax, rhs.Tax).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
