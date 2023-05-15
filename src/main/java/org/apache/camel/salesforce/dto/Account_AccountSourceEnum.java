/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed May 10 17:25:48 AEST 2023
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AccountSource
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_AccountSourceEnum {

    // Other
    OTHER("Other"),

    // Partner Referral
    PARTNER_REFERRAL("Partner Referral"),

    // Phone Inquiry
    PHONE_INQUIRY("Phone Inquiry"),

    // Purchased List
    PURCHASED_LIST("Purchased List"),

    // Web
    WEB("Web");

    final String value;

    private Account_AccountSourceEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_AccountSourceEnum fromValue(String value) {
        for (Account_AccountSourceEnum e : Account_AccountSourceEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
