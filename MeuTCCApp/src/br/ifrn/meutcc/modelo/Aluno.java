package br.ifrn.meutcc.modelo;

import br.ifrn.meutcc.persistencia.AlunoDAO;
import br.ifrn.meutcc.persistencia.FabricaDAO;

public class Aluno {
	private AlunoDAO dao;
	
	public Aluno() {
		super();
		dao = FabricaDAO.getInstancia("mysql").createAlunoDAO();
	}
	
	public boolean addCandidato(int idTema, int idCandidato){
		return dao.addCandidato(idTema, idCandidato);
	}

	public int countCandidatos(int idTema) {
		return dao.countCandidatos(idTema);
	}

}
