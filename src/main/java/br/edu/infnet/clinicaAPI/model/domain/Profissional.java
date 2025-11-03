package br.edu.infnet.clinicaAPI.model.domain;


public class Profissional {
	public String nome;
	public String cpf;
	public String telefone;
	public String especialidade;
	public String num_conselho;
	public int qtd_atendimentos;
	public double valor_consulta;
	
	
	
	
	public void imprimirDados() {
		System.out.println("O(A) profissional " + nome + ", especialidade de " + especialidade + ", foi cadastrado(a) com sucesso");
		System.out.println("Total do Repasse: R$ " + calcularRepasse());
		
	}
	
	private double calcularRepasse() {
		
		return qtd_atendimentos * valor_consulta;
		
	}
}
