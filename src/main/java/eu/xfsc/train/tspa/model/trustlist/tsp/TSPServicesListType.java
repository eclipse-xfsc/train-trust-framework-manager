// Source code is decompiled from a .class file using FernFlower decompiler.
package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPServicesListType", propOrder = { "tspService" })
public class TSPServicesListType {
    @XmlElement(name = "TSPService")
    @JsonProperty("TSPService")
    private List<TSPServiceType> tspService;

    public TSPServicesListType() {
    }

    public List<TSPServiceType> getTspService() {
        return this.tspService;
    }

    @JsonProperty("TSPService")
    public void setTspService(final List<TSPServiceType> tspService) {
        this.tspService = tspService;
    }
}
