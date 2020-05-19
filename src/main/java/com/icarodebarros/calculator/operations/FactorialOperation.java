package com.icarodebarros.calculator.operations;

import java.math.BigDecimal;

import com.icarodebarros.calculator.operations.generics.UnaryOperation;

public class FactorialOperation extends UnaryOperation {

	@Override
	protected BigDecimal calculate(BigDecimal value1) {
		BigDecimal one = new BigDecimal(1);
		BigDecimal fact = one;
		for (BigDecimal i = one; i.compareTo(value1) <= 0; i = i.add(one)) {
			fact = fact.multiply(i);
		}
		return fact;
	}

}
