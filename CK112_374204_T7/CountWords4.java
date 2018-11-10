import java.util.*;
import java.util.Vector;
public class CountWords4{
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		String texto = "a";

		while(!texto.trim().equals("")){
			texto = teclado.nextLine();
			int count = 0;
			int countDiferentes = 0;
			String[] palavras = texto.split(" ");
			count = palavras.length;
			
			Map<String, Integer> palavrasDiferentes2 = new TreeMap();
			for(int i=0; i<count; i++){
				if(palavrasDiferentes2.containsKey(palavras[i])){
					palavrasDiferentes2.put(palavras[i], palavrasDiferentes2.get(palavras[i])+1);
				}else{
					palavrasDiferentes2.put(palavras[i], 1);
				}
			}
			countDiferentes = palavrasDiferentes2.size();

			System.out.println("palavras: "+count);
			System.out.println("palavras distintas: "+countDiferentes);

			Map<String, Integer> ordernarValor = new TreeMap((new Comparator<String>(){
					public int compare(String o1, String o2)
					{
						int comparador = palavrasDiferentes2.get(o1).compareTo(palavrasDiferentes2.get(o2));
						if(comparador == 0){
							return 1;
						}
						return comparador;
					}
				}
			));
			ordernarValor.putAll(palavrasDiferentes2);
			System.out.println(ordernarValor);
		}
	}
}