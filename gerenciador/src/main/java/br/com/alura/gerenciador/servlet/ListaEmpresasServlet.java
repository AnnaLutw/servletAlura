package br.com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		//CHAMAR JSP
		req.setAttribute("empresas", lista);	
		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas.jsp");			
		rd.forward(req, resp);
		
	}

}
