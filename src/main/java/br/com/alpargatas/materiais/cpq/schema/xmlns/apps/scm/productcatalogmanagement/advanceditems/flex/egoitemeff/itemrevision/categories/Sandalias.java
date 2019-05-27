//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.categories;

import br.com.alpargatas.materiais.cpq.schema.xmlns.apps.scm.productcatalogmanagement.advanceditems.flex.egoitemeff.itemrevision.contexts.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for Sandalias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Sandalias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/categories/}j_ItemRevisionRootIccPrivate"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DadosDeCentroSku" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}DadosDeCentroSku" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ListaTecnica" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}ListaTecnica" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="XxalpaHierarquiaDeMaterial" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}XxalpaHierarquiaDeMaterial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EstruturaComercialPim" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}EstruturaComercialPim" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Matriz" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}Matriz" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DadosDeCentroMaterial" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}DadosDeCentroMaterial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DadosEanEDuns" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}DadosEanEDuns" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EstruturaComercialSku" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}EstruturaComercialSku" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="XxalpaEstruturaMaterial" type="{http://xmlns.oracle.com/apps/scm/productCatalogManagement/advancedItems/flex/egoItemEff/itemRevision/contexts/}XxalpaEstruturaMaterial" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Sandalias", propOrder = {
    "dadosDeCentroSku",
    "listaTecnica",
    "xxalpaHierarquiaDeMaterial",
    "estruturaComercialPim",
    "matriz",
    "dadosDeCentroMaterial",
    "dadosEanEDuns",
    "estruturaComercialSku",
    "xxalpaEstruturaMaterial"
})
public class Sandalias
    extends JItemRevisionRootIccPrivate
{

    @XmlElement(name = "DadosDeCentroSku")
    protected List<DadosDeCentroSku> dadosDeCentroSku;
    @XmlElement(name = "ListaTecnica")
    protected List<ListaTecnica> listaTecnica;
    @XmlElement(name = "XxalpaHierarquiaDeMaterial")
    protected List<XxalpaHierarquiaDeMaterial> xxalpaHierarquiaDeMaterial;
    @XmlElement(name = "EstruturaComercialPim")
    protected List<EstruturaComercialPim> estruturaComercialPim;
    @XmlElement(name = "Matriz")
    protected List<Matriz> matriz;
    @XmlElement(name = "DadosDeCentroMaterial")
    protected List<DadosDeCentroMaterial> dadosDeCentroMaterial;
    @XmlElement(name = "DadosEanEDuns")
    protected List<DadosEanEDuns> dadosEanEDuns;
    @XmlElement(name = "EstruturaComercialSku")
    protected List<EstruturaComercialSku> estruturaComercialSku;
    @XmlElement(name = "XxalpaEstruturaMaterial")
    protected XxalpaEstruturaMaterial xxalpaEstruturaMaterial;

    /**
     * Gets the value of the dadosDeCentroSku property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosDeCentroSku property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosDeCentroSku().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosDeCentroSku }
     * 
     * 
     */
    public List<DadosDeCentroSku> getDadosDeCentroSku() {
        if (dadosDeCentroSku == null) {
            dadosDeCentroSku = new ArrayList<DadosDeCentroSku>();
        }
        return this.dadosDeCentroSku;
    }

    /**
     * Gets the value of the listaTecnica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTecnica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTecnica().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListaTecnica }
     * 
     * 
     */
    public List<ListaTecnica> getListaTecnica() {
        if (listaTecnica == null) {
            listaTecnica = new ArrayList<ListaTecnica>();
        }
        return this.listaTecnica;
    }

    /**
     * Gets the value of the xxalpaHierarquiaDeMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xxalpaHierarquiaDeMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXxalpaHierarquiaDeMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XxalpaHierarquiaDeMaterial }
     * 
     * 
     */
    public List<XxalpaHierarquiaDeMaterial> getXxalpaHierarquiaDeMaterial() {
        if (xxalpaHierarquiaDeMaterial == null) {
            xxalpaHierarquiaDeMaterial = new ArrayList<XxalpaHierarquiaDeMaterial>();
        }
        return this.xxalpaHierarquiaDeMaterial;
    }

    /**
     * Gets the value of the estruturaComercialPim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estruturaComercialPim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstruturaComercialPim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstruturaComercialPim }
     * 
     * 
     */
    public List<EstruturaComercialPim> getEstruturaComercialPim() {
        if (estruturaComercialPim == null) {
            estruturaComercialPim = new ArrayList<EstruturaComercialPim>();
        }
        return this.estruturaComercialPim;
    }

    /**
     * Gets the value of the matriz property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the matriz property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMatriz().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Matriz }
     * 
     * 
     */
    public List<Matriz> getMatriz() {
        if (matriz == null) {
            matriz = new ArrayList<Matriz>();
        }
        return this.matriz;
    }

    /**
     * Gets the value of the dadosDeCentroMaterial property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosDeCentroMaterial property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosDeCentroMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosDeCentroMaterial }
     * 
     * 
     */
    public List<DadosDeCentroMaterial> getDadosDeCentroMaterial() {
        if (dadosDeCentroMaterial == null) {
            dadosDeCentroMaterial = new ArrayList<DadosDeCentroMaterial>();
        }
        return this.dadosDeCentroMaterial;
    }

    /**
     * Gets the value of the dadosEanEDuns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosEanEDuns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosEanEDuns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DadosEanEDuns }
     * 
     * 
     */
    public List<DadosEanEDuns> getDadosEanEDuns() {
        if (dadosEanEDuns == null) {
            dadosEanEDuns = new ArrayList<DadosEanEDuns>();
        }
        return this.dadosEanEDuns;
    }

    /**
     * Gets the value of the estruturaComercialSku property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the estruturaComercialSku property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEstruturaComercialSku().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EstruturaComercialSku }
     * 
     * 
     */
    public List<EstruturaComercialSku> getEstruturaComercialSku() {
        if (estruturaComercialSku == null) {
            estruturaComercialSku = new ArrayList<EstruturaComercialSku>();
        }
        return this.estruturaComercialSku;
    }

    /**
     * Gets the value of the xxalpaEstruturaMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link XxalpaEstruturaMaterial }
     *     
     */
    public XxalpaEstruturaMaterial getXxalpaEstruturaMaterial() {
        return xxalpaEstruturaMaterial;
    }

    /**
     * Sets the value of the xxalpaEstruturaMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link XxalpaEstruturaMaterial }
     *     
     */
    public void setXxalpaEstruturaMaterial(XxalpaEstruturaMaterial value) {
        this.xxalpaEstruturaMaterial = value;
    }

}