class Circulo extends Figura{
	
	Ponto o;
	float raio;	

	public Circulo(){}

	public Circulo(int raio){
		this.y = 0;
		this.x = 0;
		this.raio = (float)raio;
	}

	void mover(Ponto o){
		this.o = o;
	}

	public void desenhar(){
		System.out.println ("Circulo "+" raio: "+this.raio + " Ponto: "+this.x+" , "+this.y);
	}	

	public void calcularArea(){
		float area;

		area = 2*3*(raio*raio);

		System.out.println ("Área do círculo: "+area);
	}
}