package br.ifrn.meutcc.modelo;

import br.ifrn.meutcc.persistencia.FabricaDAO;
import br.ifrn.meutcc.persistencia.OrientadorDAO;

public class Orientador {
	private int id;
	private String nome;
	private OrientadorDAO dao;
	public static int contador = 5;
	
	public Orientador(){
		super();
		dao = FabricaDAO.getInstancia("mysql").createOrientadorDAO();
	}
	
	public void setContador(int value){
		contador=value;
	}
	public int getContador(){
		return contador;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Orientador getOrientadorPorTema(int idTema) {
		return dao.getOrientadorPorTema(idTema);
	}

	public String inserir(Tema tema) {
		return dao.inserir(tema);
	}

}
