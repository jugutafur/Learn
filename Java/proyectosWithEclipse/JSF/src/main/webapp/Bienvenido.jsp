<html>
<header>
	<title>Bienvenido</title>
</header>
<body>
	<h1 style="text-aling:center">Pagina de Bienvenida</h1>
	
	<%
	//Valor por defecto
	String defaultPreferencia = "Tunja";
	
	//lee las cookies de la peticion del navegador
	Cookie[] preferencias = request.getCookies();
	
	//Buscar en el arrayRecover la preferencia
	//pero primero verificar que no este nulo
	
	if(preferencias !=null){
		for(Cookie cookie:preferencias){
			if("NombreCookie_Preferencia".equals(cookie.getName())){  //Compare si es nombre es igual 
				defaultPreferencia = cookie.getValue(); //asigne el valor 
				break;
			}
		}
	}	
	
	%>
	
	<p>la prefencia es = <%= defaultPreferencia %></p>
</body>
</html>