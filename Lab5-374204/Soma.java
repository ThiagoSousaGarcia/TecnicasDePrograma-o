public class Soma extends Operador{

	public Soma(Termo termo1, Termo termo2){
		super(termo1, termo2);
	}
	public double evaluate(){
		return termo1.evaluate() + termo2.evaluate();
	}
}