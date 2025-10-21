let valor1 = "Hola";
let valor2 = "Mundo";

console.log("mensaje = "+valor1+","+valor2);

let dias = ["lunes", "martes", "miercoles", "Jueves"];

let estudiante = {
  nombre: "Juan tafur",
  ciudad: "bogota",
  edad: 36,
  sexo: "masculino"
}

console.log("dia =" +dias[2]+ "datos estudiante = "+estudiante.nombre+"edad ="+estudiante.edad);

process.env.VariableJJ = "VaribleXxYy";

let calcular = {
  multiplicar: (valor2)=>{
    return valor2 * 2;
  },
  dividir: (valor2)=>{
    return valor2 / 2;
  }
}

console.log("multiplicar 10*2= "+calcular.multiplicar(10)+"y dividir 10/2 =" +calcular.dividir(10));

//desestructuración
let diasSemana = ['lunes', 'martes', 'miercoles', 'Jueves', 'Viernes'];

let persona = {
  nombre: 'camilo',
  edad: '58',
  ciudad: 'cali'
}

//operador de propagacion (...)
let trabajador = { ...persona, diasSemana, cargo: 'Operador'};
console.log(trabajador);

//parametros rest
function colores(dia, ...varios){
  console.log(dia);
  console.log(varios)
  console.log(varios[2]);
}

colores('martes', 'azul', 'morado', 'verde');


function solution(json1, json2) {
  // Tu código aquí 👈
  let Json1 = json1 || {
    name: "Mr. Michi",
    food: "Pescado"
  }
  let Json2 = json2 || {
    age: 12,
    color: "Blanco"
  }
  return salida = {...Json1, ...Json2}
}

console.log(solution({
  name: "Bigotes",
  food: "Pollito"
}));



const foo = function* (){
  yield "uno";
  yield "dos";
  yield "tres";    
};

let str = "";
for(const val of foo()){
  str = str + val;
}

console.log(str)

