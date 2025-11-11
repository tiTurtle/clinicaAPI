package br.edu.infnet.clinicaAPI.model.domain;


public class Profissional {
	private String nome;
	private String cpf;
	private String telefone;
	private String especialidade;
	private String num_conselho;
	private int qtd_atendimentos;
	private double valor_consulta;
	private double porcentagem_repasse;
	
	
	
	
	public void imprimirDados() {
		System.out.println("O(A) profissional " + getNome() + ", especialidade de " + getEspecialidade() + ", foi cadastrado(a) com sucesso");
		System.out.println("Total do Repasse: R$ " + calcularRepasse());
		
	}
	
	private double calcularRepasse() {
		
		return qtd_atendimentos * valor_consulta * getPorcentagem_repasse();
		
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getNum_conselho() {
		return num_conselho;
	}

	public void setNum_conselho(String num_conselho) {
		this.num_conselho = num_conselho;
	}

	public int getQtd_atendimentos() {
		return qtd_atendimentos;
	}

	public void setQtd_atendimentos(int qtd_atendimentos) {
		this.qtd_atendimentos = qtd_atendimentos;
	}

	public double getValor_consulta() {
		return valor_consulta;
	}

	public void setValor_consulta(double valor_consulta) {
		this.valor_consulta = valor_consulta;
	}

	public double getPorcentagem_repasse() {
		return porcentagem_repasse;
	}

	public void setPorcentagem_repasse(double porcentagem_repasse) {
		this.porcentagem_repasse = porcentagem_repasse / 100;
	}
	
	
	
}
