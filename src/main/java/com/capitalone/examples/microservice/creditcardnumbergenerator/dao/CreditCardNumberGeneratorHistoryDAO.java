package com.capitalone.examples.microservice.creditcardnumbergenerator.dao;

import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardRequest;
import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardResponse;

public interface CreditCardNumberGeneratorHistoryDAO {
	void saveCreditCardNumbers(CreditCardRequest creditCardRequest, CreditCardResponse creditCardResponse
			);
}
