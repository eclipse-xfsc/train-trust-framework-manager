// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalServiceInformationType", propOrder = { "serviceBusinessRulesURI", "serviceGovernanceURI",
        "serviceIssuedCredentialTypes", "serviceContractType", "servicePolicySet", "serviceSchemaURI",
        "serviceSupplyPoint" })
public class AdditionalServiceInformationType {
    @XmlElement(name = "ServiceBusinessRulesURI")
    @JsonProperty("ServiceBusinessRulesURI")
    private String serviceBusinessRulesURI;
    @XmlElement(name = "ServiceGovernanceURI")
    @JsonProperty("ServiceGovernanceURI")
    private String serviceGovernanceURI;
    @XmlElement(name = "ServiceIssuedCredentialTypes")
    @JsonProperty("ServiceIssuedCredentialTypes")
    private ServiceIssuedCredentialType serviceIssuedCredentialTypes;
    @XmlElement(name = "ServiceContractType")
    @JsonProperty("ServiceContractType")
    private String serviceContractType;
    @XmlElement(name = "ServicePolicySet")
    @JsonProperty("ServicePolicySet")
    private String servicePolicySet;
    @XmlElement(name = "ServiceSchemaURI")
    @JsonProperty("ServiceSchemaURI")
    private String serviceSchemaURI;
    @XmlElement(name = "ServiceSupplyPoint")
    @JsonProperty("ServiceSupplyPoint")
    private String serviceSupplyPoint;

    public AdditionalServiceInformationType() {
    }

    public String getServiceBusinessRulesURI() {
        return this.serviceBusinessRulesURI;
    }

    public String getServiceGovernanceURI() {
        return this.serviceGovernanceURI;
    }

    public ServiceIssuedCredentialType getServiceIssuedCredentialTypes() {
        return this.serviceIssuedCredentialTypes;
    }

    public String getServiceContractType() {
        return this.serviceContractType;
    }

    public String getServicePolicySet() {
        return this.servicePolicySet;
    }

    public String getServiceSchemaURI() {
        return this.serviceSchemaURI;
    }

    public String getServiceSupplyPoint() {
        return this.serviceSupplyPoint;
    }

    @JsonProperty("ServiceBusinessRulesURI")
    public void setServiceBusinessRulesURI(final String serviceBusinessRulesURI) {
        this.serviceBusinessRulesURI = serviceBusinessRulesURI;
    }

    @JsonProperty("ServiceGovernanceURI")
    public void setServiceGovernanceURI(final String serviceGovernanceURI) {
        this.serviceGovernanceURI = serviceGovernanceURI;
    }

    @JsonProperty("ServiceIssuedCredentialTypes")
    public void setServiceIssuedCredentialTypes(final ServiceIssuedCredentialType serviceIssuedCredentialTypes) {
        this.serviceIssuedCredentialTypes = serviceIssuedCredentialTypes;
    }

    @JsonProperty("ServiceContractType")
    public void setServiceContractType(final String serviceContractType) {
        this.serviceContractType = serviceContractType;
    }

    @JsonProperty("ServicePolicySet")
    public void setServicePolicySet(final String servicePolicySet) {
        this.servicePolicySet = servicePolicySet;
    }

    @JsonProperty("ServiceSchemaURI")
    public void setServiceSchemaURI(final String serviceSchemaURI) {
        this.serviceSchemaURI = serviceSchemaURI;
    }

    @JsonProperty("ServiceSupplyPoint")
    public void setServiceSupplyPoint(final String serviceSupplyPoint) {
        this.serviceSupplyPoint = serviceSupplyPoint;
    }
}
