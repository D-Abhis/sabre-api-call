
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
    "eTicket"
})
public class TPAExtensions {

    @JsonProperty("eTicket")
    private ETicket eTicket;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The eTicket
     */
    @JsonProperty("eTicket")
    public ETicket getETicket() {
        return eTicket;
    }

    /**
     * 
     * @param eTicket
     *     The eTicket
     */
    @JsonProperty("eTicket")
    public void setETicket(ETicket eTicket) {
        this.eTicket = eTicket;
    }

    public TPAExtensions withETicket(ETicket eTicket) {
        this.eTicket = eTicket;
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

    public TPAExtensions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eTicket).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions) == false) {
            return false;
        }
        TPAExtensions rhs = ((TPAExtensions) other);
        return new EqualsBuilder().append(eTicket, rhs.eTicket).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
