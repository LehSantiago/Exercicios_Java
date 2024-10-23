package empresaEstagio;

public class Empresa {
	private String nome;
	private Aluno aluno;
	
	public Empresa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
	public void situacao() {
		System.out.printf("A(o) aluna(o) faz estágio aqui!", aluno.getNome());
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
