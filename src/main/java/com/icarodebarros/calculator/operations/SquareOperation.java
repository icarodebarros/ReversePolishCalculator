package com.icarodebarros.calculator.operations;

import java.math.BigDecimal;

import com.icarodebarros.calculator.operations.generics.UnaryOperation;

public class SquareOperation extends UnaryOperation {
	
	@Override
	protected BigDecimal calculate(BigDecimal value1) {
		return value1.pow(2);
	}

}
