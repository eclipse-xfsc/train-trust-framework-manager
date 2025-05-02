package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TrustList {
    @JsonProperty("TrustServiceStatusList")
    private TrustServiceStatusList trustServiceStatusList;

    public TrustList() {
    }

    public TrustServiceStatusList getTrustServiceStatusList() {
        return this.trustServiceStatusList;
    }

    @JsonProperty("TrustServiceStatusList")
    public void setTrustServiceStatusList(final TrustServiceStatusList trustServiceStatusList) {
        this.trustServiceStatusList = trustServiceStatusList;
    }
}
