public class Main{
	public static void main(String[] args){

		Termo termo1 = new Operando(6), termo2 = new Operando(9);

		Termo op = new Soma(termo1, termo2);
		show(termo1);
		show(termo2);
		show(op);

		Observable ot = new ObservableTermo(op);
		ot.anexar(new ObserverPositivo());
		ot.anexar(new ObserverNegativo());
		ot.notificar();


		op = new Subtracao(termo1, termo2);
		ot.setState(op);
		show(op);
		ot.notificar();

		op = new Multiplicacao(termo1, termo2);
		ot.setState(op);
		show(op);
		ot.notificar();

		op = new Divisao(termo1, termo2);
		ot.setState(op);
		show(op);
		ot.notificar();

	}

	public static void show(Termo t){
		System.out.println(t.evaluate());
	}
}