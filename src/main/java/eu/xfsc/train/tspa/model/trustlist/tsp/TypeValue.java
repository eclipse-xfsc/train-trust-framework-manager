// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeValue", propOrder = { "type", "value" })
public class TypeValue {
    @XmlElement(name = "Type")
    @JsonProperty("Type")
    private String type;
    @XmlElement(name = "Value")
    @JsonProperty("Value")
    private String value;

    public TypeValue() {
    }

    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    @JsonProperty("Type")
    public void setType(final String type) {
        this.type = type;
    }

    @JsonProperty("Value")
    public void setValue(final String value) {
        this.value = value;
    }
}
