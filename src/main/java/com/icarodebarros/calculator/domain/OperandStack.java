package com.icarodebarros.calculator.domain;

import java.math.BigDecimal;
import java.util.Stack;

public class OperandStack {
	
	private Stack<BigDecimal> values = new Stack<>();

	public BigDecimal peek() {
		if (this.values.size() == 0)
			return BigDecimal.ZERO;
		return this.values.peek();
	}

	public void push(BigDecimal value) {
		this.values.push(value);
	}

	public void replaceTop(BigDecimal value) {
		this.pop();
		this.values.push(value);
	}

	public void pop() {
		if (this.values.size() > 0)
			this.values.pop();
	}

}
