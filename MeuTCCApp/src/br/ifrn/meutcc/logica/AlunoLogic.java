package br.ifrn.meutcc.logica;

import br.ifrn.meutcc.modelo.Aluno;

public class AlunoLogic {
	private Aluno aluno;
	
	public AlunoLogic() {
		aluno = new Aluno();
	}

	public boolean addCandidato(int idTema, int idCandidato) {
		return aluno.addCandidato(idTema, idCandidato);
	}

	public int countCandidatos(int idTema) {
		return aluno.countCandidatos(idTema);
	}

}
