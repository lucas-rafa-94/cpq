//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.07 at 02:00:32 AM BRT 
//


package br.com.alpargatas.materiais.cpq.schema.xmlns.adf.svc.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Conjunction.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Conjunction"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="And"/&gt;
 *     &lt;enumeration value="Or"/&gt;
 *     &lt;enumeration value="Not"/&gt;
 *     &lt;enumeration value="AndNot"/&gt;
 *     &lt;enumeration value="OrNot"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Conjunction")
@XmlEnum
public enum Conjunction {

    @XmlEnumValue("And")
    AND("And"),
    @XmlEnumValue("Or")
    OR("Or"),
    @XmlEnumValue("Not")
    NOT("Not"),
    @XmlEnumValue("AndNot")
    AND_NOT("AndNot"),
    @XmlEnumValue("OrNot")
    OR_NOT("OrNot");
    private final String value;

    Conjunction(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Conjunction fromValue(String v) {
        for (Conjunction c: Conjunction.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
