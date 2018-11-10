

public class Main {

    public static void main(String[] args) {

        boolean verifica;
        
        int dezc_naturais[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int dezPares[] = {2, 4, 6, 8, 10};
        int dezImpares[] = {1, 3, 5, 7, 9};
        int dezPrimos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        int univ[] = new int [50];
        for(int i=0; i<50; i++){
            univ[i]= i+1;
        }
        
        Conjunto c_naturais, c_pares, c_impares, c_primos, novo, universo;
        c_naturais = new Conjunto(dezc_naturais);
        c_pares = new Conjunto(dezPares);
        c_impares = new Conjunto(dezImpares);
        c_primos = new Conjunto(dezPrimos);
        universo = new Conjunto(univ);
        novo = new Conjunto();
        
        verifica = c_primos.verifSubconjunto(c_primos);
        System.out.println("Se  o  conjunto  4  é  subconjunto  de  si  mesmo: "+ verifica);

        verifica = c_naturais.verifSubconjunto(c_pares);
        System.out.println("  Pertinencia do conjunto 2: "+ verifica);
        verifica = c_naturais.verifSubconjunto(c_impares);
        System.out.println("    Pertinencia do conjunto 3: "+ verifica);
        verifica = c_naturais.verifSubconjunto(c_primos);
        System.out.println("    Pertinencia do conjunto 4: "+ verifica);
        
        novo = c_pares.uniao(c_impares);
        novo = novo.diferenca(c_naturais);
        
        if(novo.tamanho() == 0){
            System.out.println(" A união dos conjuntos 2 e 3 e igual ao 1: V");
        }else{
            System.out.println(" A uniao dos conjuntos 2 e 3 e igual ao 1: F"
           );
        }
        
        novo = c_naturais.interseccao(c_pares);
        if(novo.tamanho() == 0){
            System.out.println(" Se a intersecção dos conjuntos 1 e 2 e vazia: V");
        }else{
            System.out.println(" Se a intersecção dos conjuntos 1 e 2 e vazia: F");
        }
        
        novo = c_naturais.diferenca(c_pares);
        System.out.print("A diferenca entre os conjuntos 1 e 2: ");
        for(int i=0; i<novo.tamanho(); i++){
            System.out.print(novo.elementos[i]+" ");
        }
        
        Conjunto conja, conjb;
        
        conja = c_impares.prodCart(c_primos);
        conjb = c_pares.prodCart(c_primos);

        verifica = c_primos.verifSubconjunto(c_primos);
        System.out.println("Se  o  conjunto  4  é  subconjunto  de  si  mesmo: "+ verifica);

        verifica = conja.verifSubconjunto(conjb);
        System.out.println(" Pertinencia do conjunto 2: "+ verifica);
        verifica = conja.verifSubconjunto(conjb);
        System.out.println("   Pertinencia do conjunto 3: "+ verifica);
        verifica = conja.verifSubconjunto(conjb);
        System.out.println("    Pertinencia do conjunto 4: "+ verifica);
        
        novo = conja.uniao(conjb);
        novo = conja.diferenca(conjb);
        
        if(novo.tamanho() == 0){
            System.out.println(" A uniao dos conjuntos 2 e 3 e igual ao 1: V");
        }else{
            System.out.println(" A uniao dos conjuntos 2 e 3 e igual ao 1: F"s);
        }
        
        novo = conja.interseccao(conjb);
        if(novo.tamanho() == 0){
            System.out.println(" Se a intersecção dos conjuntos 1 e 2 e vazia: V");
        }else{
            System.out.println("  Se a intersecção dos conjuntos 1 e 2 e vazia: F")s }
        
        novo = conja.diferenca(conjb);
        System.out.print("  A diferenca entre os conjuntos 1 e 2: ");
        for(int i=0; i<novo.tamanho(); i++){
            System.out.print(novo.elementos[i]+" ");
        }
        
        
        Conjunto conjA, conjB, conj1, conj2;
        
        conj1 = c_naturais.uniao(c_pares);
        conj1 = universo.diferenca(conj1);
       
        conjA = universo.diferenca(c_naturais);
        conjB = universo.diferenca(c_pares);
        conj2 = conjA.interseccao(conjB);
        
        conj1 = conj1.diferenca(conj2);
        if(conj1.tamanho()==0){
            System.out.println("\n\nA Lei de Morgan se mantem válida!");
        }
        
        conj1 = c_naturais.interseccao(c_pares);
        conj1 = universo.diferenca(conj1);
       
        conjA = universo.diferenca(c_naturais);
        conjB = universo.diferenca(c_pares);
        conj2 = conjA.uniao(conjB);
        
        conj1 = conj1.diferenca(conj2);
        if(conj1.tamanho()==0){
            System.out.println(" A Lei de Morgan se mantem válida!");
        } 
    }
}