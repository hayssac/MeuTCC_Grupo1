package br.ifrn.meutcc.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AlunoDAO {
	private static final String MySQLDriver = "com.mysql.jdbc.Driver";
	private Connection conn = null;
	
	public AlunoDAO() {
		super();
	}
	
	public boolean addCandidato(int idTema, int idCandidato){
		verificaConexao();
		boolean result = false;
		
		if (conn != null) {
			String updateTable = "update aluno set idTema = "+idTema+" where situacao != 0 and id = "+idCandidato;
			try {
				Statement stAluno = conn.createStatement();
				int rsAluno = stAluno.executeUpdate(updateTable);
				
				if(rsAluno != 0){
					result = true;
					System.out.println("Atualizado!");
				} else {
					result = false;
					System.out.println("Nada mudou!");
				}
				return result;
			} catch (SQLException e) {
				System.out.println("Nao deu certo!");
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int countCandidatos(int idTema) {
		verificaConexao();
		int qtd = 0;
		if (conn != null) {
			try {
				Statement stListaTema = conn.createStatement();
				ResultSet rsTemas = stListaTema.executeQuery("select count(*) as qtd from aluno where idTema = "+idTema+" group by idTema");
				if (rsTemas.next()) {		
					qtd = rsTemas.getInt("qtd");
				}
				return qtd;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return qtd;
	}
	
	private void verificaConexao() {
		String 	url = "jdbc:mysql://localhost:3306/meutcc",
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
