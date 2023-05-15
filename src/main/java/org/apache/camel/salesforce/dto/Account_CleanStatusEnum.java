/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed May 10 17:25:48 AEST 2023
 */
package org.apache.camel.salesforce.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CleanStatus
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public enum Account_CleanStatusEnum {

    // Acknowledged
    ACKNOWLEDGED("Acknowledged"),

    // Different
    DIFFERENT("Different"),

    // Inactive
    INACTIVE("Inactive"),

    // Matched
    MATCHED("Matched"),

    // NotFound
    NOTFOUND("NotFound"),

    // Pending
    PENDING("Pending"),

    // SelectMatch
    SELECTMATCH("SelectMatch"),

    // Skipped
    SKIPPED("Skipped");

    final String value;

    private Account_CleanStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Account_CleanStatusEnum fromValue(String value) {
        for (Account_CleanStatusEnum e : Account_CleanStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
