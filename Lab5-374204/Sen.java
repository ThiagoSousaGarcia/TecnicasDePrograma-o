public class Sen extends Trig{
	public Sen(Termo arg){
		super(arg);
	}

	public Sen(double arg){
		super(arg);
	}

	public double evaluate(){
		return Math.sin(arg.evaluate());
	}
}