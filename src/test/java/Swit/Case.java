package Swit;

import java.util.Scanner;

public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String companhia = "Flash Turismo";
		System.out.println("Bem vindo à companhia " + companhia);
		System.out.println("Estamos com promoções nas seguintes passagens:");
		System.out.println("Londres, Munique, Las Vegas, Toronto, New York, Manaus");
		System.out.println("Qual dos destinos você deseja conhecer?");

		double passagemInternacional = 4000.00;
		double passagemNacional = 1500.00;

		String lugar = scanner.next();

		switch (lugar) {
		case "Londres":
		case "Munique":
		case "LasVegas":
		case "Toronto":
		case "NewYork":
			System.out.println("Essa passagem internacional custa " + passagemInternacional + " R$, escolha uma passagem em qualquer data desse mês");
			break;
		case "Manaus":
			System.out.println("Essa passagem nacional custa " + passagemNacional + " R$, escolha uma passagem em qualquer data desse mês");
			break;
		default:
			System.out.println("Infelizmente não possuímos passagem para esse destino");
			return;
		}

		scanner.nextLine();

		System.out.println("Informe a data desejada (no formato dd/mm/aaaa):");
		String data = scanner.nextLine();

		switch (data) {
		case "01/04/2024":
		case "02/04/2024":
		case "03/04/2024":
		case "04/04/2024":
		case "05/04/2024":
		case "06/04/2024":
		case "07/04/2024":
		case "08/04/2024":
		case "09/04/2024":
		case "10/04/2024":
		case "11/04/2024":
		case "12/04/2024":
		case "13/04/2024":
		case "14/04/2024":
		case "15/04/2024":
		case "16/04/2024":
		case "17/04/2024":
		case "18/04/2024":
		case "19/04/2024":
		case "20/04/2024":
		case "21/04/2024":
		case "22/04/2024":
		case "23/04/2024":
		case "24/04/2024":
		case "25/04/2024":
		case "26/04/2024":
		case "27/04/2024":
		case "28/04/2024":
		case "29/04/2024":
		case "30/04/2024":
			System.out.println("Certo, vamos ao pagamento");
			break;
		default:
			System.out.println("Não temos essa data disponível");
			return;
		}

		System.out.println("No momento só estamos aceitando cartões de crédito, deseja continuar com a compra?");
		String resposta = scanner.nextLine();

		if (resposta.equals("sim")) {
			System.out.println("Certo, o pagamento vai ser à vista ou parcelado?");
			String resposta1 = scanner.nextLine();
			switch (resposta1) {
			case "avista":
				System.out.println("Certo, insira seu cartão para o pagamento...");
				System.out.println("Pagamento realizado com sucesso");
				System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
				break;
			case "parcelado":
				System.out.println("Em quantas vezes você deseja parcelar, no momento dividimos em até 10x");
				System.out.println("Digite a quantidade de parcelas");

				if (lugar.equals("Manaus")) {
					String resposta2 = scanner.nextLine();
					switch (resposta2) {
					case "2":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 2 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "3":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 3 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "4":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 4 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "5":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 5 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "6":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 6 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "7":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 7 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "8":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 8 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "9":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 9 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "10":
						System.out.println("Sua parcela fica no valor de " + passagemNacional / 10 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");

						break;


					default:
						System.out.println("Não possuo essa quantidade de parcelamento");
						break;
					}
				} else {
					String resposta3 = scanner.nextLine();
					switch (resposta3) {
					case "2":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 2 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "3":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 3 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "4":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 4 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "5":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 5 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "6":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 6 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "7":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 7 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "8":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 8 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "9":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 9 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					case "10":
						System.out.println("Sua parcela fica no valor de " + passagemInternacional / 10 + "R$");
						System.out.println("Nosso aeroporto de embarque é somente no Galeão no Rio de Janeiro");
						break;
					default:
						System.out.println("Não possuo essa quantidade de parcelamento");
						break;
					}
				}
				break;
			default:
				System.out.println("Não temos essa opção");
				break;
			}
		} else {
			System.out.println("Você não escolheu nenhuma das opções acima");
		}



	}
}
