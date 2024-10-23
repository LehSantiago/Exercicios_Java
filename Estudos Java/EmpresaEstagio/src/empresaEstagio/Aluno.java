package empresaEstagio;

public class Aluno {
	private String nome;
	private Empresa empresaEstagio;

	public Aluno(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEmpresaEstagio(Empresa e) {
		empresaEstagio = e;
	}

	public void situacao() {
		if (empresaEstagio == null) {
			System.out.printf("A(o) aluna(o) %s não faz estágio.", nome);
		} else {
			System.out.printf("A(o) aluna(o) %s faz estágio na empresa %s\n", nome, empresaEstagio.getNome());
		}
	}
}
