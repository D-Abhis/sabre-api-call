
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
    "Message"
})
public class Messages {

    @JsonProperty("Message")
    private List<com.sabre.api.sacs.rest.domain.generated.Message> Message = new ArrayList<com.sabre.api.sacs.rest.domain.generated.Message>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Message
     */
    @JsonProperty("Message")
    public List<com.sabre.api.sacs.rest.domain.generated.Message> getMessage() {
        return Message;
    }

    /**
     * 
     * @param Message
     *     The Message
     */
    @JsonProperty("Message")
    public void setMessage(List<com.sabre.api.sacs.rest.domain.generated.Message> Message) {
        this.Message = Message;
    }

    public Messages withMessage(List<com.sabre.api.sacs.rest.domain.generated.Message> Message) {
        this.Message = Message;
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

    public Messages withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Message).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Messages) == false) {
            return false;
        }
        Messages rhs = ((Messages) other);
        return new EqualsBuilder().append(Message, rhs.Message).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
