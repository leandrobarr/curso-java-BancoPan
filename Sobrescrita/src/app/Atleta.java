package app;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {

	// Atributos
	private int codigo;
	private String nome;
	private String esporte;
	private double ValorPatrocicio;
	// private int teste;

	public int getCodigo() {
		return codigo;
	}

	// get e set
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEsporte() {
		return esporte;
	}

	public void setEsporte(String esporte) {
		this.esporte = esporte;
	}

	public double getValorPatrocicio() {
		return ValorPatrocicio;
	}

	public void setValorPatrocicio(double valorPatrocicio) {
		ValorPatrocicio = valorPatrocicio;
	}

	// public String getTeste() {
	// return teste;
	// }

	// public void setTeste(String teste) {
	// this.teste = teste;
	// }

	public void inserirdados() {
		// this.teste=JOptionPane.showConfirmDialog(null, "sgsg");
		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		this.nome = JOptionPane.showInputDialog("Digite o nome");
		this.esporte = JOptionPane.showInputDialog("Digite o esporte praticado");
		this.ValorPatrocicio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		String mensagem = "Objeto atleta criado a partir da classe Atleta";
		mensagem += "\n Codigo" + this.codigo;
		mensagem += "\n Nome" + this.nome;
		mensagem += "\n Esporte" + this.esporte;
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();
		mensagem += "\n valor de patrocínio: " + formatar.format(this.ValorPatrocicio);
		JOptionPane.showMessageDialog(null, mensagem);

	}

	public double atualizarValor(double taxa) {
		this.ValorPatrocicio = this.ValorPatrocicio + taxa;
		return this.ValorPatrocicio;
	}

}
