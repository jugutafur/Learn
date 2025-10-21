<html>

<body>
	<p>En este documento recibiras la data</p>
	<p><%=request.getParameter("ciudad_favorita")%></p>
<%
//leyendo datos del formulario
String preferencia = request.getParameter("ciudad_favorita");

//Creando cookie
Cookie laCookie = new Cookie("NombreCookie_Preferencia", preferencia);

laCookie.setHttpOnly(true);
laCookie.setSecure(true);

//Configurado su vida util
laCookie.setMaxAge(365*24*60*60); //Un anio de vida Util

//enviar Cookie al cliente
response.addCookie(laCookie);

%>
<p>Gracias por enviar sus preferencias </p>

<a href="Bienvenido.jsp">Ir al pagina Inicial</a>

</body>
</html>