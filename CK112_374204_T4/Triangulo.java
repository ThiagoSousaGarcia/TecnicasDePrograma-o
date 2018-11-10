class Triangulo extends Figura{
	
	Ponto o;
	float base;
	float altura;

	public Triangulo(){}

	public Triangulo(int base , int altura){
		this.y = 0;
		this.x = 0;
		this.base = (float)base;
		this.altura = (float)altura;
	}

	public void desenhar(){
		System.out.println ("Triangulo "+" base: "+this.base+" altura: "+this.altura + " Ponto: "+this.x+" , "+this.y);
	}	

	public void mover(Ponto o){
		this.o = o;
	}

	public void calcularArea(){
		float area;

		area = (base*altura)/2;

		System.out.println ("Área do Triangulo: "+area);
	}
}