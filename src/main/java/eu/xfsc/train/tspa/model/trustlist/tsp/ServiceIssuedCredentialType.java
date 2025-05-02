// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceIssuedCredentialType", propOrder = { "credentialType" })
public class ServiceIssuedCredentialType {
    @XmlElement(name = "CredentialType")
    @JsonProperty("CredentialType")
    private List<CredentialCustomType> credentialType;

    public ServiceIssuedCredentialType() {
    }

    public List<CredentialCustomType> getCredentialType() {
        return this.credentialType;
    }

    @JsonProperty("CredentialType")
    public void setCredentialType(final List<CredentialCustomType> credentialType) {
        this.credentialType = credentialType;
    }
}
