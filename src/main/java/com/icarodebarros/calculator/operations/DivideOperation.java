package com.icarodebarros.calculator.operations;

import java.math.BigDecimal;

import com.icarodebarros.calculator.operations.generics.BinaryOperation;

public class DivideOperation extends BinaryOperation {

	@Override
	protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
		return value2.divide(value1);
	}

}
