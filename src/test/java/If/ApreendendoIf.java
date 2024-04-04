package If;

public class ApreendendoIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//< menor que
		//> maior que
		// == igual
		// || ou
		// && E
		// >= maior ou igial
		// <= menor ou igual
		// != diferente
		
		
		String banco = "Champions";
		int boleto = 400;
		int dinheironaconta = 1000;
		int saldoespecial = 500;
		int saldorestante = dinheironaconta - boleto;
		int saldofinal = dinheironaconta + saldoespecial;
		
		System.out.println("Bem vindo  ao banco " + banco);
		System.out.println("Seu saldo é de " + dinheironaconta + "R$ e você possui " + saldoespecial + "R$ de cheque especial");
		System.out.println("Você possui um boleto no valor de " + boleto + " R$, tentaremos realizar o pagamento!");
		
		if (boleto <= dinheironaconta) {
			System.out.println("Você realizou o pagamento seu saldo é de " + saldorestante + "R$");
		} else {
			System.out.println("Pagamento não efetuado, saldo insuficiente.");
		}
				
				
	}

}
