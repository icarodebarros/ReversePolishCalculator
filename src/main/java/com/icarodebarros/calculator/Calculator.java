package com.icarodebarros.calculator;

import java.math.BigDecimal;
/**
 * REVERSE POLISH CALULATOR
 * O modo de funcionamento dessa caluladora é similar às calculadoras fincanceiras. Ou seja, os operandos são
 * digitados primeiro e inseridos numa 'pilha' e depois o operador finaliza a operação.
 * 
 * Por exemplo, se o usuário quiser somar "3 + 4" ele terá que digitar a sequência: "3 -> enter -> 4 -> +", onde
 * o 'enter' adiciona o valor anterior à pilha. Assim, o valor 7 (resultado da operação) estará no topo da pilha
 * tendo substituido os operandos originais.
 * 
 * Outro exemplo, data a sequência "3 -> enter -> 4 -> + -> 2 -> * -> 6 -> +" terá como resultado 20. Pois "3 -> enter"
 * faz o valor 3 ir para a pilha, "4 -> +" soma 4 ao topo da pilha, resultando em 7, depois "2 -> *" multiplica 2 ao
 * topo da pilha, resultando em 14, e por fim "6 -> +" adiciona 6 à 14, terminando com 20.
 * 
 * Também é possível adicionar uma sequência de valores na pilha para depois inserir os operadores. Exemplo: ao digitar
 * "2 -> enter -> 3 -> enter -> 5 -> enter -> 4" teremos os valores 2, 3 e 5 na pilha e 4 como valor atual, sendo 5 o
 *  topo dessa pilha. Após isso é digitado "+ -> - -> *" resultando em 12, pois cada um desses operadores será aplicado
 *  ao valor da tela com o topo da pilha, dessa forma "5 + 4 = 9" -> "3 - 9 = -6" -> "2 * -6 = -12". 
 *
 */
public class Calculator {
	
	private OperandStack values = new OperandStack();

	public BigDecimal getAccumulator() {
		return this.values.peek();
	}

	public void setAccumulator(BigDecimal value) {
		this.values.replaceTop(value);
	}

	public void enter() {
		this.values.push(getAccumulator());
	}

	public void drop() {
		this.values.pop();
	}

	public void execute(String op) {
		Operation operation = null;
		switch (op) {
			case "+":	operation = new AddOperation();
						break;
			case "-":	operation = new SubtractOperation();
						break;
			case "*":	operation = new MultiplyOperation();
						break;
			case "/":	operation = new DivideOperation();
						break;
			case "sqr":	operation = new SquareOperation();
						break;
			case "fac":	operation = new FactorialOperation();
		}
		operation.apply(this.values);
	}
}
