<html>

<body>


</br></br>
<h2>************************Request************************</h2>
<p>1. request, getHeader(User-Agent) =  <%= request.getHeader("User-Agent") %></p>
<p>8. request, getHeader(Transfer-Encoding) = <%= request.getHeader("Transfer-Encoding") %></p>
<p>2. request, getLocale: <%= request.getLocale() %></p>
<p>3. request, getCookies = <%= request.getCookies() %></p>
<p>4. request, ChangeSession = <%= request.changeSessionId() %></p>
<p>5. request, getMethod = <%= request.getMethod() %></p>
<p>6. request, getProtocol = <%= request.getProtocol() %></p>
<p>8. request, getContextPath = <%= request.getContextPath() %></p>
<p>9. request, getLocalPort = <%= request.getLocalPort() %></p>
<p>10. request, getLocalAddr = <%= request.getLocalAddr() %></p>
<p>11. request, getLocalName = <%= request.getLocalName() %></p>
<p>12. request, getRemoteHost = <%= request.getRemoteHost() %></p>
<p>13. request, getRemotePort = <%= request.getRemotePort() %></p>
<p>14. request, getRequestURI = <%= request.getRequestURI() %></p>
<p>15. request, getRequestedSessionId = <%= request.getRequestedSessionId() %></p>
<p>16. request, getScheme = <%= request.getScheme() %></p>
<p>17. request, getServerName = <%= request.getServerName() %></p>
<p>18. request, getServerPort = <%= request.getServerPort() %></p>
<p>19. request, getServletPath = <%= request.getServletPath() %></p>
<p>20. request, toString = <%= request.toString() %></p>
<!-- 
<p>20. request, toString = request.setAttribute(name, o) %></p>
<p>20. request, toString = request.getAttribute(name)	 %></p>
 
<p>20. request, toString = request.getParameter(name)	 %></p> //Este nos permite capturar lo que viene en la URL debemos indicar en la zona de atributos el campo que deseamos capturar 
<p>20. request, toString = request.getParameterValues(name)	 %></p> //Nos permite de igual manera un ARRAY de String que son los que deseamos capturar ref.pildorasInformaticas video 237
 -->
 
</br></br>
<h2>************************Response************************</h2>
<p>1. response, toString =<%= response.toString() %></p>
<p>2. response, SC_USE_PROXY =<%= response.SC_USE_PROXY %></p>
<p>3. response, SC_NOT_FOUND =<%= response.SC_NOT_FOUND %></p>
<p>4. response, getCharacterEncoding =<%= response.getCharacterEncoding() %></p>
<p>5. response, getheader = <%= response.getHeader("Set-Cookie") %></p>
<p>6. response, getContentType = <%= response.getContentType() %></p>
<!-- 
<p>7. response, addCookie = response.addCookie(cookie) %></p>
 -->
</body>

</html> 