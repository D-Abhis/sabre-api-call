
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
    "OTA_AirLowFareSearchRS",
    "Links"
})
public class BfmV186Response {

    @JsonProperty("OTA_AirLowFareSearchRS")
    private com.sabre.api.sacs.rest.domain.generated.OTAAirLowFareSearchRS OTAAirLowFareSearchRS;
    @JsonProperty("Links")
    private List<Link> Links = new ArrayList<Link>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The OTAAirLowFareSearchRS
     */
    @JsonProperty("OTA_AirLowFareSearchRS")
    public com.sabre.api.sacs.rest.domain.generated.OTAAirLowFareSearchRS getOTAAirLowFareSearchRS() {
        return OTAAirLowFareSearchRS;
    }

    /**
     * 
     * @param OTAAirLowFareSearchRS
     *     The OTA_AirLowFareSearchRS
     */
    @JsonProperty("OTA_AirLowFareSearchRS")
    public void setOTAAirLowFareSearchRS(com.sabre.api.sacs.rest.domain.generated.OTAAirLowFareSearchRS OTAAirLowFareSearchRS) {
        this.OTAAirLowFareSearchRS = OTAAirLowFareSearchRS;
    }

    public BfmV186Response withOTAAirLowFareSearchRS(com.sabre.api.sacs.rest.domain.generated.OTAAirLowFareSearchRS OTAAirLowFareSearchRS) {
        this.OTAAirLowFareSearchRS = OTAAirLowFareSearchRS;
        return this;
    }

    /**
     * 
     * @return
     *     The Links
     */
    @JsonProperty("Links")
    public List<Link> getLinks() {
        return Links;
    }

    /**
     * 
     * @param Links
     *     The Links
     */
    @JsonProperty("Links")
    public void setLinks(List<Link> Links) {
        this.Links = Links;
    }

    public BfmV186Response withLinks(List<Link> Links) {
        this.Links = Links;
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

    public BfmV186Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(OTAAirLowFareSearchRS).append(Links).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BfmV186Response) == false) {
            return false;
        }
        BfmV186Response rhs = ((BfmV186Response) other);
        return new EqualsBuilder().append(OTAAirLowFareSearchRS, rhs.OTAAirLowFareSearchRS).append(Links, rhs.Links).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
