//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productmodel.items.itemservicev2.types;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="associationId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="extensibleFlexFieldLineId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="contextCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "associationId",
    "extensibleFlexFieldLineId",
    "contextCode"
})
@XmlRootElement(name = "deleteSupplierSiteAssociationMultiRowExtensibleFlexfieldsAsync")
public class DeleteSupplierSiteAssociationMultiRowExtensibleFlexfieldsAsync {

    protected long associationId;
    protected long extensibleFlexFieldLineId;
    @XmlElement(required = true)
    protected String contextCode;

    /**
     * Gets the value of the associationId property.
     * 
     */
    public long getAssociationId() {
        return associationId;
    }

    /**
     * Sets the value of the associationId property.
     * 
     */
    public void setAssociationId(long value) {
        this.associationId = value;
    }

    /**
     * Gets the value of the extensibleFlexFieldLineId property.
     * 
     */
    public long getExtensibleFlexFieldLineId() {
        return extensibleFlexFieldLineId;
    }

    /**
     * Sets the value of the extensibleFlexFieldLineId property.
     * 
     */
    public void setExtensibleFlexFieldLineId(long value) {
        this.extensibleFlexFieldLineId = value;
    }

    /**
     * Gets the value of the contextCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextCode() {
        return contextCode;
    }

    /**
     * Sets the value of the contextCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextCode(String value) {
        this.contextCode = value;
    }

}
