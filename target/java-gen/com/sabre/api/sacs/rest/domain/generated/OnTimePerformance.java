
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
    "Level"
})
public class OnTimePerformance {

    @JsonProperty("Level")
    private String Level;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Level
     */
    @JsonProperty("Level")
    public String getLevel() {
        return Level;
    }

    /**
     * 
     * @param Level
     *     The Level
     */
    @JsonProperty("Level")
    public void setLevel(String Level) {
        this.Level = Level;
    }

    public OnTimePerformance withLevel(String Level) {
        this.Level = Level;
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

    public OnTimePerformance withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Level).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OnTimePerformance) == false) {
            return false;
        }
        OnTimePerformance rhs = ((OnTimePerformance) other);
        return new EqualsBuilder().append(Level, rhs.Level).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
