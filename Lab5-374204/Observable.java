public interface Observable{
	public void anexar(Observer o);
	public void notificar();
	public void setState(Termo t);
	public double getEstado();
}