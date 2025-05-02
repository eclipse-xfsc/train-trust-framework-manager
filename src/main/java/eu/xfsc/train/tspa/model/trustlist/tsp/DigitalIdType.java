// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DigitalIdType", propOrder = { "x509Certificate", "did" })
public class DigitalIdType {
    @XmlElement(name = "X509Certificate")
    @JsonProperty("X509Certificate")
    private String x509Certificate;
    @XmlElement(name = "DID")
    @JsonProperty("DID")
    private String did;

    public DigitalIdType() {
    }

    public String getX509Certificate() {
        return this.x509Certificate;
    }

    public String getDid() {
        return this.did;
    }

    @JsonProperty("X509Certificate")
    public void setX509Certificate(final String x509Certificate) {
        this.x509Certificate = x509Certificate;
    }

    @JsonProperty("DID")
    public void setDid(final String did) {
        this.did = did;
    }
}
