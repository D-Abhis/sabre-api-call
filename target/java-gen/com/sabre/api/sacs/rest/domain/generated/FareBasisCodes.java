
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
    "FareBasisCode"
})
public class FareBasisCodes {

    @JsonProperty("FareBasisCode")
    private List<com.sabre.api.sacs.rest.domain.generated.FareBasisCode> FareBasisCode = new ArrayList<com.sabre.api.sacs.rest.domain.generated.FareBasisCode>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FareBasisCode
     */
    @JsonProperty("FareBasisCode")
    public List<com.sabre.api.sacs.rest.domain.generated.FareBasisCode> getFareBasisCode() {
        return FareBasisCode;
    }

    /**
     * 
     * @param FareBasisCode
     *     The FareBasisCode
     */
    @JsonProperty("FareBasisCode")
    public void setFareBasisCode(List<com.sabre.api.sacs.rest.domain.generated.FareBasisCode> FareBasisCode) {
        this.FareBasisCode = FareBasisCode;
    }

    public FareBasisCodes withFareBasisCode(List<com.sabre.api.sacs.rest.domain.generated.FareBasisCode> FareBasisCode) {
        this.FareBasisCode = FareBasisCode;
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

    public FareBasisCodes withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(FareBasisCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareBasisCodes) == false) {
            return false;
        }
        FareBasisCodes rhs = ((FareBasisCodes) other);
        return new EqualsBuilder().append(FareBasisCode, rhs.FareBasisCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
