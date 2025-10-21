<%@ page import="java.util.*"%>
<html>

<body>
<form name="Formulario_Compra" action="CarroDeCompra.jsp">

		<p>Artículos a comprar:</p>
		<p>Esto hace parte del curso de java de pildoras informaticas
			video 237</p>
		<p>
			Cuando se le da click en el Boton Enviar se activa el codigo de esta
			despues del formulario pero no guarda las selecciones anteriores, es
			decir si el usuario selecciona los 3 primeros items de la lista y le
			da boton enviar en la parte de abajo se muestran efectivamente los 3
			elementos <strong>PERO</strong> si el usuario selecciona otro item la
			nueva vista solo aparecera 1 item NO GUARDA EL ESTADO no hay
			secciones
		</p>
		<p>
			<label> <input type="checkbox" name="articulos" value="agua ">Agua
			</label> <br> 
			<label> <input type="checkbox" name="articulos"
				value="leche"> Leche
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="pan"> Pan
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="mazanas"> Manzanas
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="carne"> Carne
			</label> <br> <label> <input type="checkbox" name="articulos"
				value="pescado"> Pescado
			</label>
		</p>
		<p>
			<input type="submit" name="button" id="button" value="Enviar">
			<br>
		</p>
	</form>

	<form>
		<button <%=borrarArrayItems()%> />Borrar Array</button>
	</form>
	<ul>
	
	<p>Este es el valor de count<%=mostrar%></p>
		<h2>Carro de la compra</h2>
		<%
		String[] listArticulosSinMemoria = request.getParameterValues("articulos");
		List<String> listArticulosConMemoria = (List<String>) session.getAttribute("misElementosDeSession");
		int count = 0;
		boolean borrar = false;
		%>

		<%
		//para guardar las selecciones y que se vayan guardando en UNA SESION creamos un atributo y le asignamos
		//un valor

		if (listArticulosConMemoria == null) {
			listArticulosConMemoria = new ArrayList<String>();
			session.setAttribute("misElementosDeSession", listArticulosConMemoria); //creamos el atributo misElementosDeSession 
			//para la session y le asignamos un valor 
		}
		//cada vez que se da click en el boton Enviar crea un nuevo Array  
		if (listArticulosSinMemoria != null) {
			out.println("<h2>Sin memoria</h2>");
			out.println("<ol>");
			for (String e : listArticulosSinMemoria) {
				out.println("<li>" + e + "<i>");
				listArticulosConMemoria.add(e);
			}
			out.println("<ol>");
		} else {
			out.println("El array de articulos esta vacio");

		}

		//impresion de la lista con memoria
		if (listArticulosConMemoria != null) {
			out.println("<ol>");
			for (String ee : listArticulosConMemoria) {
				out.println("<li>" + ee + "<i>");
			}
			out.println("<ol>");
		} else {
			out.println("El array de articulos esta vacio");
		}
		%>
	</ul>

	<%!int mostrar;

	public int borrarArrayItems() {
		return mostrar++;

	}%>
</body>
</html>