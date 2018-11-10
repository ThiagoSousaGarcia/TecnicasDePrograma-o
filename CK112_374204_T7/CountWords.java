import java.util.*;
import java.util.Vector;
public class CountWords{
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		String texto = "a";

		while(!texto.trim().equals("")){
			texto = teclado.nextLine();
			int contador = 0;
			int countDiferentes = 0;
			String[] palavras = texto.split(" ");
			contador = palavras.length;

			Set<String> palavrasDiferentes = new HashSet();
			for(int i=0; i<contador; i++){
				palavrasDiferentes.add(palavras[i]);
			}
			countDiferentes = palavrasDiferentes.size();

			System.out.println("palavras: "+contador);
			System.out.println("palavras distintas: "+countDiferentes);	
		}
	} 
}