class Quadrado extends Figura implements FiguraColorida{
	
	float lado;
	String cor;

	public String toString(){
		return("Quadrado "); 
	}

	public String desenhar(){
		return (this.toString());
	}

	public String desenhar(String cor){
		this.cor = cor ;
		return (this.toString() + cor);
	}	

	public float calcularArea(){
		float area;

		area = (this.lado)*(this.lado);

		return (area);
	}
}