import java.util.*;
import java.util.Vector;
public class CountWords1{
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		String texto = "a";

		while(!texto.trim().equals("")){
			texto = teclado.nextLine();
			int contador = 0;
			int countDiferentes = 0;
			String[] palavras = texto.split(" ");
			contador = palavras.length;

			Map<String, Integer> palavrasDiferentes2 = new HashMap();
			for(int i=0; i<contador; i++){
				if(palavrasDiferentes2.containsKey(palavras[i])){
					palavrasDiferentes2.put(palavras[i], palavrasDiferentes2.get(palavras[i])+1);
				}else{
					palavrasDiferentes2.put(palavras[i], 1);
				}
			}
			countDiferentes = palavrasDiferentes2.size();

			System.out.println("palavras: "+contador);
			System.out.println("palavras distintas: "+countDiferentes);
			System.out.println(palavrasDiferentes2);
		}
	} 
}