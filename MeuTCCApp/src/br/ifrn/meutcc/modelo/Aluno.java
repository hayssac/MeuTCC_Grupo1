package br.ifrn.meutcc.modelo;

import java.util.HashSet;
import java.util.Set;

import br.ifrn.meutcc.persistencia.AlunoDAO;
import br.ifrn.meutcc.persistencia.FabricaDAO;

public class Aluno {
	private AlunoDAO dao;
	private static boolean status;
	private static Set<AcaoObserver> interessados = new HashSet<AcaoObserver>();

	public Aluno() {
		super();
		dao = FabricaDAO.getInstancia("mysql").createAlunoDAO();
	}

	//registra interessados
	public void registraInteressado(AcaoObserver interessado){
		interessados.add(interessado);
	}
	//cancela interesse
	public void cancelaInteresse(AcaoObserver interessado){
		interessados.remove(interessado);
	}

	public void setStatus(boolean valor) {
		status = valor;
		for(AcaoObserver interessado : interessados){
			interessado.notificaAlteracao(this);
		}
	}

	public boolean getStatus(){
		return status;
	}

	public boolean addCandidato(int idTema, int idCandidato){
		return dao.addCandidato(idTema, idCandidato);
	}

	public int countCandidatos(int idTema) {
		return dao.countCandidatos(idTema);
	}

}
