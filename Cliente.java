package locadora;

public class Cliente {
	private String nome, endereço, cpf;
	private String idade, numero;

	public Cliente(String nome, String endereço, String cpf, String idade, String numero) {
		super();
		this.nome = nome;
		this.endereço = endereço;
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

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
		return "Cliente: Nome:" + nome + ", Endereço:" + endereço + ", CPF:" + cpf + ", Idade:" + idade + ", Numero:"
			+ numero +"\n";
	}

}