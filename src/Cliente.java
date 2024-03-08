
public class Cliente {

	private String nome;
	private String cpf;
	private Integer score;

	public Cliente(){
	}

	public Cliente(String nome, String cpf, Integer score){
		nome = this.nome;
		cpf = this.cpf;
		score = this.score;
	}
	
	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
