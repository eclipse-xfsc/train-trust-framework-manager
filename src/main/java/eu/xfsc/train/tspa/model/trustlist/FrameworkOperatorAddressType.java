// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkOperatorAddressType", propOrder = { "postalAddresses", "electronicAddress" })
public class FrameworkOperatorAddressType implements Serializable {
    @XmlElement(name = "PostalAddresses")
    @JsonProperty("PostalAddresses")
    private PostalAddressesType postalAddresses;
    @XmlElement(name = "ElectronicAddress")
    @JsonProperty("ElectronicAddress")
    private URIType electronicAddress;

    public FrameworkOperatorAddressType() {
    }

    public PostalAddressesType getPostalAddresses() {
        return this.postalAddresses;
    }

    public URIType getElectronicAddress() {
        return this.electronicAddress;
    }

    @JsonProperty("PostalAddresses")
    public void setPostalAddresses(final PostalAddressesType postalAddresses) {
        this.postalAddresses = postalAddresses;
    }

    @JsonProperty("ElectronicAddress")
    public void setElectronicAddress(final URIType electronicAddress) {
        this.electronicAddress = electronicAddress;
    }
}
