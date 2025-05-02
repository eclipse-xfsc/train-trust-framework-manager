// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPCustomType", propOrder = { "uUID", "tSPName", "tSPTradeName", "tSPInformation", "tSPServices" })
public class TSPCustomType {
    @XmlElement(name = "UUID")
    @JsonProperty("UUID")
    private String uUID;
    @XmlElement(name = "TSPName")
    @JsonProperty("TSPName")
    private String tSPName;
    @XmlElement(name = "TSPTradeName")
    @JsonProperty("TSPTradeName")
    private String tSPTradeName;
    @XmlElement(name = "TSPInformation")
    @JsonProperty("TSPInformation")
    private TSPInformationType tSPInformation;
    @XmlElement(name = "TSPServices")
    @JsonProperty("TSPServices")
    private TSPServicesListType tSPServices;

    public TSPCustomType() {
    }

    public String getUUID() {
        return this.uUID;
    }

    public String getTSPName() {
        return this.tSPName;
    }

    public String getTSPTradeName() {
        return this.tSPTradeName;
    }

    public TSPInformationType getTSPInformation() {
        return this.tSPInformation;
    }

    public TSPServicesListType getTSPServices() {
        return this.tSPServices;
    }

    @JsonProperty("UUID")
    public void setUUID(final String uUID) {
        this.uUID = uUID;
    }

    @JsonProperty("TSPName")
    public void setTSPName(final String tSPName) {
        this.tSPName = tSPName;
    }

    @JsonProperty("TSPTradeName")
    public void setTSPTradeName(final String tSPTradeName) {
        this.tSPTradeName = tSPTradeName;
    }

    @JsonProperty("TSPInformation")
    public void setTSPInformation(final TSPInformationType tSPInformation) {
        this.tSPInformation = tSPInformation;
    }

    @JsonProperty("TSPServices")
    public void setTSPServices(final TSPServicesListType tSPServices) {
        this.tSPServices = tSPServices;
    }
}
