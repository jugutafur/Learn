<%@page import="java.util.Date"%>
<%@page import="pildorasInformaticas.JSP.Calculos" %>>
<html>

<body>
	<h1>En esta pagina podras evidenciar codigo Java que se puede insertar en HTML</h1>

	<h2>************************Expresiones************************</h2>
	<p>Esta es la hora del sistema =</p>
	<%=new Date()%>
	<p>Convirtiendo a mayusculas</p>
	<strong> <%=new String("Juan").toUpperCase()%></strong>
	<p>La suma de 5+7 =</p><%=5 + 7%>
	<p>10 es mayor que 100 =</p><%=10 > 100%>

	<h2>************************Scriptlets************************</h2>
	<p>En estos bloques de codigo pueden ir bubles y condicionales claramente de varias lineas</p>
	<%
		for(int i=0; i<10; i++){
			out.println("<br>Esta es una prueba # = "+i);
		}
	%>
	<h2>************************Declaraciones************************</h2>
	<p>En estos bloques de codigo pueden ir declarados variables y metodos</p>
	<%!
	
		private int resultado;
	
		public int metodoSuma(int num1, int num2){
			resultado = num1 + num2;
			return resultado;
		}
		
		public int metodoResta(int num1, int num2){
			resultado = num1 - num2;
			return resultado;
		}
		
		public int metodoMultiplicar(int num1, int num2){
			resultado = num1 * num2;
			return resultado;
		}

	%>
	<p>Resultdo de la Suma = <%= metodoSuma(8,6) %></p>
	<p>Resultdo de la Resta = <%= metodoResta(8,6) %></p>	
	<p>Resultdo de la Multiplicacion = <%= metodoMultiplicar(8,6) %></p>
	
	<h2>************************Llamar desde una clase JAVA************************</h2>
	
	<p>La suma de los tres valores es = <%= pildorasInformaticas.JSP.Calculos.metodoAdd(2, 3, 1) %></p>
	<p>La resta de los tres valores es = <%= pildorasInformaticas.JSP.Calculos.metodoRest(9, 3, 1) %></p>
	<p>La multiplicacion de los tres valores es = <%= pildorasInformaticas.JSP.Calculos.metodoMultiplication(2, 3, 4) %></p>
	
	<p>lo anterior se puede hacer de mejor con import </p>
	<p>La suma de los tres valores es = <%= Calculos.metodoAdd(2, 3, 1) %></p>
	<p>La resta de los tres valores es = <%= Calculos.metodoRest(9, 3, 1) %></p>
	<p>La multiplicacion de los tres valores es = <%= Calculos.metodoMultiplication(2, 3, 4) %></p>
	
</body>
</html>