package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "URIType", propOrder = { "uri" })
public class URIType implements Serializable {
    @XmlElement(name = "URI")
    @JsonProperty("URI")
    private String uri;

    public URIType() {
    }

    public String getUri() {
        return this.uri;
    }

    @JsonProperty("URI")
    public void setUri(final String uri) {
        this.uri = uri;
    }
}
