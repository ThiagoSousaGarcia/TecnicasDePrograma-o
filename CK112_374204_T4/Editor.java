class Editor {

	int contFig = 0;
	Figura listaFig[] = new Figura[100];


	void receberComandos(int operacao){

		switch (operacao) {
			case 1: System.out.println("Não foi passada Figura");
					break;
		
			case 2: contFig --;
					break;

		}
	}

	void receberComandos(int operacao, Figura fig){

		switch (operacao) {
			case 1: listaFig[contFig] = fig;
					contFig ++;
					break;
		
			case 2: contFig --;
					break;

		}
	}

	void desenharFig(){

		for (int i = 0; i<contFig;i++) {
			listaFig[i].desenhar();
		}

	}

	void imprimirArea(){
		for (int i = 0; i<contFig;i++) {
			listaFig[i].calcularArea();
		}
	}
}