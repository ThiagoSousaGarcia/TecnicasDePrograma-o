class Main
{
	public static void main (String args[])
	{
		Pessoa p1 = new Pessoa();
		p1.setNome("Ana");
		p1.setIdade(13);
		Pessoa p2 = new Pessoa();
		p2.setNome("João");
		p2.setIdade(15);
		System.out.println (p1.getIdadeNome());
		System.out.println (p2.getIdadeNome());
		p2=p1;
		System.out.println (p1.getIdadeNome());
		System.out.println (p2.getIdadeNome());
	
	}
} 