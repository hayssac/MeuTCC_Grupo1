package br.ifrn.meutcc.persistencia;

public abstract class FabricaDAO {
	
	public abstract TemaDAO createTemaDAO();
	public abstract AlunoDAO createAlunoDAO();
	public abstract OrientadorDAO createOrientadorDAO();
	
	public static FabricaDAO getInstancia(String banco) {
		switch (banco) {
			case "mysql":
				return FabricaMySQL.getInstancia();
		}
		return null;
	}
}
