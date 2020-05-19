package com.icarodebarros.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperandStackTest {
	
	private OperandStack stack;
	
	@BeforeEach
	public void createCalculator() {
		this.stack = new OperandStack();
	}
	
	@Test
	public void testNewOperandStackPeekReturnsZero() {
		assertEquals(BigDecimal.ZERO, this.stack.peek());
	}

	@Test
	public void testPushingValueOntoStack() {
		BigDecimal value = new BigDecimal(12);
		this.stack.push(value);
		assertEquals(value, this.stack.peek());
	}
	
	@Test
	public void testReplacingTopOfStack() {
		this.stack.push(new BigDecimal(22));
		BigDecimal value = new BigDecimal(66);
		this.stack.replaceTop(value);
		assertEquals(value, this.stack.peek());
	}
	
	@Test
	public void testReplacingTopWithEmptyStack() {
		BigDecimal value = new BigDecimal(66);
		this.stack.replaceTop(value);
		assertEquals(value, this.stack.peek());
	}
	
	@Test
	public void testPoppingValuesFromStack() {
		BigDecimal value = new BigDecimal(45);
		this.stack.push(value);
		this.stack.push(new BigDecimal(55));
		this.stack.pop();
		assertEquals(value, this.stack.peek());
	}
	
	@Test
	public void testPoppingValuesWithEmptyStack() {
		this.stack.pop();
		assertEquals(BigDecimal.ZERO, this.stack.peek());
	}
}
