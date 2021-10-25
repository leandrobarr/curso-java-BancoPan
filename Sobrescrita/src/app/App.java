package app;

public class App {
	public static void main(String[] args) {

		Atleta atleta1 = new Atleta();
		atleta1.setValorPatrocicio(1000);
		Corredor corredor1 = new Corredor();
		corredor1.setValorPatrocicio(1000);

		int taxa = 15;
		atleta1.atualizarValor(taxa);
		corredor1.setValorPatrocicio(taxa);

		System.out.println("Novo salário de atleta " + atleta1.getValorPatrocicio());
		System.out.println("Novo salário do corredor " + corredor1.getValorPatrocicio());

	}

}
