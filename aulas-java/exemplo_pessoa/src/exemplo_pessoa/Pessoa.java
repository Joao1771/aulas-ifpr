package exemplo_pessoa;

public class Pessoa {

	//CRIANDO OS ATRIBUTOS DA CLASSE
	private String nome;
	private int idade;
	private String cpf;
	
	//CRIANDO OS METODOS
	public void acrescentarIdade() {
		//1 FORMA 
		//idade = idade + 1;
		//2 FORMA
		idade++;
	}
	public String getNome() {
		return this.nome;
		}
	public int getIdade() {
		return this.idade;
		}
	public String getCpf() {
		return this.cpf;
		}
	//SET EH PARA RECEBER INFORMAÇOES
	public void setNome(String nome) {
		this.nome = nome;
		}
	public void setIdade(int idade) {
		this.idade = idade;
		}
	public void setCpf(String cpf) {
		this.cpf = cpf;
		}

}
