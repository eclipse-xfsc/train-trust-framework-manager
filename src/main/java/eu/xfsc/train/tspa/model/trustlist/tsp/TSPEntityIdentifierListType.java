// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPEntityIdentifierListType", propOrder = { "tSPEntityIdendifier" })
public class TSPEntityIdentifierListType {
    @XmlElement(name = "TSPEntityIdendifier")
    @JsonProperty("TSPEntityIdendifier")
    private List<TypeValue> tSPEntityIdendifier;

    public TSPEntityIdentifierListType() {
    }

    public List<TypeValue> getTSPEntityIdendifier() {
        return this.tSPEntityIdendifier;
    }

    @JsonProperty("TSPEntityIdendifier")
    public void setTSPEntityIdendifier(final List<TypeValue> tSPEntityIdendifier) {
        this.tSPEntityIdendifier = tSPEntityIdendifier;
    }
}
