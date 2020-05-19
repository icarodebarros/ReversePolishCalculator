package com.icarodebarros.calculator.operations.generics;

import java.math.BigDecimal;

import com.icarodebarros.calculator.domain.OperandStack;

public abstract class UnaryOperation implements Operation {

	@Override
	public void apply(OperandStack values) {
		BigDecimal value1 = values.peek();
		values.replaceTop(calculate(value1));		
	}
	
	protected abstract BigDecimal calculate(BigDecimal value1);	

}
