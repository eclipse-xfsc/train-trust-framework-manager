package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyOrLegalNoticeType", propOrder = { "tSLLegalNotice" })
public class PolicyOrLegalNoticeType implements Serializable {
    @XmlElement(name = "TSLLegalNotice")
    @JsonProperty("TSLLegalNotice")
    private String tSLLegalNotice;

    public PolicyOrLegalNoticeType() {
    }

    public String getTSLLegalNotice() {
        return this.tSLLegalNotice;
    }

    @JsonProperty("TSLLegalNotice")
    public void setTSLLegalNotice(final String tSLLegalNotice) {
        this.tSLLegalNotice = tSLLegalNotice;
    }
}
