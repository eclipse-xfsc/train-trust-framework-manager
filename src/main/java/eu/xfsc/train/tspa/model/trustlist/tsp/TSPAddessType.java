// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPAddessType", propOrder = { "electronicAddress", "postalAddress" })
public class TSPAddessType {
    @XmlElement(name = "ElectronicAddress")
    @JsonProperty("ElectronicAddress")
    private String electronicAddress;
    @XmlElement(name = "PostalAddress")
    @JsonProperty("PostalAddress")
    private PostalAddressType postalAddress;

    public TSPAddessType() {
    }

    public String getElectronicAddress() {
        return this.electronicAddress;
    }

    public PostalAddressType getPostalAddress() {
        return this.postalAddress;
    }

    @JsonProperty("ElectronicAddress")
    public void setElectronicAddress(final String electronicAddress) {
        this.electronicAddress = electronicAddress;
    }

    @JsonProperty("PostalAddress")
    public void setPostalAddress(final PostalAddressType postalAddress) {
        this.postalAddress = postalAddress;
    }
}
