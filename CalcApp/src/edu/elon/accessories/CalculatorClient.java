package edu.elon.accessories;

import javax.naming.Context;
import javax.naming.InitialContext;

public class CalculatorClient {

	public static void main(String[] args) {
		Evaluator eval = new EvaluatorImpl();
		Calculator calc = new Calculator(eval);
	}

}
