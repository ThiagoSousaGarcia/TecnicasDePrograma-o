public class Operando extends Termo{
	private double numero;

	
	public Operando(double numero){
		this.numero = numero;
	}
	
	public double evaluate(){
		return numero;
	}

}