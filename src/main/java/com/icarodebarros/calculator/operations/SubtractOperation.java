package com.icarodebarros.calculator.operations;

import java.math.BigDecimal;

import com.icarodebarros.calculator.operations.generics.BinaryOperation;

public class SubtractOperation extends BinaryOperation {

	@Override
	protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
		return value2.subtract(value1);
	}

}
