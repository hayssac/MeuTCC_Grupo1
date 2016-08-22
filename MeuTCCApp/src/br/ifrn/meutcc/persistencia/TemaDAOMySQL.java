package br.ifrn.meutcc.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.ifrn.meutcc.modelo.Tema;

public class TemaDAOMySQL implements TemaDAO {

	private static TemaDAOMySQL instancia = null;
	private ConexaoMySQL conexao;
	
	private TemaDAOMySQL() {
		super();
		conexao = new ConexaoMySQL();
	}

	public static TemaDAO getInstancia() {
		if (instancia == null) {
			instancia = new TemaDAOMySQL();
		}
		return instancia;
	}
	
	public List<Tema> listTemas(int idCurso) {
		Connection conn = conexao.getConexaoBD();
		if (conn != null) {
			try {
				Statement stListaTema = conn.createStatement();
				ResultSet rsTemas = stListaTema.executeQuery("SELECT * FROM tema as t INNER JOIN orientador as o ON t.idOrientador = o.id AND t.idCurso ="+idCurso);
				List<Tema> temas = new ArrayList<Tema>();
				while (rsTemas.next()) {
					Tema tema = new Tema();
					tema.setId(rsTemas.getInt("id"));
					tema.setTitulo(rsTemas.getString("titulo"));
					tema.setDescricao(rsTemas.getString("descricao"));
					tema.setNomeOrientador(rsTemas.getString("nome"));
					temas.add(tema);
				}
				return temas;
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		return null;
	}
	
	public Tema getTema(int idTema) {
		Connection conn = conexao.getConexaoBD();
		if (conn != null) {
			try {
				Statement stListaTema = conn.createStatement();
				ResultSet rsTemas = stListaTema.executeQuery("SELECT * FROM Tema as t WHERE t.id = "+idTema);
				Tema tema = null;
				if (rsTemas.next()) {
					tema = new Tema();
					tema.setId(rsTemas.getInt("id"));
					tema.setTitulo(rsTemas.getString("titulo"));
					tema.setDescricao(rsTemas.getString("descricao"));
					tema.setidOrientador(rsTemas.getInt("idOrientador"));
				}
				return tema;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void addTema(Tema tema){
		Connection conn = conexao.getConexaoBD();
		int status;
		
		if (conn != null) {		
	        try {
	            PreparedStatement preparedStatement = conn.prepareStatement("insert into tema(titulo,descricao,idCurso,idOrientador) values (?, ?, ?, ? )");
	            // Parameters start with 1
	            preparedStatement.setString(1, tema.getTitulo());
	            preparedStatement.setString(2, tema.getDescricao());
	            preparedStatement.setInt(3, tema.getidCurso());
	            preparedStatement.setInt(4, tema.getidOrientador());
	            
	            status = preparedStatement.executeUpdate();
				if(status != 0){
					System.out.println("Ok");
				} else {
					System.out.println("Nao");
				}

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		}

	}

}
