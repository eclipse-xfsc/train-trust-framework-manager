// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrameworkInformationType", propOrder = { "tSLVersionIdentifier", "tSLSequenceNumber", "tSLType",
        "frameworkOperatorName", "frameworkOperatorAddress", "frameworkName", "frameworkInformationURI",
        "frameworkAuditURI", "frameworkTypeCommunityRules", "frameworkScope", "policyOrLegalNotice",
        "listIssueDateTime" })
public class FrameworkInformationType {
    @XmlElement(name = "TSLVersionIdentifier")
    @JsonProperty("TSLVersionIdentifier")
    private int tSLVersionIdentifier;
    @XmlElement(name = "TSLSequenceNumber")
    @JsonProperty("TSLSequenceNumber")
    private int tSLSequenceNumber;
    @XmlElement(name = "TSLType")
    @JsonProperty("TSLType")
    private String tSLType;
    @XmlElement(name = "FrameworkOperatorName")
    @JsonProperty("FrameworkOperatorName")
    private NameType frameworkOperatorName;
    @XmlElement(name = "FrameworkOperatorAddress")
    @JsonProperty("FrameworkOperatorAddress")
    private FrameworkOperatorAddressType frameworkOperatorAddress;
    @XmlElement(name = "FrameworkName")
    @JsonProperty("FrameworkName")
    private NameType frameworkName;
    @XmlElement(name = "FrameworkInformationURI")
    @JsonProperty("FrameworkInformationURI")
    private URIType frameworkInformationURI;
    @XmlElement(name = "FrameworkAuditURI")
    @JsonProperty("FrameworkAuditURI")
    private URIType frameworkAuditURI;
    @XmlElement(name = "FrameworkTypeCommunityRules")
    @JsonProperty("FrameworkTypeCommunityRules")
    private URIType frameworkTypeCommunityRules;
    @XmlElement(name = "FrameworkScope")
    @JsonProperty("FrameworkScope")
    private String frameworkScope;
    @XmlElement(name = "PolicyOrLegalNotice")
    @JsonProperty("PolicyOrLegalNotice")
    private PolicyOrLegalNoticeType policyOrLegalNotice;
    @XmlElement(name = "ListIssueDateTime")
    @JsonProperty("ListIssueDateTime")
    private String listIssueDateTime;

    public FrameworkInformationType() {
    }

    public int getTSLVersionIdentifier() {
        return this.tSLVersionIdentifier;
    }

    public int getTSLSequenceNumber() {
        return this.tSLSequenceNumber;
    }

    public String getTSLType() {
        return this.tSLType;
    }

    public NameType getFrameworkOperatorName() {
        return this.frameworkOperatorName;
    }

    public FrameworkOperatorAddressType getFrameworkOperatorAddress() {
        return this.frameworkOperatorAddress;
    }

    public NameType getFrameworkName() {
        return this.frameworkName;
    }

    public URIType getFrameworkInformationURI() {
        return this.frameworkInformationURI;
    }

    public URIType getFrameworkAuditURI() {
        return this.frameworkAuditURI;
    }

    public URIType getFrameworkTypeCommunityRules() {
        return this.frameworkTypeCommunityRules;
    }

    public String getFrameworkScope() {
        return this.frameworkScope;
    }

    public PolicyOrLegalNoticeType getPolicyOrLegalNotice() {
        return this.policyOrLegalNotice;
    }

    public String getListIssueDateTime() {
        return this.listIssueDateTime;
    }

    @JsonProperty("TSLVersionIdentifier")
    public void setTSLVersionIdentifier(final int tSLVersionIdentifier) {
        this.tSLVersionIdentifier = tSLVersionIdentifier;
    }

    @JsonProperty("TSLSequenceNumber")
    public void setTSLSequenceNumber(final int tSLSequenceNumber) {
        this.tSLSequenceNumber = tSLSequenceNumber;
    }

    @JsonProperty("TSLType")
    public void setTSLType(final String tSLType) {
        this.tSLType = tSLType;
    }

    @JsonProperty("FrameworkOperatorName")
    public void setFrameworkOperatorName(final NameType frameworkOperatorName) {
        this.frameworkOperatorName = frameworkOperatorName;
    }

    @JsonProperty("FrameworkOperatorAddress")
    public void setFrameworkOperatorAddress(final FrameworkOperatorAddressType frameworkOperatorAddress) {
        this.frameworkOperatorAddress = frameworkOperatorAddress;
    }

    @JsonProperty("FrameworkName")
    public void setFrameworkName(final NameType frameworkName) {
        this.frameworkName = frameworkName;
    }

    @JsonProperty("FrameworkInformationURI")
    public void setFrameworkInformationURI(final URIType frameworkInformationURI) {
        this.frameworkInformationURI = frameworkInformationURI;
    }

    @JsonProperty("FrameworkAuditURI")
    public void setFrameworkAuditURI(final URIType frameworkAuditURI) {
        this.frameworkAuditURI = frameworkAuditURI;
    }

    @JsonProperty("FrameworkTypeCommunityRules")
    public void setFrameworkTypeCommunityRules(final URIType frameworkTypeCommunityRules) {
        this.frameworkTypeCommunityRules = frameworkTypeCommunityRules;
    }

    @JsonProperty("FrameworkScope")
    public void setFrameworkScope(final String frameworkScope) {
        this.frameworkScope = frameworkScope;
    }

    @JsonProperty("PolicyOrLegalNotice")
    public void setPolicyOrLegalNotice(final PolicyOrLegalNoticeType policyOrLegalNotice) {
        this.policyOrLegalNotice = policyOrLegalNotice;
    }

    @JsonProperty("ListIssueDateTime")
    public void setListIssueDateTime(final String listIssueDateTime) {
        this.listIssueDateTime = listIssueDateTime;
    }
}
