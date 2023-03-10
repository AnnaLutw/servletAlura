package br.com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa");
		String nomeEmpresa =req.getParameter("nome");
		String dataEmpresa =req.getParameter("data");

		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
			dataAbertura = sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		
		resp.sendRedirect("listaEmpresas");
		
		//CHAMAR JSP		
//		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
//		req.setAttribute("empresa", empresa.getNome());
//		rd.forward(req, resp);
		
	}

}
