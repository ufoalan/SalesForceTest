/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed May 10 17:25:48 AEST 2023
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CustomerPriority__c
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_CustomerPriorityEnum {

    // High
    HIGH("High"),

    // Low
    LOW("Low"),

    // Medium
    MEDIUM("Medium");

    final String value;

    private Account_CustomerPriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_CustomerPriorityEnum fromValue(String value) {
        for (Account_CustomerPriorityEnum e : Account_CustomerPriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
