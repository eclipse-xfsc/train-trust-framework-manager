// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CredentialCustomType", propOrder = { "type" })
public class CredentialCustomType {
    @XmlElement(name = "Type")
    @JsonProperty("Type")
    private String type;

    public CredentialCustomType() {
    }

    public String getType() {
        return this.type;
    }

    @JsonProperty("Type")
    public void setType(final String type) {
        this.type = type;
    }
}
