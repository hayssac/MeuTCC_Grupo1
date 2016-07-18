package br.ifrn.meutcc.visao;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.meutcc.logica.OrientadorLogic;
import br.ifrn.meutcc.modelo.Orientador;

@WebServlet("/ViewOrientadorTema")
public class ViewOrientadorTema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewOrientadorTema() {
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
		OrientadorLogic logic = new OrientadorLogic();
		Orientador orientador = logic.getOrientadorPorTema(idTema);
		request.setAttribute("orientador", orientador);
		request.getRequestDispatcher("viewOrientador.jsp").forward(request, response);
	}

}
