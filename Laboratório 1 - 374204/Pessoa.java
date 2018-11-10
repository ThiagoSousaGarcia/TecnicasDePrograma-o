class Pessoa
{
	String nome;
	int idade;

	Pessoa(){}

	Pessoa(String nome, int idade){
		setNome(nome);
		setIdade(idade);
	}

	void setNome(String pnome){
		nome = pnome;
	}

	void setIdade(int nidade){
		idade = nidade;
	}

	String getIdadeNome(){
		return ("NOME:" + nome + ",IDADE: " + idade);
	}
} 