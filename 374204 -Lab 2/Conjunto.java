class Conjunto{
    private int elementos[];

    public Conjunto(){}

    public Conjunto(int elementos[]){
        this.elementos = elementos;
    }
    
    int tamanho(){
        int cont,i;

        cont = 0;
        for (i = 0;i<this.elementos.length; i++ ) {
            if(this.elementos[i] != 0 ){
                cont ++ ;
            }
            else{
                break;
            }
        }
        return cont;
    }

    public boolean insercao(int elemento){
        int t = tamanho();

        if (t < 1000){
            this.elementos[t] = elemento;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean verifPertinencia(int elemento){
        int i;
        int tam = tamanho();

        for (i=0;i<tam;i++){
            if (this.elementos[i] == elemento) {
                return true;
            }
        }
        return false;
    }

    public boolean verifSubconjunto(Conjunto outro){
        int t1,t2,verif,i,j; 

        t1 = this.tamanho();
        t2 = outro.tamanho();

        if (t1<t2){
            return false;   
        }
        else{
            for (i=0;i<t1;i++){
                verif = 0;
                for (j=0;j<t2;j++){
                    if (outro.elementos[j] == this.elementos[i]) {
                        verif = 1;
                    }
                }

                if (verif != 1){
                    return false;
                }
            }
            return true;
        }
    }

    public Conjunto uniao(Conjunto outro){
        int i = 0, t1, t2;
        Conjunto uniaoConjunto = new Conjunto();
        
        t1 = this.tamanho();
        t2 = outro.tamanho();

        for(i=0; i<t1; i++) {
            uniaoConjunto.elementos[i] =  this.elementos[i];
        }
        for(int j=0; j<t2; j++){
            uniaoConjunto.elementos[i] =  outro.elementos[j];
            i++;
        }
        return uniaoConjunto;

    }

    public Conjunto interseccao(Conjunto outro){
        int cont = 0, t1, t2;
        Conjunto interseccaoConjunto = new Conjunto();
        
        t1 = this.tamanho();
        t2 = outro.tamanho();
        
        for(int i=0; i<t1; i++) {
            for(int j=0; j<t2; j++) {
                if(this.elementos[i]==outro.elementos[j]){
                    interseccaoConjunto.elementos[cont] = this.elementos[i];
                    cont++;
                    break;
                }
            }
        }
        
        return interseccaoConjunto; 
    }

    public Conjunto diferenca(Conjunto outro){

        boolean verifica = false;
        int cont , t1, t2;
        Conjunto diferencaConjunto = new Conjunto();
        
        cont = 0;
        t1 = this.tamanho();
        t2 = outro.tamanho();
        
        if(t1>=t2){
            
            for(int i=0; i<t1; i++) {
                verifica = false;
                for(int j=0; j<t2; j++) {
                    if(this.elementos[i]==outro.elementos[j]){
                        verifica = true;
                        break;
                    }
                }
                
                if(!verifica){
                    diferencaConjunto.elementos[cont] = this.elementos[i];
                    cont++;
                }
            }
        }else{
        
            for(int i=0; i<t2; i++) {
                verifica = false;
                for(int j=0; j<t1; j++) {
                    if(this.elementos[i]==outro.elementos[j]){
                        verifica = true;
                        break;
                    }
                }
                
                if(!verifica){
                    diferencaConjunto.elementos[cont] = this.elementos[i];
                    cont++;
                }
            }
        }     
        return diferencaConjunto;
    }

    public Conjunto prodCart(Conjunto outro){
        Conjunto produto = new Conjunto();
        int t1, t2, binario, cont = 0;
        String bin;
        
        t1 = this.tamanho();
        t2 = outro.tamanho();

        for(int i=0; i<t1; i++){
            bin = "";
            for(int j=0; j<t2; j++){
                bin = Integer.toBinaryString(this.elementos[i]);
                bin += Integer.toBinaryString(outro.elementos[j]);
                binario = Integer.parseInt(bin);               
                produto.elementos[cont] = binario;
                cont++;
            }
        }
        return produto;

    }

    public Conjunto potConjunto(Conjunto outro){
        Conjunto potencia = new Conjunto();
        int cont, subCont, binInt, t1;
        String bin;

        subCont = 0;
        cont = 0;
        t1 = this.tamanho();
        

        while(cont<t1){
            subCont = 0;
            bin = "";
            while(subCont<=cont){
                bin += Integer.toBinaryString(this.elementos[subCont]);
                subCont++;
            }
            binInt = Integer.parseInt(bin); 
            potencia.elementos[cont] = binInt;
            cont++;
        }
        return potencia;
    }



}