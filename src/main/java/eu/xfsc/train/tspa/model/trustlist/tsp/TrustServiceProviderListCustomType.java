package eu.xfsc.train.tspa.model.trustlist.tsp;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrustServiceProviderListCustomType", propOrder = { "trustServiceProvider" })
public class TrustServiceProviderListCustomType {
    @XmlElement(name = "TrustServiceProvider")
    @JsonProperty("TrustServiceProvider")
    private List<TSPCustomType> trustServiceProvider;

    public TrustServiceProviderListCustomType() {
    }

    public List<TSPCustomType> getTrustServiceProvider() {
        return this.trustServiceProvider;
    }

    @JsonProperty("TrustServiceProvider")
    public void setTrustServiceProvider(final List<TSPCustomType> trustServiceProvider) {
        this.trustServiceProvider = trustServiceProvider;
    }
}
