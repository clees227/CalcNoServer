package edu.elon.accessories;

public class EvaluatorImpl implements Evaluator {

	protected EvaluatorImpl(){
		//nothing
	}

	@Override
	public double evaluate(double num1, double num2, String op){
		double num = 0.0;
		switch(op){
		case "+":
			num = num1+num2;
			break;
		case "-":
			num = num1-num2;
			break;
		case "/":
			num = num1/num2;
			break;
		case "*":
			num = num1*num2;
			break;
		default:
			return 0;
		}
		return num;
	}

}
