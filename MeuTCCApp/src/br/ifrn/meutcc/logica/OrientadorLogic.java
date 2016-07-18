package br.ifrn.meutcc.logica;

import br.ifrn.meutcc.modelo.Orientador;

public class OrientadorLogic {
	private Orientador orientador;
	
	public OrientadorLogic() {
		orientador = new Orientador();
	}

	public Orientador getOrientadorPorTema(int idTema) {
		return orientador.getOrientadorPorTema(idTema);
	}
}
