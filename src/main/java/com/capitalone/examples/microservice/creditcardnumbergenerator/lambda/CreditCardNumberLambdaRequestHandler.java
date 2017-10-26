package com.capitalone.examples.microservice.creditcardnumbergenerator.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardRequest;
import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardResponse;
import com.capitalone.examples.microservice.creditcardnumbergenerator.service.RandomCreditCardNumberGeneratorService;


public class CreditCardNumberLambdaRequestHandler implements RequestHandler<CreditCardRequest, CreditCardResponse> {
	
	static RandomCreditCardNumberGeneratorService generatorService = new RandomCreditCardNumberGeneratorService();
   
	public CreditCardResponse handleRequest(CreditCardRequest creditCardRequest, Context context) {
                
        String greetingString = String.format("Hello %s, %s.", creditCardRequest.getCreditCardType(), creditCardRequest.getHowMany());
        context.getLogger().log("creditCardRequest : {} " + greetingString);
        context.getLogger().log("creditCardRequest type : {} " + creditCardRequest.getCreditCardType());
        context.getLogger().log("creditCardRequest number: {} " + creditCardRequest.getHowMany());
        
        
        return generatorService.generateCreditCardNumbers(creditCardRequest);
	}
	
}
