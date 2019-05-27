//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.contexts;

import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.protectedmodel.ItemRevisionEffBase;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.Objects;


/**
 * <p>Java class for XxalpaHierarquiaDeMaterial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XxalpaHierarquiaDeMaterial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/protectedModel/}ItemRevisionEffBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RaiseEvent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsPersistentAttributeUpdated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsAddedToChildEntitiesMap" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsImportCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="imerk" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLineimerk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atbez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLineatbez" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atzhl" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="RedLineatzhl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atwrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLineatwrt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atwtb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLineatwtb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atflv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLineatflv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="atflb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RedLineatflb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XxalpaHierarquiaDeMaterial", propOrder = {
    "raiseEvent",
    "isPersistentAttributeUpdated",
    "isAddedToChildEntitiesMap",
    "isImportCase",
    "imerk",
    "redLineimerk",
    "atbez",
    "redLineatbez",
    "atzhl",
    "redLineatzhl",
    "atwrt",
    "redLineatwrt",
    "atwtb",
    "redLineatwtb",
    "atflv",
    "redLineatflv",
    "atflb",
    "redLineatflb"
})
public class XxalpaHierarquiaDeMaterial
    extends ItemRevisionEffBase
{

    @XmlElementRef(name = "RaiseEvent", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> raiseEvent;
    @XmlElementRef(name = "IsPersistentAttributeUpdated", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isPersistentAttributeUpdated;
    @XmlElementRef(name = "IsAddedToChildEntitiesMap", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isAddedToChildEntitiesMap;
    @XmlElementRef(name = "IsImportCase", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isImportCase;
    protected BigDecimal imerk;
    @XmlElementRef(name = "RedLineimerk", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineimerk;
    @XmlElementRef(name = "atbez", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atbez;
    @XmlElementRef(name = "RedLineatbez", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineatbez;
    @XmlElementRef(name = "atzhl", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> atzhl;
    @XmlElementRef(name = "RedLineatzhl", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineatzhl;
    @XmlElementRef(name = "atwrt", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atwrt;
    @XmlElementRef(name = "RedLineatwrt", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineatwrt;
    @XmlElementRef(name = "atwtb", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atwtb;
    @XmlElementRef(name = "RedLineatwtb", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineatwtb;
    @XmlElementRef(name = "atflv", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atflv;
    @XmlElementRef(name = "RedLineatflv", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineatflv;
    @XmlElementRef(name = "atflb", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> atflb;
    @XmlElementRef(name = "RedLineatflb", namespace = "http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> redLineatflb;

    /**
     * Gets the value of the raiseEvent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRaiseEvent() {
        return raiseEvent;
    }

    /**
     * Sets the value of the raiseEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRaiseEvent(JAXBElement<String> value) {
        this.raiseEvent = value;
    }

    /**
     * Gets the value of the isPersistentAttributeUpdated property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsPersistentAttributeUpdated() {
        return isPersistentAttributeUpdated;
    }

    /**
     * Sets the value of the isPersistentAttributeUpdated property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsPersistentAttributeUpdated(JAXBElement<Boolean> value) {
        this.isPersistentAttributeUpdated = value;
    }

    /**
     * Gets the value of the isAddedToChildEntitiesMap property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsAddedToChildEntitiesMap() {
        return isAddedToChildEntitiesMap;
    }

    /**
     * Sets the value of the isAddedToChildEntitiesMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsAddedToChildEntitiesMap(JAXBElement<Boolean> value) {
        this.isAddedToChildEntitiesMap = value;
    }

    /**
     * Gets the value of the isImportCase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getIsImportCase() {
        return isImportCase;
    }

    /**
     * Sets the value of the isImportCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setIsImportCase(JAXBElement<Boolean> value) {
        this.isImportCase = value;
    }

    /**
     * Gets the value of the imerk property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImerk() {
        return imerk;
    }

    /**
     * Sets the value of the imerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImerk(BigDecimal value) {
        this.imerk = value;
    }

    /**
     * Gets the value of the redLineimerk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineimerk() {
        return redLineimerk;
    }

    /**
     * Sets the value of the redLineimerk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineimerk(JAXBElement<String> value) {
        this.redLineimerk = value;
    }

    /**
     * Gets the value of the atbez property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtbez() {
        return atbez;
    }

    /**
     * Sets the value of the atbez property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtbez(JAXBElement<String> value) {
        this.atbez = value;
    }

    /**
     * Gets the value of the redLineatbez property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineatbez() {
        return redLineatbez;
    }

    /**
     * Sets the value of the redLineatbez property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineatbez(JAXBElement<String> value) {
        this.redLineatbez = value;
    }

    /**
     * Gets the value of the atzhl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAtzhl() {
        return atzhl;
    }

    /**
     * Sets the value of the atzhl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAtzhl(JAXBElement<BigDecimal> value) {
        this.atzhl = value;
    }

    /**
     * Gets the value of the redLineatzhl property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineatzhl() {
        return redLineatzhl;
    }

    /**
     * Sets the value of the redLineatzhl property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineatzhl(JAXBElement<String> value) {
        this.redLineatzhl = value;
    }

    /**
     * Gets the value of the atwrt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtwrt() {
        return atwrt;
    }

    /**
     * Sets the value of the atwrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtwrt(JAXBElement<String> value) {
        this.atwrt = value;
    }

    /**
     * Gets the value of the redLineatwrt property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineatwrt() {
        return redLineatwrt;
    }

    /**
     * Sets the value of the redLineatwrt property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineatwrt(JAXBElement<String> value) {
        this.redLineatwrt = value;
    }

    /**
     * Gets the value of the atwtb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtwtb() {
        return atwtb;
    }

    /**
     * Sets the value of the atwtb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtwtb(JAXBElement<String> value) {
        this.atwtb = value;
    }

    /**
     * Gets the value of the redLineatwtb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineatwtb() {
        return redLineatwtb;
    }

    /**
     * Sets the value of the redLineatwtb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineatwtb(JAXBElement<String> value) {
        this.redLineatwtb = value;
    }

    /**
     * Gets the value of the atflv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtflv() {
        return atflv;
    }

    /**
     * Sets the value of the atflv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtflv(JAXBElement<String> value) {
        this.atflv = value;
    }

    /**
     * Gets the value of the redLineatflv property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineatflv() {
        return redLineatflv;
    }

    /**
     * Sets the value of the redLineatflv property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineatflv(JAXBElement<String> value) {
        this.redLineatflv = value;
    }

    /**
     * Gets the value of the atflb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAtflb() {
        return atflb;
    }

    /**
     * Sets the value of the atflb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAtflb(JAXBElement<String> value) {
        this.atflb = value;
    }

    /**
     * Gets the value of the redLineatflb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRedLineatflb() {
        return redLineatflb;
    }

    /**
     * Sets the value of the redLineatflb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRedLineatflb(JAXBElement<String> value) {
        this.redLineatflb = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof XxalpaHierarquiaDeMaterial)) return false;
        XxalpaHierarquiaDeMaterial that = (XxalpaHierarquiaDeMaterial) o;
        return Objects.equals(getImerk(), that.getImerk());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImerk());
    }
}
