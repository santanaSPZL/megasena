<%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page
	import="java.util.List, br.com.megasena.servlet.EnviaDezenasServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Volante 1</h2>
	<table>
		<tr>	
        <%
        List<Integer> volante = (List<Integer>)request.getAttribute("dvolante");
		List<Integer> dezena = (List<Integer>)request.getAttribute("dezenas");
		
        for(int i = 0; i < volante.size(); i++) {
        	boolean controle = false;
        	int j = 0;
        	while(j <= 5) {
        		if(volante.get(i) == dezena.get(j)) {
        %>		
        			<td bgcolor=#0000FF>volante.get(i)</td>
        <%
        			controle = true;
					break;
				}      			
				j++; 		
			}

			if(!controle) {
        %>
				<td>volante.get(i)</td>
		<%
			}
		%>
		<%    
        	if(i % 10 == 9) {
		%>
				</tr>
		<%
        	}
        }
		%>
				

		</tr>
	</table>
</body>
</html>