package gerenciador.dados;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import gerenciador.Produto;

public class ProdutosDados {
	private static Map<Integer,Produto> PRODUTOS = new HashMap<>();
	static{
		gera_id_adiciona("Mouse Microsoft", 79.00);
		gera_id_adiciona("Teclado Logitech", 110.00);
		gera_id_adiciona("Fone de ouvido Philips", 79.00);
	}
	
	public static void gera_id_adiciona(String nome, Double preco){
		int id = PRODUTOS.size()+1;
		PRODUTOS.put(id, new Produto(id, nome, preco));
	}
	
	public Collection<Produto> busca(String texto){
		if(texto.equals("*")){
			return PRODUTOS.values();
		}
		List<Produto> lista=new ArrayList<>();
		for (Produto produto : PRODUTOS.values()) {
			if(produto.getNome().toLowerCase().contains(texto.toLowerCase())){
				lista.add(produto);
			}
		}
		
		return lista;
	}
}
