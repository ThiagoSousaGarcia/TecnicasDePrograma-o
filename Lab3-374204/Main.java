class Main{
	public static void main(String []args){
		Circulo c1,c2,c3,c4,c5,c6,c7,c8,c9,c10; 
		Quadrado q1,q2,q3,q4,q5,q6,q7,q8,q9,q10; 
		Figura fig[] = new Figura[10];
		int i;

		c1 = new Circulo();
		c2 = new Circulo();
		c3 = new Circulo();
		c4 = new Circulo();
		c5 = new Circulo();

		q1 =  new Quadrado();
		q2 =  new Quadrado();
		q3 =  new Quadrado();
		q4 =  new Quadrado();
		q5 =  new Quadrado();

		q1.lado = 3;
		q2.lado = 10;
		q3.lado = 52;
		q4.lado = 19;
		q5.lado = 20;

		c1.raio = 5;
		c2.raio = 8;
		c3.raio = 86;
		c4.raio = 4;
		c5.raio = 3;

		fig[0] = q1;
		fig[1] = q2;
		fig[2] = q3;
		fig[3] = q4;
		fig[4] = q5;
		fig[5] = c1;
		fig[6] = c2;
		fig[7] = c3;
		fig[8] = c4;
		fig[9] = c5;


		for (i=0;i<10;i++){
			if (fig[i] instanceof Quadrado){
				System.out.println("Área: " + fig[i].calcularArea());
			}
			
		}
			
	}
}
