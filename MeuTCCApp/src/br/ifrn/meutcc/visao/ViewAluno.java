package br.ifrn.meutcc.visao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.meutcc.modelo.Aluno;

@WebServlet("/ViewAluno")
public class ViewAluno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewAluno() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int idCandidato = 2; //No banco de Hayssa
		int idTema = -1;
		try {
			idTema = Integer.parseInt(id);
		} catch (NumberFormatException nfex) {
			nfex.printStackTrace();
		}
		Aluno logic = new Aluno();
		boolean aluno = logic.addCandidato(idTema, idCandidato);
		request.setAttribute("aluno", aluno);
		request.getRequestDispatcher("viewAluno.jsp").forward(request, response);
	}

}
