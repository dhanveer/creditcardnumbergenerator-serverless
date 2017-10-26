package com.capitalone.examples.microservice.creditcardnumbergenerator.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class CreditCardResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2249923603729653086L;
	private List<String> creditCardNumbers;

	public List<String> getCreditCardNumbers() {
		return creditCardNumbers;
	}

	public void setCreditCardNumbers(List<String> creditCardNumbers) {
		this.creditCardNumbers = creditCardNumbers;
	}

}
