
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
    "OriginDestinationOption"
})
public class OriginDestinationOptions {

    @JsonProperty("OriginDestinationOption")
    private List<com.sabre.api.sacs.rest.domain.generated.OriginDestinationOption> OriginDestinationOption = new ArrayList<com.sabre.api.sacs.rest.domain.generated.OriginDestinationOption>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The OriginDestinationOption
     */
    @JsonProperty("OriginDestinationOption")
    public List<com.sabre.api.sacs.rest.domain.generated.OriginDestinationOption> getOriginDestinationOption() {
        return OriginDestinationOption;
    }

    /**
     * 
     * @param OriginDestinationOption
     *     The OriginDestinationOption
     */
    @JsonProperty("OriginDestinationOption")
    public void setOriginDestinationOption(List<com.sabre.api.sacs.rest.domain.generated.OriginDestinationOption> OriginDestinationOption) {
        this.OriginDestinationOption = OriginDestinationOption;
    }

    public OriginDestinationOptions withOriginDestinationOption(List<com.sabre.api.sacs.rest.domain.generated.OriginDestinationOption> OriginDestinationOption) {
        this.OriginDestinationOption = OriginDestinationOption;
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

    public OriginDestinationOptions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(OriginDestinationOption).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OriginDestinationOptions) == false) {
            return false;
        }
        OriginDestinationOptions rhs = ((OriginDestinationOptions) other);
        return new EqualsBuilder().append(OriginDestinationOption, rhs.OriginDestinationOption).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
