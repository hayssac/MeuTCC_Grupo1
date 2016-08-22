package br.ifrn.meutcc.visao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.meutcc.modelo.Aluno;

@WebServlet("/ViewTemaCandidaturas")
public class ViewTemaCandidaturas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewTemaCandidaturas() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		int idTema = -1;
		try {
			idTema = Integer.parseInt(id);
		} catch (NumberFormatException nfex) {
			nfex.printStackTrace();
		}
		Aluno logic = new Aluno();
		int aluno = logic.countCandidatos(idTema);
		request.setAttribute("aluno", aluno);
		request.getRequestDispatcher("viewCandidaturas.jsp").forward(request, response);
	}

}
