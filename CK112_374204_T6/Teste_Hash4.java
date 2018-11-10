import java.util.*;
class  Teste_Hash4 {
	public static void main(String args[]){
		LinkedHashSet<String> mesesHash = new LinkedHashSet<>();
		mesesHash.add("Janeiro");
		mesesHash.add("Fevereiro");
		mesesHash.add("Março");
		mesesHash.add("Abril");
		mesesHash.add("Maio");
		mesesHash.add("Fevereiro");
		System.out.println("HashSet:");
		Teste_Hash2.listar(mesesHash);
		Teste_Hash2.listar2(mesesHash);
	}
}