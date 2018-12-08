package locadora;

public class Cliente {
	private String nome, endere�o, cpf;
	private String idade, numero;

	public Cliente(String nome, String endere�o, String cpf, String idade, String numero) {
		super();
		this.nome = nome;
		this.endere�o = endere�o;
		this.cpf = cpf;
		this.idade = idade;
		this.numero = numero;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Cliente: Nome:" + nome + ", Endere�o:" + endere�o + ", CPF:" + cpf + ", Idade:" + idade + ", Numero:"
			+ numero +"\n";
	}

}