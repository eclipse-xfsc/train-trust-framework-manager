// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPInformationType", propOrder = { "tspAddress", "tSPCertificationList", "tSPEntityIdentifierList",
        "tSPInformationURI" })
public class TSPInformationType {
    @XmlElement(name = "Address")
    @JsonProperty("Address")
    private TSPAddessType tspAddress;
    @XmlElement(name = "TSPCertificationList")
    @JsonProperty("TSPCertificationList")
    private TSPCertificationListType tSPCertificationList;
    @XmlElement(name = "TSPEntityIdentifierList")
    @JsonProperty("TSPEntityIdentifierList")
    private TSPEntityIdentifierListType tSPEntityIdentifierList;
    @XmlElement(name = "TSPInformationURI")
    @JsonProperty("TSPInformationURI")
    private String tSPInformationURI;

    public TSPInformationType() {
    }

    public TSPAddessType getTspAddress() {
        return this.tspAddress;
    }

    public TSPCertificationListType getTSPCertificationList() {
        return this.tSPCertificationList;
    }

    public TSPEntityIdentifierListType getTSPEntityIdentifierList() {
        return this.tSPEntityIdentifierList;
    }

    public String getTSPInformationURI() {
        return this.tSPInformationURI;
    }

    @JsonProperty("Address")
    public void setTspAddress(final TSPAddessType tspAddress) {
        this.tspAddress = tspAddress;
    }

    @JsonProperty("TSPCertificationList")
    public void setTSPCertificationList(final TSPCertificationListType tSPCertificationList) {
        this.tSPCertificationList = tSPCertificationList;
    }

    @JsonProperty("TSPEntityIdentifierList")
    public void setTSPEntityIdentifierList(final TSPEntityIdentifierListType tSPEntityIdentifierList) {
        this.tSPEntityIdentifierList = tSPEntityIdentifierList;
    }

    @JsonProperty("TSPInformationURI")
    public void setTSPInformationURI(final String tSPInformationURI) {
        this.tSPInformationURI = tSPInformationURI;
    }
}
