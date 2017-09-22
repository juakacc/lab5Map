package SIG;

public class Main {
	
	public static void main(String args []) {
		
		InfraEstrutura infra = new InfraEstrutura();
		Administrativa admin = new Administrativa();
		Almoxarifado almoxarifado = new Almoxarifado();
		Financeira financeira = new Financeira();
		
		Sig sig = new Sig(financeira, almoxarifado, admin, infra);
		sig.gerenciarContas();
		sig.verificarMatricula(new Aluno(), new Professor());
		sig.localizarEventos();
	}

}
