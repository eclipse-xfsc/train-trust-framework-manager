// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPServiceType", propOrder = { "serviceName", "serviceTypeIdentifier", "serviceCurrentStatus",
        "statusStartingTime", "serviceDefinitionURI", "serviceDigitalIdentity", "additionalServiceInformation" })
public class TSPServiceType {
    @XmlElement(name = "ServiceName")
    @JsonProperty("ServiceName")
    private String serviceName;
    @XmlElement(name = "ServiceTypeIdentifier")
    @JsonProperty("ServiceTypeIdentifier")
    private String serviceTypeIdentifier;
    @XmlElement(name = "ServiceCurrentStatus")
    @JsonProperty("ServiceCurrentStatus")
    private String serviceCurrentStatus;
    @XmlElement(name = "StatusStartingTime")
    @JsonProperty("StatusStartingTime")
    private String statusStartingTime;
    @XmlElement(name = "ServiceDefinitionURI")
    @JsonProperty("ServiceDefinitionURI")
    private String serviceDefinitionURI;
    @XmlElement(name = "ServiceDigitalIdentity")
    @JsonProperty("ServiceDigitalIdentity")
    private ServiceDigitalIdentityType serviceDigitalIdentity;
    @XmlElement(name = "AdditionalServiceInformation")
    @JsonProperty("AdditionalServiceInformation")
    private AdditionalServiceInformationType additionalServiceInformation;

    public TSPServiceType() {
    }

    public String getServiceName() {
        return this.serviceName;
    }

    public String getServiceTypeIdentifier() {
        return this.serviceTypeIdentifier;
    }

    public String getServiceCurrentStatus() {
        return this.serviceCurrentStatus;
    }

    public String getStatusStartingTime() {
        return this.statusStartingTime;
    }

    public String getServiceDefinitionURI() {
        return this.serviceDefinitionURI;
    }

    public ServiceDigitalIdentityType getServiceDigitalIdentity() {
        return this.serviceDigitalIdentity;
    }

    public AdditionalServiceInformationType getAdditionalServiceInformation() {
        return this.additionalServiceInformation;
    }

    @JsonProperty("ServiceName")
    public void setServiceName(final String serviceName) {
        this.serviceName = serviceName;
    }

    @JsonProperty("ServiceTypeIdentifier")
    public void setServiceTypeIdentifier(final String serviceTypeIdentifier) {
        this.serviceTypeIdentifier = serviceTypeIdentifier;
    }

    @JsonProperty("ServiceCurrentStatus")
    public void setServiceCurrentStatus(final String serviceCurrentStatus) {
        this.serviceCurrentStatus = serviceCurrentStatus;
    }

    @JsonProperty("StatusStartingTime")
    public void setStatusStartingTime(final String statusStartingTime) {
        this.statusStartingTime = statusStartingTime;
    }

    @JsonProperty("ServiceDefinitionURI")
    public void setServiceDefinitionURI(final String serviceDefinitionURI) {
        this.serviceDefinitionURI = serviceDefinitionURI;
    }

    @JsonProperty("ServiceDigitalIdentity")
    public void setServiceDigitalIdentity(final ServiceDigitalIdentityType serviceDigitalIdentity) {
        this.serviceDigitalIdentity = serviceDigitalIdentity;
    }

    @JsonProperty("AdditionalServiceInformation")
    public void setAdditionalServiceInformation(final AdditionalServiceInformationType additionalServiceInformation) {
        this.additionalServiceInformation = additionalServiceInformation;
    }
}
