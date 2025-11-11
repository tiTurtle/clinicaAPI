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
			System.out.println("\nDigite uma opção:");
			System.out.println("1 - Cadastrar Profissional");
			System.out.println("2 - Sair");
			System.out.print("> ");

			while (!in.hasNextInt()) {
				System.out.println("Opção inválida. Digite um número.");
				in.next(); 
				System.out.print("> ");
			}
			opcao = in.nextInt();
			in.nextLine();

			switch (opcao) {

			case 1:
				Profissional profissional = new Profissional();

	
				while (true) {
					System.out.print("Digite o nome do profissional: ");
					String nome = in.nextLine().trim();
					if (nome.isEmpty() || nome.length() < 3) {
						System.out.println("Nome inválido. Digite pelo menos 3 caracteres.");
					} else {
						profissional.setNome(nome);
						break;
					}
				}


				while (true) {
					System.out.print("Digite o CPF do profissional: ");
					String cpf = in.nextLine().trim();
					if (!cpf.matches("\\d{11}")) {
						System.out.println("CPF inválido. Deve conter 11 dígitos numéricos.");
					} else {
						profissional.setCpf(cpf);
						break;
					}
				}


				while (true) {
					System.out.print("Digite o telefone do profissional: ");
					String telefone = in.nextLine().trim();
					if (!telefone.matches("\\d{8,15}")) {
						System.out.println("Telefone inválido. Use apenas números (8 a 15 dígitos).");
					} else {
						profissional.setTelefone(telefone);
						break;
					}
				}


				while (true) {
					System.out.print("Digite a especialidade do profissional: ");
					String esp = in.nextLine().trim();
					if (esp.isEmpty()) {
						System.out.println("Especialidade não pode ser vazia.");
					} else {
						profissional.setEspecialidade(esp);
						break;
					}
				}


				while (true) {
					System.out.print("Digite o número do conselho do profissional: ");
					String conselho = in.nextLine().trim();
					if (!conselho.matches("\\w{3,15}")) {
						System.out.println("Número de conselho inválido (mínimo 3 caracteres, sem espaços).");
					} else {
						profissional.setNum_conselho(conselho);
						break;
					}
				}

				while (true) {
					System.out.print("Digite a quantidade de consultas realizadas: ");
					if (!in.hasNextInt()) {
						System.out.println("Digite um número inteiro válido.");
						in.next(); 
						continue;
					}
					int qtd = in.nextInt();
					in.nextLine();
					if (qtd < 0) {
						System.out.println("A quantidade não pode ser negativa.");
					} else {
						profissional.setQtd_atendimentos(qtd);
						break;
					}
				}

				while (true) {
					System.out.print("Digite o valor da consulta (R$): ");
					if (!in.hasNextDouble()) {
						System.out.println("Digite um valor numérico válido.");
						in.next();
						continue;
					}
					double valor = in.nextDouble();
					in.nextLine();
					if (valor <= 0) {
						System.out.println("O valor deve ser maior que zero.");
					} else {
						profissional.setValor_consulta(valor);
						break;
					}
				}
				
				while (true) {
					System.out.print("Digite a porcentagem do repasse em porcentagem (ex: 20,3): ");
					if (!in.hasNextDouble()) {
						System.out.println("Digite um valor numérico válido.");
						in.next();
						continue;
					}
					double valor = in.nextDouble();
					in.nextLine();
					if (valor <= 0 || valor > 100) {
						System.out.println("O valor deve ser maior que zero e menor que cem.");
					} else {
						profissional.setPorcentagem_repasse(valor);
						break;
					}
				}

				System.out.println("\nCadastro concluído com sucesso!");
				profissional.imprimirDados();
				break;

			case 2:
				System.out.println("Encerrando o sistema...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}

		} while (opcao != 2);

		System.out.println("Fechando...");
		in.close();
	}
}
