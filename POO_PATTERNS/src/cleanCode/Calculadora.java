package cleanCode;

public class Calculadora {
	
	private double num1;
	private double num2;
	private String operacao;
	private double resultado;
	
	public Calculadora(double num1, double num2, String operacao) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operacao = operacao;
	}
	
	public double CalcularOperacao(){
		
		if (operacao == "soma"){
			resultado = Soma(num1,num2);
			return resultado;
		}
		
		if (operacao == "subtracao"){
			resultado = subtracao(num1, num2);
			return resultado;
		
		}
		
		if (operacao == "divisao"){
			resultado = subtracao(num1, num2);
			return resultado;
		
		}
		
		if (operacao == "multiplicacao"){
			resultado = subtracao(num1, num2);
			return resultado;
		
		}
		return(Double)null;
	}
	
	
	public double Soma(double num1, double num2) {
		return num1 + num2;
			
	}
	public double subtracao(double num1, double num2){
		return num1 - num2;
	}
	public double divisao(double num1,double num2){
		return num1 / num2;
	}
	public double multiplicacao(double num1, double num2){
		return num1 * num2;
	}
}