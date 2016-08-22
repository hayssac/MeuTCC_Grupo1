package br.ifrn.meutcc.visao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.ifrn.meutcc.modelo.Orientador;
import br.ifrn.meutcc.modelo.Tema;

@WebServlet("/InserirTema")
public class InserirTema extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InserirTema() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String titulo = request.getParameter("titulo");
		String descricao = request.getParameter("descricao");
		int idCurso = Integer.parseInt(request.getParameter("idCurso"));
		//int idOrientador = Integer.parseInt(request.getParameter("idOrientador"));
		
		Tema tema = new Tema();
		tema.setTitulo(titulo);
		tema.setDescricao(descricao);
		tema.setidCurso(idCurso);
		//tema.setidOrientador(idOrientador);
		
		Orientador orientador = new Orientador();
		String retorno = orientador.inserir(tema);
		if(retorno.equals("sucesso")){
			response.sendRedirect("ListTemas");
		} else {
			PrintWriter out = response.getWriter();
			out.println("<html>");
			out.println("<h3>N�o foi possivel inserir o Tema!</h3>");
			out.println("<a href='ListTemas'>Voltar</a>");
			out.println("</html>");
		}	

		
	}

}
