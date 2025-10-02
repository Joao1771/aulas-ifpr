package exemplo_pessoa;

public class Main {

	public static void main (String[] args) {
		//System.out.println("Olá mundo!");
		
		//INSTACIANDO (CRIANDO OBJETO) PESSOA
		Pessoa pessoa = new Pessoa();
		
		//INSERINDO INFORMAÇÕES NA PESSOA
//		pessoa.nome = "Adilsberto";
//		pessoa.idade = 100;
//		pessoa.cpf = "1111";
		pessoa.setNome("Adilsberto");
		pessoa.setIdade(100);
		pessoa.setCpf("1111");
		
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa.setNome("Jusiscreia");
		pessoa.setIdade(15);
		pessoa.setCpf("22222222");
		
		System.out.println("O " + pessoa.getNome() + " tem: " + pessoa.getIdade() + " anos");
		System.out.println("A " + pessoa2.getNome() + " tem: " + pessoa2.getIdade() + " anos");
		
		//CHAMANDO METODO DA CLASSE
		pessoa.acrescentarIdade();
		
		System.out.println("O " + pessoa.getNome() + " tem: " + pessoa.getIdade() + " anos");
		System.out.println("A " + pessoa2.getNome() + " tem: " + pessoa2.getIdade() + " anos");
	}
}
