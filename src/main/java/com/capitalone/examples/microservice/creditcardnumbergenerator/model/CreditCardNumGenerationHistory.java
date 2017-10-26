package com.capitalone.examples.microservice.creditcardnumbergenerator.model;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class CreditCardNumGenerationHistory implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer credit_card_num_request;
	private String credit_card_type;
	private String credit_card_num_generated;

	private Date creationTime;
	
	

	public Integer getCredit_card_num_request() {
		return credit_card_num_request;
	}

	public void setCredit_card_num_request(Integer credit_card_num_request) {
		this.credit_card_num_request = credit_card_num_request;
	}

	public String getCredit_card_type() {
		return credit_card_type;
	}

	public void setCredit_card_type(String credit_card_type) {
		this.credit_card_type = credit_card_type;
	}

	public String getCredit_card_num_generated() {
		return credit_card_num_generated;
	}

	public void setCredit_card_num_generated(String credit_card_num_generated) {
		this.credit_card_num_generated = credit_card_num_generated;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this, false);
	}

	@Override
	public boolean equals(Object rhs) {
		return EqualsBuilder.reflectionEquals(this, rhs, false);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
