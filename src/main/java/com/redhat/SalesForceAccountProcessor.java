package com.redhat;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.salesforce.dto.Account;
import org.apache.camel.salesforce.dto.Account_RatingEnum;
import org.apache.camel.salesforce.dto.Account_TypeEnum;

import com.redhat.Tweet;


public class SalesForceAccountProcessor implements Processor {

	public void process(Exchange exchange) throws Exception {
		Account object__c  =new Account();
		Tweet tweet = exchange.getIn().getBody(Tweet.class);
		object__c.setName(tweet.getUserName());
		object__c.setDescription(tweet.getText());
		object__c.setSite(tweet.getUserLocation());
		object__c.setType(Account_TypeEnum.OTHER);
		switch (tweet.getSentiment()) {
			case "Very Negative":
			case "Negative":
				object__c.setRating(Account_RatingEnum.COLD);
			case "Neutral":
				object__c.setRating(Account_RatingEnum.WARM);
			case "Positive":
			case "Very Positive":
				object__c.setRating(Account_RatingEnum.HOT);
			default:
			object__c.setRating(Account_RatingEnum.WARM);
		}
		exchange.getIn().setBody(object__c, Account.class);
	}

}