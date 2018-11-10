class Quadrado extends Figura {
	
	Ponto o;
	float lado;
	String cor;

	public Quadrado(){}

	public Quadrado(int lado){
		this.y = 0;
		this.x = 0;
		this.lado = (float)lado;
	}


	public void desenhar(){
		System.out.println ("Quadrado "+" lado: "+this.lado+" Ponto: "+this.x+" , "+this.y); 
	}

	public void mover(Ponto o){
		this.o = o;
	}

	public void calcularArea(){
		float area;

		area = (this.lado)*(this.lado);

		System.out.println ("Área do Quadrado: "+area);
	}
}