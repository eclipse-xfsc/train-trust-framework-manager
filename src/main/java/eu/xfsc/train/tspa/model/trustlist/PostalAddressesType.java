package eu.xfsc.train.tspa.model.trustlist;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressesType", propOrder = { "postalAddress" })
public class PostalAddressesType implements Serializable {
    @XmlElement(name = "PostalAddress")
    @JsonProperty("PostalAddress")
    private List<Address> postalAddress;

    public PostalAddressesType() {
    }

    public List<Address> getPostalAddress() {
        return this.postalAddress;
    }

    @JsonProperty("PostalAddress")
    public void setPostalAddress(final List<Address> postalAddress) {
        this.postalAddress = postalAddress;
    }
}
