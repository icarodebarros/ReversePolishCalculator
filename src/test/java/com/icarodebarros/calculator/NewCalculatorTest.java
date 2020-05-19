package com.icarodebarros.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.icarodebarros.calculator.domain.Calculator;

public class NewCalculatorTest {
	
	private Calculator calculator;
	
	// @BeforeAll // Faz o método ser executado antes de todos os @Test, e apenas uma vez! Necessário @TestInstance(Lifecycle.PER_CLASS)
	@BeforeEach // Faz o método ser executado antes de cada um dos @Test, ou seja, múltiplas vezes.
	public void createCalculator() {
		this.calculator = new Calculator();
	}
	
	@Test
	public void testNewCalculatorHasAnAccumulatorOfZero() {
		assertEquals(BigDecimal.ZERO, this.calculator.getAccumulator());
	}
	
	@Test
	public void testSettingAccumulatorValue() {
		BigDecimal value = new BigDecimal(23);
		calculator.setAccumulator(value);
		assertEquals(value,  this.calculator.getAccumulator());
	}

}
