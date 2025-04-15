package com.java.core.java8eatures;

public class LamadaExpressionController {
	//Lambda expression helps us to write our code in functional style
	// Lambda expression is used for to implement the functional Interface . An
	// interface can contain single abstract method is called functional interface.
//A lambda expression is essentially a shorthand for writing a method in a more functional style.

	// parameters: A comma-separated list of input parameters for the lambda
	// expression.

	// ->: The arrow token that separates parameters and the body of the lambda.

	// expression: The body of the lambda which could be a single expression or a
	// block of code.

	public static void main(String[] args) {
		LamadaExpressionInterface lamadaExpressionInterface = (int a, int b) -> {
			return a - b;

		};
		System.out.println("Sum: " + lamadaExpressionInterface.add(10, 20)); // Output: Sum: 30

	}

}
