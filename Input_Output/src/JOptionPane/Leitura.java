package JOptionPane;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Leitura {

	//MOSTROU A MENSAGEM
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Calculando Parcelas");
		// INPUT
		double ValorTotal = Double.parseDouble(JOptionPane.showInputDialog("Qual é o valor do produto?"));
		//INPUT INTEIRO
		int numParcelas = Integer.parseInt(JOptionPane.showInputDialog("Em quantas parcelas?"));
		//
		double ValorParcela = ValorTotal / numParcelas;
		NumberFormat formato = new DecimalFormat("R$ ###,#00.00");
		JOptionPane.showMessageDialog(null, "O valor de cada parcela é: " + formato.format(ValorParcela));
	}

}
