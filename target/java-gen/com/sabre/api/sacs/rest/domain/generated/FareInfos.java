
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
    "FareInfo"
})
public class FareInfos {

    @JsonProperty("FareInfo")
    private List<com.sabre.api.sacs.rest.domain.generated.FareInfo> FareInfo = new ArrayList<com.sabre.api.sacs.rest.domain.generated.FareInfo>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The FareInfo
     */
    @JsonProperty("FareInfo")
    public List<com.sabre.api.sacs.rest.domain.generated.FareInfo> getFareInfo() {
        return FareInfo;
    }

    /**
     * 
     * @param FareInfo
     *     The FareInfo
     */
    @JsonProperty("FareInfo")
    public void setFareInfo(List<com.sabre.api.sacs.rest.domain.generated.FareInfo> FareInfo) {
        this.FareInfo = FareInfo;
    }

    public FareInfos withFareInfo(List<com.sabre.api.sacs.rest.domain.generated.FareInfo> FareInfo) {
        this.FareInfo = FareInfo;
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

    public FareInfos withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(FareInfo).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FareInfos) == false) {
            return false;
        }
        FareInfos rhs = ((FareInfos) other);
        return new EqualsBuilder().append(FareInfo, rhs.FareInfo).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
