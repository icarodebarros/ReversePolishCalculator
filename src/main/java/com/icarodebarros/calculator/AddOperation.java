package com.icarodebarros.calculator;

import java.math.BigDecimal;

public class AddOperation extends BinaryOperation {

	@Override
	protected BigDecimal calculate(BigDecimal value1, BigDecimal value2) {
		return value2.add(value1);
	}

}
