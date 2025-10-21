const fs = require('fs');
const yaml = require('js-yaml');
//const express = require('express');

// Crea una aplicación de Express
//const app = express();

let config;
console.log('Run inicio.js');
try {
    const fileContents = fs.readFileSync('config.yml','utf-8');
    console.log(fileContents);
    config = yaml.load(fileContents);
} catch (error) {
    console.log('va a imprimir un error =', error);
}

// Configura el servidor usando los valores del archivo YAML
const port = config.server.port;

console.log('valor de port =', port);
