const y = require('./saludo.js');
const os = require('os');

//console.log(y);
console.log(y.fnSaludar("Juan T1"));
console.warn(y.fnSaludar("Juan T2"));
//console.error(new Error("Tafur Ramirez"));
console.log(y.fnSaludarMundo());
console.log(process);  
console.log(process.argv);          // cuando se corre un comando en la terminal lo podemos pasar con argumentos adiciones por ejemplo node app.js 6 7
console.log(process.argv[2]); //para el caso anterior va a imprimir por consola 6
//console.log(process.memoryUsage());  //ver descripcion de la memoria 
//console.log(os.type());             //obtener el valor del Sistema Operativo donde corre el .js
//console.log(os.homedir());          //la raiz de la carpeta principal
//console.log(os.hostname());         //nombre del equipo DESKTOP-8G...
//console.log(os.uptime());           //Tiempo que lleva ejecutandose el programa
console.log(os.userInfo());         
