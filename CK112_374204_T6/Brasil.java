import java.util.*;
class  Brasil{
	public static void main(String args[]){
		LinkedHashMap<String, String> estado = new LinkedHashMap<>();
		estado.put("AC", "Acre");
		estado.put("AP", "Alagoas");
		estado.put("AM", "Amazonas");
		estado.put("BA", "Bahia");
		estado.put("CE", "Ceará");
		estado.put("DF", "Distrito Federal");
		estado.put("ES", "Espírito Santo");
		estado.put("GO", "Goiás");
		estado.put("MA", "Maranhão");
		estado.put("MT", "Mato Grosso");
		estado.put("MS", "Mato Grosso do Sul");
		estado.put("MG", "Minas Gerais");
		estado.put("PA", "Pará");
		estado.put("PB", "Paraíba");
		estado.put("PR", "Paraná");
		estado.put("PE", "Pernambuco");
		estado.put("PI", "Piauí");
		estado.put("RJ", "Rio de Janeiro");
		estado.put("RN", "Rio Grande do Norte");
		estado.put("RS", "Rio Grande do Sul");
		estado.put("RO", "Rondônia");
		estado.put("RR", "Roraima");
		estado.put("SC", "Santa Catarina");
		estado.put("SP", "São Paulo");
		estado.put("SE", "Sergipe");
		estado.put("TO", "Tocantins");
		args[0] = args[0].toUpperCase();
		if(estado.containsKey(args[0])){
			System.out.println(args[0]+" -> "+estado.get(args[0]));
		}else{
			System.out.println("Esse estado não existe");
		}
	}
}