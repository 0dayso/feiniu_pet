//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.06.21 at 05:21:00 PM CST 
//


package com.lvmama.elong.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement; 
import java.util.List; 
import com.alibaba.fastjson.annotation.JSONField;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HotelRatePlan complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRatePlan">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Suppliers" type="{}ArrayOfSupplierRatePlan" minOccurs="0"/>
 *         &lt;element name="RatePlans" type="{}ArrayOfRatePlan" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelRatePlan", propOrder = {
    "suppliers",
    "ratePlans"
})
public class HotelRatePlan {

    @JSONField(name = "Suppliers")
    protected List<SupplierRatePlan> suppliers;
    @JSONField(name = "RatePlans")
    protected List<RatePlan> ratePlans;

    /**
     * Gets the value of the suppliers property.
     * 
     * @return
     *     possible object is
     *     {@link List<SupplierRatePlan> }
     *     
     */
    public List<SupplierRatePlan> getSuppliers() {
        return suppliers;
    }

    /**
     * Sets the value of the suppliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<SupplierRatePlan> }
     *     
     */
    public void setSuppliers(List<SupplierRatePlan> value) {
        this.suppliers = value;
    }

    /**
     * Gets the value of the ratePlans property.
     * 
     * @return
     *     possible object is
     *     {@link List<RatePlan> }
     *     
     */
    public List<RatePlan> getRatePlans() {
        return ratePlans;
    }

    /**
     * Sets the value of the ratePlans property.
     * 
     * @param value
     *     allowed object is
     *     {@link List<RatePlan> }
     *     
     */
    public void setRatePlans(List<RatePlan> value) {
        this.ratePlans = value;
    }

}
