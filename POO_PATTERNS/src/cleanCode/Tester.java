package cleanCode;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora (3,2, "Soma");
		System.out.println(calc.CalcularOperacao());
		
		calc = new Calculadora (3,2, "Subtracao");
		System.out.println(calc.CalcularOperacao());
		
		calc = new Calculadora (3,2, "Multiplicacao");
		System.out.println(calc.CalcularOperacao());
		
		calc = new Calculadora (3,2, "divisao");
		System.out.println(calc.CalcularOperacao());
		
	}
}
