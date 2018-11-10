public class Cos extends Trig{
	public Cos(Termo arg){
		super(arg);
	}

	public Cos(double arg){
		super(arg);
	}

	public double evaluate(){
		return Math.cos(arg.evaluate());
	}
}