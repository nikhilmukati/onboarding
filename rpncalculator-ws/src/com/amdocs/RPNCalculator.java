package com.amdocs;

import java.util.Stack;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class RPNCalculator {

	private Stack<Double> numberStack;
	private double firstName, secondName, result;
	
	public RPNCalculator() {
		numberStack = new Stack<Double>();
		firstName = secondName = result = 0.0;
	}
	
	@WebMethod
	public double evaluate(String rpnMathExpression) {
		String[] rpnTokens = rpnMathExpression.split(" ");
		
		IMathOperator mathOperation = null;
		
		for(String token : rpnTokens) {
		
			if(isMathOperator(token)) {
				extractInputs();
				mathOperation = MathFactory.getObject(token);
				result = mathOperation.evaluate(firstName, secondName );
				numberStack.push(result);
				
			}
			else
				numberStack.push(Double.parseDouble(token));
		}
		
		return numberStack.pop();
	}
	
	private boolean isMathOperator(String token) {
		String mathOperators = "+-*/";
		return mathOperators.contains(token);
	}

	private void extractInputs() {		
		secondName = numberStack.pop();
		firstName = numberStack.pop();
	}

	
	
}
