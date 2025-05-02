package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSPCertificationListType", propOrder = { "tSPCertification" })
public class TSPCertificationListType {
    @XmlElement(name = "TSPCertification")
    @JsonProperty("TSPCertification")
    private List<TypeValue> tSPCertification;

    public TSPCertificationListType() {
    }

    public List<TypeValue> getTSPCertification() {
        return this.tSPCertification;
    }

    @JsonProperty("TSPCertification")
    public void setTSPCertification(final List<TypeValue> tSPCertification) {
        this.tSPCertification = tSPCertification;
    }
}
