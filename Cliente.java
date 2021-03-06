package locadora;

public class Cliente {
	private String nome, enderešo, cpf;
	private String idade, numero;

	public Cliente(String nome, String enderešo, String cpf, String idade, String numero) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
		return "Cliente: Nome:" + nome + ", Enderešo:" + enderešo + ", CPF:" + cpf + ", Idade:" + idade + ", Numero:"
			+ numero +"\n";
	}

}