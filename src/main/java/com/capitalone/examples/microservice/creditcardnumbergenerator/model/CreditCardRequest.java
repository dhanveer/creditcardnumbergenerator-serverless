package com.capitalone.examples.microservice.creditcardnumbergenerator.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CreditCardRequest implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8686209056739336163L;
	private String howMany;
	private String creditCardType;

	public String getHowMany() {
		return howMany;
	}

	public void setHowMany(String howMany) {
		this.howMany = howMany;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	
}
