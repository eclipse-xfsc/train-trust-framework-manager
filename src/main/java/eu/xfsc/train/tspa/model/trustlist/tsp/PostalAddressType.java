// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = { "city", "country", "postalCode", "state", "streetAddress1",
        "streetAddress2" })
public class PostalAddressType {
    @XmlElement(name = "City")
    @JsonProperty("City")
    private String city;
    @XmlElement(name = "Country")
    @JsonProperty("Country")
    private String country;
    @XmlElement(name = "PostalCode")
    @JsonProperty("PostalCopy")
    private String postalCode;
    @XmlElement(name = "State")
    @JsonProperty("State")
    private String state;
    @XmlElement(name = "StreetAddress1")
    @JsonProperty("StreetAddress1")
    private String streetAddress1;
    @XmlElement(name = "StreetAddress2")
    @JsonProperty("StreetAddress2")
    private String streetAddress2;

    public PostalAddressType() {
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getState() {
        return this.state;
    }

    public String getStreetAddress1() {
        return this.streetAddress1;
    }

    public String getStreetAddress2() {
        return this.streetAddress2;
    }

    @JsonProperty("City")
    public void setCity(final String city) {
        this.city = city;
    }

    @JsonProperty("Country")
    public void setCountry(final String country) {
        this.country = country;
    }

    @JsonProperty("PostalCopy")
    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("State")
    public void setState(final String state) {
        this.state = state;
    }

    @JsonProperty("StreetAddress1")
    public void setStreetAddress1(final String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    @JsonProperty("StreetAddress2")
    public void setStreetAddress2(final String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }
}
