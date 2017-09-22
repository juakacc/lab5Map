package SIG;

public class Sig {
	
	private Financeira financeira;
	private Almoxarifado almoxarifado;
	private Administrativa admin;
	private InfraEstrutura infra;
	
	public Sig(Financeira financeira, Almoxarifado almoxarifado, Administrativa admin, InfraEstrutura infra) {
		this.financeira = financeira;
		this.almoxarifado = almoxarifado;
		this.admin = admin;
		this.infra = infra;
	}

	public void verificarMatricula(Aluno a, Professor p) {
		System.out.println("::::: MATRICULA :::::");
		a.verificarMensalidade();
		infra.getSalas();
		a.getHistorico();
		p.getAlocaDisciplina();
	}
	
	public void gerenciarContas() {
		System.out.println("::::: GERENCIAR CONTA :::::");
		financeira.getBalancoContas();
		almoxarifado.getEstoque();
		almoxarifado.getPedidos();
		financeira.getFolhaPagamento();
	}
	
	public void localizarEventos() {
		System.out.println("::::: EVENTOS :::::");
		admin.getAgendamento();
		infra.getSalasDosEventos();
	}
}
