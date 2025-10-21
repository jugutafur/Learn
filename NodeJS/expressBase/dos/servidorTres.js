var express = require('express');


var app = express();

app.all('/', function(peticion, respuesta){
 respuesta.send('Hola');
});

app.get('/acerca', function(request, response){
  response.send('AcercaMAS');
});

var server = app.listen(4000, function(){

});

