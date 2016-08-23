package br.ifrn.meutcc.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.ifrn.meutcc.modelo.Aluno;

public class AlunoDAOMySQL implements AlunoDAO {
	
	private static AlunoDAOMySQL instancia = null;
	private ConexaoMySQL conexao;
	
	private AlunoDAOMySQL() {
		super();
		conexao = new ConexaoMySQL();
	}

	public static AlunoDAO getInstancia() {
		if (instancia == null) {
			instancia = new AlunoDAOMySQL();
		}
		return instancia;
	}

	public boolean addCandidato(int idTema, int idCandidato){
		Aluno aluno = new Aluno();
		Connection conn = conexao.getConexaoBD();
		boolean result = false;
		
		if (conn != null) {
			String updateTable = "update aluno set idTema = "+idTema+" where situacao != 0 and id = "+idCandidato;
			try {
				Statement stAluno = conn.createStatement();
				int rsAluno = stAluno.executeUpdate(updateTable);
				
				if(rsAluno != 0){
					result = true;
					aluno.setStatus(result);
				} else {
					result = false;
				}
				System.out.println("Atualizado!");
				return result;
			} catch (SQLException e) {
				System.out.println("Nao deu certo!");
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int countCandidatos(int idTema) {
		Connection conn = conexao.getConexaoBD();
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
	
	
	
}
