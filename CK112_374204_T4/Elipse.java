class Elipse extends Figura {
	
	Ponto o;
	float base_maior;
	float base_menor;	

	public Elipse(){}

	public Elipse(int base_menor , int base_maior){
		this.y = 0;
		this.x = 0;
		this.base_maior = (float)base_maior;
		this.base_menor = (float)base_menor;
	}

	public void mover(Ponto o){
		this.o = o;
	}

	public void desenhar(){
		System.out.println("Elipse "+" raio menor: "+this.base_menor + " raio maior: "+base_maior+" Ponto: "+this.x+" , "+this.y);
	}	

	public void calcularArea(){
		float area;

		area = 3*(base_menor*base_maior);

		System.out.println ("Área da Elipse: "+area);
	}
}