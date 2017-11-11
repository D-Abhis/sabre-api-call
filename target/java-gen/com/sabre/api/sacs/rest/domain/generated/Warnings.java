
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
    "Warning"
})
public class Warnings {

    @JsonProperty("Warning")
    private List<com.sabre.api.sacs.rest.domain.generated.Warning> Warning = new ArrayList<com.sabre.api.sacs.rest.domain.generated.Warning>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Warning
     */
    @JsonProperty("Warning")
    public List<com.sabre.api.sacs.rest.domain.generated.Warning> getWarning() {
        return Warning;
    }

    /**
     * 
     * @param Warning
     *     The Warning
     */
    @JsonProperty("Warning")
    public void setWarning(List<com.sabre.api.sacs.rest.domain.generated.Warning> Warning) {
        this.Warning = Warning;
    }

    public Warnings withWarning(List<com.sabre.api.sacs.rest.domain.generated.Warning> Warning) {
        this.Warning = Warning;
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

    public Warnings withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Warning).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Warnings) == false) {
            return false;
        }
        Warnings rhs = ((Warnings) other);
        return new EqualsBuilder().append(Warning, rhs.Warning).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
