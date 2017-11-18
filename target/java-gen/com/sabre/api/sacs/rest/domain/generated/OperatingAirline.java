
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
    "CompanyShortName",
    "Code",
    "FlightNumber",
    "content"
})
public class OperatingAirline {

    @JsonProperty("CompanyShortName")
    private String CompanyShortName;
    @JsonProperty("Code")
    private String Code;
    @JsonProperty("FlightNumber")
    private String FlightNumber;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The CompanyShortName
     */
    @JsonProperty("CompanyShortName")
    public String getCompanyShortName() {
        return CompanyShortName;
    }

    /**
     * 
     * @param CompanyShortName
     *     The CompanyShortName
     */
    @JsonProperty("CompanyShortName")
    public void setCompanyShortName(String CompanyShortName) {
        this.CompanyShortName = CompanyShortName;
    }

    public OperatingAirline withCompanyShortName(String CompanyShortName) {
        this.CompanyShortName = CompanyShortName;
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

    public OperatingAirline withCode(String Code) {
        this.Code = Code;
        return this;
    }

    /**
     * 
     * @return
     *     The FlightNumber
     */
    @JsonProperty("FlightNumber")
    public String getFlightNumber() {
        return FlightNumber;
    }

    /**
     * 
     * @param FlightNumber
     *     The FlightNumber
     */
    @JsonProperty("FlightNumber")
    public void setFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
    }

    public OperatingAirline withFlightNumber(String FlightNumber) {
        this.FlightNumber = FlightNumber;
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

    public OperatingAirline withContent(String content) {
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

    public OperatingAirline withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(CompanyShortName).append(Code).append(FlightNumber).append(content).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperatingAirline) == false) {
            return false;
        }
        OperatingAirline rhs = ((OperatingAirline) other);
        return new EqualsBuilder().append(CompanyShortName, rhs.CompanyShortName).append(Code, rhs.Code).append(FlightNumber, rhs.FlightNumber).append(content, rhs.content).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
