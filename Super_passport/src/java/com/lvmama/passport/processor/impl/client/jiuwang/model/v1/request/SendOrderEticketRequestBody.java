//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.25 at 03:35:22 ���� CST 
//


package com.lvmama.passport.processor.impl.client.jiuwang.model.v1.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 【畅游通提供】【订单】（重）发入园凭证（sendOrderEticket）
 * 
 * <p>Java class for SendOrderEticketRequestBody complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendOrderEticketRequestBody">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tour.ectrip.com/2014/QMRequestDataSchema}RequestBody">
 *       &lt;sequence>
 *         &lt;element name="orderInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="partnerOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendOrderEticketRequestBody", propOrder = {
    "orderInfo"
})
public class SendOrderEticketRequestBody
    extends RequestBody
{

    @XmlElement(required = true)
    protected SendOrderEticketRequestBody.OrderInfo orderInfo;

    /**
     * Gets the value of the orderInfo property.
     *
     * @return
     *     possible object is
     *     {@link SendOrderEticketRequestBody.OrderInfo }
     *
     */
    public SendOrderEticketRequestBody.OrderInfo getOrderInfo() {
        return orderInfo;
    }

    /**
     * Sets the value of the orderInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link SendOrderEticketRequestBody.OrderInfo }
     *
     */
    public void setOrderInfo(SendOrderEticketRequestBody.OrderInfo value) {
        this.orderInfo = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="partnerOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="phoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "partnerOrderId",
        "phoneNumber"
    })
    public static class OrderInfo {

        @XmlElement(required = true)
        protected String partnerOrderId;
        @XmlElement(required = true)
        protected String phoneNumber;

        /**
         * Gets the value of the partnerOrderId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPartnerOrderId() {
            return partnerOrderId;
        }

        /**
         * Sets the value of the partnerOrderId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPartnerOrderId(String value) {
            this.partnerOrderId = value;
        }

        /**
         * Gets the value of the phoneNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumber() {
            return phoneNumber;
        }

        /**
         * Sets the value of the phoneNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumber(String value) {
            this.phoneNumber = value;
        }

    }

}
