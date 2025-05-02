// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDigitalIdentityType", propOrder = { "digitalIdType" })
public class ServiceDigitalIdentityType {
    @XmlElement(name = "DigitalId")
    @JsonProperty("DigitalId")
    private DigitalIdType digitalIdType;

    public ServiceDigitalIdentityType() {
    }

    public DigitalIdType getDigitalIdType() {
        return this.digitalIdType;
    }

    @JsonProperty("DigitalId")
    public void setDigitalIdType(final DigitalIdType digitalIdType) {
        this.digitalIdType = digitalIdType;
    }
}
