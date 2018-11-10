/*
Polimorfismo de inclusão : Quando as classes Quadrado,Triangulo,Retangulo,Elipse recebem herança da classe Figura e quando a classe Figura 
recebe herança da classe Ponto.

Polimorfismo de sobrecarga : Na classe "Editor" , a função "receberComandos" tem sobrecarga, pois recebe diferentes tipos de parametros.

Polimorfimos de coerção : Ocorre quando recebemos "int" nos construtores das classes de Figuras geométricas e forçamos "float".
 
*/


class Main{
	
	public static void main(String []args){
		
		Editor e = new Editor();

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		Quadrado q1 = new Quadrado(10);
		e.receberComandos(1, q1);
		
		Quadrado q2 = new Quadrado(5);
		e.receberComandos(1, q2);
		
		Circulo c = new Circulo(25);
		e.receberComandos(1, c);

		Elipse e1 = new Elipse(20,25);
		e.receberComandos(1, e1);

		Triangulo t1 = new Triangulo(10,12);
		e.receberComandos(1 , t1);

		Retangulo r1 = new Retangulo(5,2);
		e.receberComandos(1 , r1);

		e.desenharFig();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		e.imprimirArea();

		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		e.receberComandos(2);
		e.desenharFig();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		e.imprimirArea();
    }
}