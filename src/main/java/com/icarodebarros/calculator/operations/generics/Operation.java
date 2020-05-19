package com.icarodebarros.calculator.operations.generics;

import com.icarodebarros.calculator.domain.OperandStack;

public interface Operation {
	void apply(OperandStack stack);
}
