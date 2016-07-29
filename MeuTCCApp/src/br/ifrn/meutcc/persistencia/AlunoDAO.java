package br.ifrn.meutcc.persistencia;

public interface AlunoDAO {
	
	public boolean addCandidato(int idTema, int idCandidato);	
	public int countCandidatos(int idTema);
	
}
