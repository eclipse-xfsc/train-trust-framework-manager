// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameType", propOrder = { "name" })
public class NameType implements Serializable {
    @XmlElement(name = "Name")
    @JsonProperty("Name")
    private String name;

    public NameType() {
    }

    public String getName() {
        return this.name;
    }

    @JsonProperty("Name")
    public void setName(final String name) {
        this.name = name;
    }
}
