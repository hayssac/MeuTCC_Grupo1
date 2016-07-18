package br.ifrn.meutcc.modelo;

import br.ifrn.meutcc.persistencia.AlunoDAO;

public class Aluno {
	private AlunoDAO dao;
	
	public Aluno() {
		super();
		dao = new AlunoDAO();
	}
	
	public boolean addCandidato(int idTema, int idCandidato){
		return dao.addCandidato(idTema, idCandidato);
	}

	public int countCandidatos(int idTema) {
		return dao.countCandidatos(idTema);
	}

}
