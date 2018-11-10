public class ObserverNegativo implements Observer{
	public void update(Observable o){
		if(o.getEstado() < 0)
			System.out.println("O resultado é negativo");
	}
}