var http = require('http');

var servidor = http.createServer(function(peticion, respuesta){
  respuesta.writeHead(200, {'Content-type': 'text/html'});
  respuesta.write('Texto desde codigo3'+ peticion.url);
  console.log('peticion web');
});

servidor.listen(3001);
console.log('Ejecutando servidor NodeJS');