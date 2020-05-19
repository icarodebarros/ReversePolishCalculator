package com.icarodebarros.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OperationsTest {
	
	private Calculator calculator;
	
	@BeforeEach
	public void createCalculatorWithThreeValues() {
		this.calculator = new Calculator();
		calculator.setAccumulator(new BigDecimal(20));
		calculator.enter();
		calculator.setAccumulator(new BigDecimal(4));
	}
	
	@Test
	public void testAddExecution() {
		calculator.execute("+");
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}
	
	@Test
	public void testSubtractExecution() {
		calculator.execute("-");
		assertEquals(new BigDecimal(16), calculator.getAccumulator());
	}
	
	@Test
	public void testMultiplyExecution() {
		calculator.execute("*");
		assertEquals(new BigDecimal(80), calculator.getAccumulator());
	}
	
	@Test
	public void testDivideExecution() {
		calculator.execute("/");
		assertEquals(new BigDecimal(5), calculator.getAccumulator());
	}
	
	@Test
	public void testSquareExecution() {
		calculator.execute("sqr");
		assertEquals(new BigDecimal(16), calculator.getAccumulator());
	}
	
	@Test
	public void testFactorialExecution() {
		calculator.execute("fac");
		assertEquals(new BigDecimal(24), calculator.getAccumulator());
	}

}
