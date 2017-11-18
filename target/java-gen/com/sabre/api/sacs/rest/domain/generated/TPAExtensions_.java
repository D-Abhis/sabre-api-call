
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
    "Messages",
    "BaggageInformationList"
})
public class TPAExtensions_ {

    @JsonProperty("Messages")
    private com.sabre.api.sacs.rest.domain.generated.Messages Messages;
    @JsonProperty("BaggageInformationList")
    private com.sabre.api.sacs.rest.domain.generated.BaggageInformationList BaggageInformationList;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Messages
     */
    @JsonProperty("Messages")
    public com.sabre.api.sacs.rest.domain.generated.Messages getMessages() {
        return Messages;
    }

    /**
     * 
     * @param Messages
     *     The Messages
     */
    @JsonProperty("Messages")
    public void setMessages(com.sabre.api.sacs.rest.domain.generated.Messages Messages) {
        this.Messages = Messages;
    }

    public TPAExtensions_ withMessages(com.sabre.api.sacs.rest.domain.generated.Messages Messages) {
        this.Messages = Messages;
        return this;
    }

    /**
     * 
     * @return
     *     The BaggageInformationList
     */
    @JsonProperty("BaggageInformationList")
    public com.sabre.api.sacs.rest.domain.generated.BaggageInformationList getBaggageInformationList() {
        return BaggageInformationList;
    }

    /**
     * 
     * @param BaggageInformationList
     *     The BaggageInformationList
     */
    @JsonProperty("BaggageInformationList")
    public void setBaggageInformationList(com.sabre.api.sacs.rest.domain.generated.BaggageInformationList BaggageInformationList) {
        this.BaggageInformationList = BaggageInformationList;
    }

    public TPAExtensions_ withBaggageInformationList(com.sabre.api.sacs.rest.domain.generated.BaggageInformationList BaggageInformationList) {
        this.BaggageInformationList = BaggageInformationList;
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

    public TPAExtensions_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Messages).append(BaggageInformationList).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TPAExtensions_) == false) {
            return false;
        }
        TPAExtensions_ rhs = ((TPAExtensions_) other);
        return new EqualsBuilder().append(Messages, rhs.Messages).append(BaggageInformationList, rhs.BaggageInformationList).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
