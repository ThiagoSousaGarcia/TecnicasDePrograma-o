public class ObservableTermo implements Observable{
	private int topo;
	private double estado;
	private Observer set[];

	public ObservableTermo(Termo termo){
		topo = 0;
		estado = termo.evaluate();
		set = new Observer[10];
	}

	public double getEstado(){
		return estado;
	}

	public void setState(Termo termo){
		estado = termo.evaluate();
	}

	public void anexar(Observer o){
		set[topo] = o;
		topo++;
	}

	public void notificar(){
		for(int index = 0 ; index < topo ; index++)
			set[index].update(this);
	}
}