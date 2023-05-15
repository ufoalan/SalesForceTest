/*
 * Salesforce Query DTO generated by camel-salesforce-maven-plugin
 * Generated on: Wed May 10 17:25:48 AEST 2023
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamImplicit;
import org.apache.camel.component.salesforce.api.dto.AbstractQueryRecordsBase;

import java.util.List;
import javax.annotation.Generated;

/**
 * Salesforce QueryRecords DTO for type Account
 */
@Generated("org.apache.camel.maven.CamelSalesforceMojo")
public class QueryRecordsAccount extends AbstractQueryRecordsBase {

    @XStreamImplicit
    private List<Account> records;

    public List<Account> getRecords() {
        return records;
    }

    public void setRecords(List<Account> records) {
        this.records = records;
    }
}
