class Circulo extends Figura{
	float raio;	

	public String toString(){
		return ("Circulo");
	}	

	public String desenhar(){
		return (this.toString());
	}

	public float calcularArea(){
		float area;

		area = 2*3*(raio*raio);

		return (area);
	}
}