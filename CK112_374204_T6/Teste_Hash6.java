import java.util.*;
class  Teste_Hash6 {
	public static void main(String args[]){
		List<String> c1 = new ArrayList();
		c1.add("Janeiro");
		c1.add("Fevereiro");
		c1.add("Março");
		c1.add("Abril");
		c1.add("Maio");
		c1.add("Fevereiro");

		HashSet<String> c2 = new HashSet();
		c2.addAll(c1);
		TreeSet<String> c3 = new TreeSet();
		c3.addAll(c1);
		LinkedHashSet<String> c4 = new LinkedHashSet();
		c4.addAll(c1);

		System.out.println(" Array List ");
		Teste_Hash2.listar(c1);
		System.out.println("Hash Set ");
		Teste_Hash2.listar(c2);
		System.out.println(" Tree Set ");
		Teste_Hash2.listar(c3);
		System.out.println(" Linked Hash Set ");
		Teste_Hash2.listar(c4);
	}
}