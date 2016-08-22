package br.ifrn.meutcc.persistencia;

import br.ifrn.meutcc.modelo.Orientador;
import br.ifrn.meutcc.modelo.Tema;

public interface OrientadorDAO {	
	public Orientador getOrientadorPorTema(int idTema);
	public String inserir(Tema tema);
}
