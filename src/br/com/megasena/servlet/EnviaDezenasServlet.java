package br.com.megasena.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.megasena.model.Dezenas;
import br.com.megasena.model.Volante;

/*
 * http://localhost:8080/megasena/EnviaDezenas
 */


@WebServlet("/EnviaDezenas")
public class EnviaDezenasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Volante v = new Volante();
		List<Integer> volante = v.getVolante(60);
		
		Dezenas dezenas = new Dezenas();
		List<Integer> dezenasSorteadas = dezenas.getDezenas();
		
		
		request.setAttribute("dvolante", volante);
		request.setAttribute("dezenas", dezenasSorteadas);
		
		RequestDispatcher rd = request.getRequestDispatcher("/");
		rd.forward(request, response);
	}

}
