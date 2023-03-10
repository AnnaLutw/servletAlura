package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>(); 
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("insta");
		Empresa empresa2 = new Empresa();
		empresa2.setNome("alura");
		lista.add(empresa2);
		lista.add(empresa);
	}
	
	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
}
