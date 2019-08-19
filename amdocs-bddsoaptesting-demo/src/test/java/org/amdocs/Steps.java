package org.amdocs;

import static org.junit.Assert.assertEquals;

import com.amdocs.RPNCalculator;
import com.amdocs.RPNCalculatorService;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private String soapWSDLURL;
	private String rpnMathExpression;
	private double actualResult;
	
	@Given("I have deployment the RPNCalculator SOAP api at URL {string}")
	public void setSOAPWSDLURL(String wsdlURL) {
		soapWSDLURL = wsdlURL;
	    
	}

	@Given("The input is {string}")
	public void setInput(String rpnMathExpression) {
	    this.rpnMathExpression = rpnMathExpression;
	}

	@When("I invoke the SOAP API")
	public void invokeRPNCalculatorSOAPAPI() {
		
		//System.setProperty("useSystemProxy", );
		
		RPNCalculatorService rpnWebService = new RPNCalculatorService();
		RPNCalculator rpnCalculator = rpnWebService.getRPNCalculator();
		
		actualResult = rpnCalculator.evaluate ( rpnMathExpression );
	    
	}

	@Then("I expect the response as {string}")
	public void i_expect_the_response_as(String strexpectedResult) {
		double expectedResult = Double.parseDouble(strexpectedResult);
	    assertEquals ( expectedResult, actualResult, 0.0001 );
	}


}
