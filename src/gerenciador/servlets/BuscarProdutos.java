package gerenciador.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerenciador.dados.ProdutosDados;
import gerenciador.Produto;

@WebServlet(urlPatterns="/busca")
public class BuscarProdutos extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		respondeRequisicao(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		respondeRequisicao(req,resp);
	}
	protected void respondeRequisicao(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome=req.getParameter("nome");
		ProdutosDados dados=new ProdutosDados();
		Collection<Produto> lista=dados.busca(nome);
		req.setAttribute("listaProdutos", lista);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("buscaProduto.jsp");
		dispatcher.forward(req,resp);
	}
}
/*
		PrintWriter writer= resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("Resultado da busca: <br/>");

for(Produto produto:lista){

*
*
*
*
writer.printf("<li>%s (%.2f)", produto.getNome(), produto.getPreco());
writer.println("</ul>");
writer.println("</html>");
writer.println("</body>");*/