abstract class Figura{
	float x,y;
	
	abstract String desenhar();
	abstract float calcularArea();

	void mover(float dx,float dy){
		this.x = x +dx;
		this.y = y+ dy;
	}
	


}