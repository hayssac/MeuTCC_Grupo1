package br.ifrn.meutcc.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.ifrn.meutcc.modelo.Orientador;
import br.ifrn.meutcc.modelo.Tema;

public class OrientadorDAOMySQL implements OrientadorDAO {

	private static OrientadorDAOMySQL instancia = null;
	private ConexaoMySQL conexao;
	
	private OrientadorDAOMySQL() {
		super();
		conexao = new ConexaoMySQL();
	}
	
	public static OrientadorDAO getInstancia() {
		if (instancia == null) {
			instancia = new OrientadorDAOMySQL();
		}
		return instancia;
	}
	
	public Orientador getOrientadorPorTema(int idTema) {
		Connection conn = conexao.getConexaoBD();
		if (conn != null) {
			try {
				Statement stListaOrientador = conn.createStatement();
				ResultSet rsOrientador = stListaOrientador.executeQuery("select orientador.* from orientador join tema on(tema.idOrientador = orientador.id) where tema.id = "+idTema);
				Orientador orientador = null;
				if (rsOrientador.next()) {
					orientador = new Orientador();
					orientador.setId(rsOrientador.getInt("id"));
					orientador.setNome(rsOrientador.getString("nome"));		
				}
				return orientador;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public String inserir(Tema tema){
		String retorno = "falha";
		int idOrientador = 3;
		Connection conn = conexao.getConexaoBD();
		if(conn != null){
			
			if(Orientador.contador > 0){
				try {
					Statement stmt = conn.createStatement();
					stmt.execute("insert into tema (titulo, descricao, idCurso, idOrientador) "
							+ "values ('"+tema.getTitulo()+"', '"+tema.getDescricao()+"', '"+tema.getidCurso()+"', '"+idOrientador+"')");
					retorno = "sucesso";
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			Orientador.contador --;
			System.out.println(Orientador.contador);
		}
		
		return retorno;
	}
	

	
	
}
