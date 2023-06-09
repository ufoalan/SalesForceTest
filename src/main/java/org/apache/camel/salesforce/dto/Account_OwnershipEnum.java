/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed May 10 17:25:48 AEST 2023
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Ownership
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_OwnershipEnum {

    // Other
    OTHER("Other"),

    // Private
    PRIVATE("Private"),

    // Public
    PUBLIC("Public"),

    // Subsidiary
    SUBSIDIARY("Subsidiary");

    final String value;

    private Account_OwnershipEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_OwnershipEnum fromValue(String value) {
        for (Account_OwnershipEnum e : Account_OwnershipEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
