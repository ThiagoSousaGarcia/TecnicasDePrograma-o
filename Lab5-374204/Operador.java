public abstract class Operador extends Termo{
	protected Termo termo1, termo2;

	
	public Operador(Termo termo1, Termo termo2){
		this.termo1 = termo1;
		this.termo2 = termo2;
	}

}