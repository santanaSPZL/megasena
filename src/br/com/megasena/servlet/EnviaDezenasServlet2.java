package br.com.megasena.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.megasena.model.Dezenas;
import br.com.megasena.model.Volante;

/*
 * http://localhost:8080/megasena/EnviaDezenas2
 */

@WebServlet("/EnviaDezenas2")
public class EnviaDezenasServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Volante v = new Volante();
		List<Integer> volante = v.getVolante(60);
		
		Dezenas dezenas = new Dezenas();
		List<Integer> dezenasSorteadas = dezenas.getDezenas();
		
		Dezenas dezenas2 = new Dezenas();
		List<Integer> dezenasSorteadas2 = dezenas2.getDezenas();
		
		Dezenas dezenas3 = new Dezenas();
		List<Integer> dezenasSorteadas3 = dezenas3.getDezenas();
		
		PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Volante 1</h2>");
        out.println("<table>");
        out.println("</tr>");
        out.println("<tr>");
        for(int i = 0; i < volante.size(); i++) {
        	boolean controle = false;
        	int j = 0;
        	while(j <= 5) {
        		if(volante.get(i) == dezenasSorteadas.get(j)) {
        			out.println("<td  bgcolor=#0000FF>" + volante.get(i) + "</td>");
        			controle = true;
        			break;
        		}      			
        		j++; 		
        	}
        	
        	if(!controle) {
        		out.println("<td>" + volante.get(i) + "</td>");
        	}
        
        	if(i % 10 == 9) {
        		out.println("</tr>");
        	}
        }
        out.println("</tr>");
        out.println("</table>");
        out.println("</body></html>");
        
// *******************************************************************************************************
        
        out.println("<html><body>");
        out.println("<h2>Volante 2</h2>");
        out.println("<table>");
        out.println("</tr>");
        out.println("<tr>");
        for(int i = 0; i < volante.size(); i++) {
        	boolean controle = false;
        	int j = 0;
        	while(j <= 5) {
        		if(volante.get(i) == dezenasSorteadas2.get(j)) {
        			out.println("<td  bgcolor=#0000FF>" + volante.get(i) + "</td>");
        			controle = true;
        			break;
        		}      			
        		j++; 		
        	}
        	
        	if(!controle) {
        		out.println("<td>" + volante.get(i) + "</td>");
        	}
        
        	if(i % 10 == 9) {
        		out.println("</tr>");
        	}
        }
        out.println("</tr>");
        out.println("</table>");
        out.println("</body></html>");
        
// *******************************************************************************************************
        
        out.println("<html><body>");
        out.println("<h2>Volante 3</h2>");
        out.println("<table>");
        out.println("</tr>");
        out.println("<tr>");
        for(int i = 0; i < volante.size(); i++) {
        	boolean controle = false;
        	int j = 0;
        	while(j <= 5) {
        		if(volante.get(i) == dezenasSorteadas3.get(j)) {
        			out.println("<td  bgcolor=#0000FF>" + volante.get(i) + "</td>");
        			controle = true;
        			break;
        		}      			
        		j++; 		
        	}
        	
        	if(!controle) {
        		out.println("<td>" + volante.get(i) + "</td>");
        	}
        
        	if(i % 10 == 9) {
        		out.println("</tr>");
        	}
        }
        out.println("</tr>");
        out.println("</table>");
        out.println("</body></html>");
	}

}
