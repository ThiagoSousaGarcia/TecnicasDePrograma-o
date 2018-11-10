class Retangulo extends Figura{
	
	Ponto o;
	float base;
	float altura;

	public Retangulo(){}

	public Retangulo(int base , int altura ){
		this.y = 0;
		this.x = 0;
		this.base = (float)base;
		this.altura = (float)altura;
	}

	public void desenhar(){
		System.out.println ("Retangulo "+" base: "+this.base+" altura: "+ this.altura+" Ponto: "+this.x+" , "+this.y);
	}	

	public void calcularArea(){
		float area;

		area = (base)*(altura);

		System.out.println ("Área do Retangulo: "+area);	
	}

	void mover(Ponto o){
		this.o = o;
	}
}