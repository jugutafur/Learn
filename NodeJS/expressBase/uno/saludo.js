function saludar(nombre){
    return `hola ${nombre}`;
}

function saludarMundo(){
    return `hola Mundo!!`;
}

//module.exports.fnSaludar = saludar;
//module.exports.fnSaludarMundo = saludarMundo;

//tambien se puede exportar como objeto

module.exports = {
    fnSaludar : saludar,
    fnSaludarMundo : saludarMundo
}