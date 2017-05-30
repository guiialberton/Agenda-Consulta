package gerenciador;

import java.util.Collection;

import gerenciador.dados.ProdutosDados;

public class Teste {
	public static void main(){
		ProdutosDados dados=new ProdutosDados();
		Collection<Produto> lista= dados.busca("*");
		for (Produto produto: lista) {
			System.out.println(produto);
		}
	}
}
