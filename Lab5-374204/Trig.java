public abstract class Trig extends Termo{
	protected Termo arg;

	public Trig(Termo arg){
		this.arg = arg;
	}

	public Trig(double arg){
		this.arg = new Operando(arg);
	}
}
