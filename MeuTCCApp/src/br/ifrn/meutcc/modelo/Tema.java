package br.ifrn.meutcc.modelo;

import java.util.List;

import br.ifrn.meutcc.persistencia.FabricaDAO;
import br.ifrn.meutcc.persistencia.TemaDAO;

public class Tema {
	private int id;
	private String titulo;
	private String descricao;
	private int idCurso;
	private int idOrientador;
	private String nomeOrientador;
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
	public int getidCurso() {
		return idCurso;
	}
	public void setidCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public int getidOrientador() {
		return idOrientador;
	}
	public void setidOrientador(int idOrientador) {
		this.idOrientador = idOrientador;
	}
	public void setNomeOrientador(String nomeOrientador) {
		this.nomeOrientador = nomeOrientador;
	}
	public String getNomeOrientador(){
		return nomeOrientador;
	}
	public List<Tema> listTemas(int idCurso) {
		return dao.listTemas(idCurso);
	}
	public Tema getTema(int idTema) {
		return dao.getTema(idTema);
	}

}
