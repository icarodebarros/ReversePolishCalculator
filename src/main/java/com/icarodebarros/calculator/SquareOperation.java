package com.icarodebarros.calculator;

import java.math.BigDecimal;

public class SquareOperation extends UnaryOperation {
	
	@Override
	protected BigDecimal calculate(BigDecimal value1) {
		return value1.pow(2);
	}

}
