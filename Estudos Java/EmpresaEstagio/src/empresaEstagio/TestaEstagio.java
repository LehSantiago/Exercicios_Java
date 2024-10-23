package empresaEstagio;

public class TestaEstagio {
	public static void main (String[] args) {
	Aluno a = new Aluno("Letícia");
	Empresa e = new Empresa("Itaú Unibanco");
	a.setEmpresaEstagio(e);
	a.situacao();
	
	}
}
