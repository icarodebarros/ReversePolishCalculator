package com.icarodebarros.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorWithThreeValuesTest {
	
	private Calculator calculator;
	private BigDecimal value1;
	private BigDecimal value2;
	private BigDecimal value3;
	
	@BeforeEach // Faz esse método ser executado antes de cada um dos @Test
	public void createCalculatorWithThreeValues() {
		this.calculator = new Calculator();
		this.value1 = new BigDecimal(12);
		this.value2 = new BigDecimal(22);
		this.value3 = new BigDecimal(52);
		calculator.setAccumulator(value1);
		calculator.enter();
		calculator.setAccumulator(value2);
		calculator.enter();
		calculator.setAccumulator(value3);
	}
	
	@Test
	public void testAccumulatorAfterPushingThreeValues() {
		assertEquals(this.value3, this.calculator.getAccumulator());		
	}
	
	@Test
	public void testAccumulatorAfterSingleDrop() {		
		calculator.drop();
		assertEquals(this.value2, this.calculator.getAccumulator());
	}
	
	@Test
	public void testAccumulatorAftertwoDrops() {		
		calculator.drop();
		calculator.drop();
		assertEquals(value1, this.calculator.getAccumulator());
	}
	
}
