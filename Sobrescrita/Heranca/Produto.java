import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Produto {

	private int codigo;
	private double preco;
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void informar() {

		this.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código"));
		this.preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor"));
		this.descricao = JOptionPane.showInputDialog("Digite a descricao do livro");

		String mensagem = "---INFORMAÇÕES SOLICITADAS!---";
		mensagem += "\n Codigo: " + this.codigo;
		mensagem += "\n Preço R$ " + this.preco;
		mensagem += "\n Descricão: " + this.descricao;
		NumberFormat formatar = DecimalFormat.getCurrencyInstance();

		JOptionPane.showMessageDialog(null, mensagem);

	}

}
