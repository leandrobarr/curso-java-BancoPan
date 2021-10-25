
public class Livro extends Produto {

	public void exibirDados() {
		
		Livro livro1 = new Livro();

		livro1.setCodigo(1);
		livro1.setPreco(37.00);
		livro1.setDescricao("tecnologia");
		System.out.println(livro1.getCodigo());
		System.out.println(livro1.getPreco());
		System.out.println(livro1.getDescricao());
	
	}
}
