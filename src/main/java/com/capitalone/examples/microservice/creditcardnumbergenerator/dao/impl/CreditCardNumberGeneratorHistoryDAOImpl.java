package com.capitalone.examples.microservice.creditcardnumbergenerator.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capitalone.examples.microservice.creditcardnumbergenerator.dao.CreditCardNumberGeneratorHistoryDAO;
import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardRequest;
import com.capitalone.examples.microservice.creditcardnumbergenerator.model.CreditCardResponse;



public class CreditCardNumberGeneratorHistoryDAOImpl implements CreditCardNumberGeneratorHistoryDAO {
	
	
	public  void saveCreditCardNumbers(CreditCardRequest creditCardRequest, CreditCardResponse creditCardResponse
			) {
		
		try {
			insertRecordIntoDbDatabase(creditCardRequest, creditCardResponse);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public static void main(String[] argv) {
//		try {
//			insertRecordIntoDbDatabase();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	
	private  void insertRecordIntoDbDatabase(CreditCardRequest creditCardRequest, CreditCardResponse creditCardResponse) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		
		String creditCardNumDetailsInsertStatement = new StringBuilder("insert into credit_card_num_details (credit_card_num_request, credit_card_type, credit_card_num_generated) "
				+ "VALUES (?,?,?)").toString();

		System.out.println(creditCardNumDetailsInsertStatement);

		try {
			dbConnection = DatabaseConnection.getDatabaseConnection();;
			preparedStatement = dbConnection.prepareStatement(creditCardNumDetailsInsertStatement);
			
			preparedStatement.setInt(1, Integer.parseInt(creditCardRequest.getHowMany()));
			preparedStatement.setString(2, creditCardRequest.getCreditCardType());
			preparedStatement.setString(3, creditCardResponse.getCreditCardNumbers().toString());

			preparedStatement.executeUpdate();

			System.out.println("Record is inserted into DBUSER table!!!!!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
	}
	
}
   


