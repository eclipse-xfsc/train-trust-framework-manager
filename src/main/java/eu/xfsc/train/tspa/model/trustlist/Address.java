// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Address", propOrder = { "street", "local", "postalCode", "country" })
public class Address implements Serializable {
    @XmlElement(name = "StreetAddress")
    @JsonProperty("StreetAddress")
    private String street;
    @XmlElement(name = "Locality")
    @JsonProperty("Locality")
    private String local;
    @XmlElement(name = "PostalCode")
    @JsonProperty("PostalCode")
    private String postalCode;
    @XmlElement(name = "CountryName")
    @JsonProperty("CountryName")
    private String country;

    public Address() {
    }

    public String getStreet() {
        return this.street;
    }

    public String getLocal() {
        return this.local;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    @JsonProperty("StreetAddress")
    public void setStreet(final String street) {
        this.street = street;
    }

    @JsonProperty("Locality")
    public void setLocal(final String local) {
        this.local = local;
    }

    @JsonProperty("PostalCode")
    public void setPostalCode(final String postalCode) {
        this.postalCode = postalCode;
    }

    @JsonProperty("CountryName")
    public void setCountry(final String country) {
        this.country = country;
    }
}
