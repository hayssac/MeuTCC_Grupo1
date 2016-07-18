package br.ifrn.meutcc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.ifrn.meutcc.modelo.Orientador;

public class OrientadorDAO {
	
	private static final String MySQLDriver = "com.mysql.jdbc.Driver";
	private Connection conn = null;
	
	public OrientadorDAO() {
		super();
	}
	
	public Orientador getOrientadorPorTema(int idTema) {
		verificaConexao();
		if (conn != null) {
			try {
				Statement stListaOrientador = conn.createStatement();
				ResultSet rsOrientador = stListaOrientador.executeQuery("select * from orientador where idTema = "+idTema);
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
	
	private void verificaConexao() {
		String 	url = "jdbc:mysql://localhost/meutcc",
				nome = "root",
				senha = "root";
		if (conn != null) {
			return;
		}
		try {
			Class.forName(MySQLDriver);
			conn = DriverManager.getConnection(url, nome, senha);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
