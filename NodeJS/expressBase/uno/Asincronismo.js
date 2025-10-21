//promesas Async/Await

let Administrador = {
  nombre: 'julio',
  edad: 40,
  area: 'bodega',
  ciudad: 'medellin'
}

const getAdmin = ()=> {
  return new Promise((resolve, reject)=>{
    setTimeout(()=>{
      resolve(Administrador);
    }, 1500);
  });
}

async function getDatosAdmin(){
  const datosObtenidos = await getAdmin()
  console.log(datosObtenidos);
}

getDatosAdmin();


async function getData() {
  return new Promise((resolve) => {
      setTimeout(() => {
          resolve([{
              movie: "El despertar de los michis",
              year: 2021,
              protagonist: "Mr. Michi"
          }, {
              movie: "101 Michis",
              year: 2019,
              protagonist: "Tommy Michiguire"
          }]);
      }, 1000);
  });
}

getData().then(x=>console.log(x));


const foo = function* () {
  yield 'x';
  yield 'p';
  yield 'c';
};

let str = '';
for (const val of foo()) {
  str = str + val;
}

console.log(str);