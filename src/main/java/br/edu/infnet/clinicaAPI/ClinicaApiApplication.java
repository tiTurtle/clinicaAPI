package br.edu.infnet.clinicaAPI;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import br.edu.infnet.clinicaAPI.model.domain.Profissional;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClinicaApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicaApiApplication.class, args);
		Scanner in = new Scanner(System.in);
		int opcao = 0;
		
		System.out.println("Iniciando...");
		
		do {
			System.out.println("Digite uma opção");
			System.out.println("1 - Cadastrar Profissional");
			System.out.println("2 - Sair");
			
			opcao = in.nextInt();
			
			switch(opcao){
			
			case 1:
				Profissional profissional = new Profissional();
				
			System.out.println("Digite o nome do profissional");
			profissional.nome = in.next();
			
			System.out.println("Digite o cpf do profissional");
			profissional.cpf = in.next();
			
			System.out.println("Digite o telefone do profissional");
			profissional.telefone = in.next();
			
			System.out.println("Digite a especialidade do profissional (ex: Cardiologia, Oncologia, Clínica Geral)");
			profissional.especialidade = in.next();
			
			System.out.println("Digite o número do conselho do profissional");
			profissional.num_conselho = in.next();
			
			
			System.out.println("Digite a quantidade de consultas realizadas pelo profisisonal");
			if(!in.hasNextInt()) {
				String campo = in.next();
				System.out.println("Quantidade Inválida: " + campo );
			} else {
				int qtd_consultas = in.nextInt();
				in.nextLine();
				
				if (qtd_consultas < 0) {
					System.out.println("A quantidade não pode ser negativa");
				} else {
					profissional.qtd_atendimentos = qtd_consultas;
				}
			}
			
			System.out.println("Digite o valor da consulta");
			if(!in.hasNextDouble()) {
				String campo = in.next();
				System.out.println("Valor Inválido: " + campo );
			} else {
				double valor_consulta = in.nextDouble();
				in.nextLine();
				
				if (valor_consulta <= 0) {
					System.out.println("O valor não pode ser negativo ou nulo");
				} else {
					profissional.valor_consulta = valor_consulta;
					}
				}
			
				profissional.imprimirDados();
			
			
			break;
			case 2:
				System.out.println("Saindo");
				
			default:
				System.out.println("Digite uma opção válida");
				break;
			}
			
			
		} while(opcao != 2);
		
		System.out.println("Fechando...");
		
		in.close();	
	}

}
