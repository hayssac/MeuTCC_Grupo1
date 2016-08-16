package br.ifrn.meutcc.modelo;

import java.util.List;

import br.ifrn.meutcc.persistencia.FabricaDAO;
import br.ifrn.meutcc.persistencia.TemaDAO;

public class Tema {
	private int id;
	private String titulo;
	private String descricao;
//	private int idCurso;
//	private int idOrientador;
	private TemaDAO dao;

	public Tema() {
		super();
		dao = FabricaDAO.getInstancia("mysql").createTemaDAO();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	//inseridos ap�s cadastro do Tema
//	public void setCurso(int idCurso) {
//		this.idCurso = idCurso;
//	}
//	public void setOrientador (int idOrientador) {
//		this.idOrientador = idOrientador;
//	}
	//
	public List<Tema> listTemas(int idCurso) {
		return dao.listTemas(idCurso);
	}
	public Tema getTema(int idTema) {
		return dao.getTema(idTema);
	}
}
