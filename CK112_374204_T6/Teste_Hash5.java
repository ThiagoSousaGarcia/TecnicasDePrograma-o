import java.util.*;
public class  Teste_Hash5 {
	Teste_Hash5(Collection<String> c, String[] s){
		c.addAll(Arrays.asList(s));
		verificar(c);
	}
	static void verificar(Collection<String> c){
		System.out.println("Permitir a inclusão de elementos duplicados ?");
		if(c instanceof Set){
			System.out.println("Não");
		}else{
			System.out.println("Sim");
		}			
		System.out.println("Ordenar automaticamente os elementos inseridos nela?");
		if(c instanceof TreeSet){
			System.out.println("Sim");
		}else{
			System.out.println("Não");
		}
		System.out.println("Garante a ordem de entrada dos elementos a coleção?");
		if(c instanceof List){
			System.out.println("Sim");
		}else{
			System.out.println("Não");
		}
	}
}