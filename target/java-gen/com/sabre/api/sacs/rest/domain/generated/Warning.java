
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
    "Type",
    "ShortText",
    "Code",
    "MessageClass",
    "content"
})
public class Warning {

    @JsonProperty("Type")
    private String Type;
    @JsonProperty("ShortText")
    private String ShortText;
    @JsonProperty("Code")
    private String Code;
    @JsonProperty("MessageClass")
    private String MessageClass;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The Type
     */
    @JsonProperty("Type")
    public String getType() {
        return Type;
    }

    /**
     * 
     * @param Type
     *     The Type
     */
    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

    public Warning withType(String Type) {
        this.Type = Type;
        return this;
    }

    /**
     * 
     * @return
     *     The ShortText
     */
    @JsonProperty("ShortText")
    public String getShortText() {
        return ShortText;
    }

    /**
     * 
     * @param ShortText
     *     The ShortText
     */
    @JsonProperty("ShortText")
    public void setShortText(String ShortText) {
        this.ShortText = ShortText;
    }

    public Warning withShortText(String ShortText) {
        this.ShortText = ShortText;
        return this;
    }

    /**
     * 
     * @return
     *     The Code
     */
    @JsonProperty("Code")
    public String getCode() {
        return Code;
    }

    /**
     * 
     * @param Code
     *     The Code
     */
    @JsonProperty("Code")
    public void setCode(String Code) {
        this.Code = Code;
    }

    public Warning withCode(String Code) {
        this.Code = Code;
        return this;
    }

    /**
     * 
     * @return
     *     The MessageClass
     */
    @JsonProperty("MessageClass")
    public String getMessageClass() {
        return MessageClass;
    }

    /**
     * 
     * @param MessageClass
     *     The MessageClass
     */
    @JsonProperty("MessageClass")
    public void setMessageClass(String MessageClass) {
        this.MessageClass = MessageClass;
    }

    public Warning withMessageClass(String MessageClass) {
        this.MessageClass = MessageClass;
        return this;
    }

    /**
     * 
     * @return
     *     The content
     */
    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    /**
     * 
     * @param content
     *     The content
     */
    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    public Warning withContent(String content) {
        this.content = content;
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

    public Warning withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(Type).append(ShortText).append(Code).append(MessageClass).append(content).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Warning) == false) {
            return false;
        }
        Warning rhs = ((Warning) other);
        return new EqualsBuilder().append(Type, rhs.Type).append(ShortText, rhs.ShortText).append(Code, rhs.Code).append(MessageClass, rhs.MessageClass).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
