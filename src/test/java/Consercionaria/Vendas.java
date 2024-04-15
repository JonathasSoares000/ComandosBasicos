package Consercionaria;

import java.util.Scanner;

public class Vendas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);
		// Agência de compra de veículos online
		String agencia = "Albuquerque Multimarcas";
		String marca1 = "Hyunday";
		String marca2 = "Chevrolet";
		double valorDocumento = 150000.00;
		System.out.println("Seja bem vindo a " + agencia);
		System.out.println("Estamos com carros da " + marca1 + " e também da " + marca2 + " no nosso estoque");
		System.out.println("Para que possamos dar prosseguimento preciso que o senhor(a) me forneça alguns dados para análise.");
		System.out.println("No momento precisaremos do seu Nome completo, Rg, Cpf, telefone, endreço, salário, score e o nome da empresa onde você trebalha.");

		System.out.println("Digite seu nome completo:");
		String nomeCompleto = b.nextLine();
		System.out.println("Digite seu rg");
		String rg = scanner.next();
		if (rg.length()== 7) {
			System.out.println("Rg está igual ao banco de dados, vamos para o próximo passo...");
			System.out.println("Digite seu cpf");
			String cpf = scanner.next();
			if (cpf.length()== 11) {
				System.out.println("Seu Cpf está coreto, vamos para o próximo passo...");
				System.out.println("Digite seu telefone com DDD");
				String telefone = scanner.next();
				if (telefone.length() == 11) {
					System.out.println("Obrigado pela informação, vamos seguir...");
					System.out.println("Digite seu endreço");
					String endereco = a.nextLine();
					System.out.println("Digite seu salário");
					double salario = scanner.nextDouble();
					if (salario >= 1000) {
						System.out.println("Com esse salário você poderá adquirir um dos nossos veículos");
						System.out.println("Digite seu score");
						int score = scanner.nextInt();
						if (score >= 500 && score <= 1000) {
							System.out.println("Você possui um score sufiente para aquisição do veículo");
							System.out.println("Digite o nome da empresa que você trabalha");
							String nomeEmpresa = a.nextLine();

							System.out.println("Seus dados estão corretos, parcelamos nossos carros em até 60x");
							System.out.println("Qual marca o senhor(a) deseja ?");
						} else {
							System.out.println("Com esse score não conseguimos fazer sua aprovação");
						}
					} else {
						System.out.println("Infelizmente com seu salário atual você não consegue financiar um dos nossos veículos");
					}
				} else {
					System.out.println("Precisamos de um telefone válido com DDD");
				}
			} else {
				System.out.println("Cpf está incorreto");
			}
		} else {
			System.out.println("Seu Rg está incorreto.");
		}

		double hyundayValor = 60000.00;
		double chevroletValor = 30000.00;
		double valorHyundayDocumentoTotal = 210000.00;
		double valorChevroletDocumentoTotal = 90000.00;
		String marca = scanner.next();
		switch (marca) {
		case "Hyunday":
			System.out.println("O valor de veículo custa " + hyundayValor + "R$, o cliente também paga o documento do carro que esstá no valor de " + valorDocumento + "RS");
			System.out.println("O valor final fica " + (hyundayValor + valorDocumento) + "R$");
			System.out.println("Em quantas parcelas o senhor(a) deseja?");
			int numParcelas = scanner.nextInt();
			if (numParcelas >= 1 && numParcelas <= 60) {
				double valorParcela = (valorHyundayDocumentoTotal) / numParcelas;
				System.out.println("O valor de cada parcela fica " + valorParcela + "R$");
				System.out.println("Obrigado pela compra, seu veículo chegará ao senhor(a) em até 5 dias úteis.");
			} else {
				System.out.println("Número de parcelas inválido. Por favor, escolha entre 1 e 60.");
			}
			break;
		case "Chevrolet":
			System.out.println("O valor de veículo custa " + chevroletValor + "R$, o cliente também paga o documento do carro que esstá no valor de " + valorDocumento + "RS");
			System.out.println("O valor final fica " + (chevroletValor + valorDocumento) + "R$");
			System.out.println("Em quantas parcelas o senhor(a) deseja?");
			int numParcelas2 = scanner.nextInt();
			if (numParcelas2 >= 1 && numParcelas2 <= 60) {
				double valorParcela2 = (valorChevroletDocumentoTotal) / numParcelas2;
				System.out.println("O valor de cada parcela fica " + valorParcela2 + "R$");
				System.out.println("Obrigado pela compra, seu veículo chegará ao senhor(a) em até 5 dias úteis.");


			} else {
				System.out.println("Número de parcelas inválido. Por favor, escolha entre 1 e 60.");
			}
			break;
		default:
			System.out.println("Não foi possível concluir a venda do veículo, tente novamente.");
			break;
		}
	}
}