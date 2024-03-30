package Calculadora;

public class Operacoes {

	public void soma(int x1, int x2) {
		
		int resultado = x1 + x2;
		System.out.println("O resultado da soma é " + resultado);
		
	}
	
	public void subtracao(int x1, int x2) {
		
		int resultado1 = x1 - x2;
		System.out.println("O resultado da subtração é " + resultado1);
	}
	
	public void multiplicacao(int x1, int x2) {
		
		int resultado2 = x1 * x2;
		System.out.println("O resultado da multiplicação é " + resultado2);
	}
	public void divisao(int x1, int x2) {
		
		int resultado3 = x1/x2;
		System.out.println("O resultado da divisão é " + resultado3);
	}
}
