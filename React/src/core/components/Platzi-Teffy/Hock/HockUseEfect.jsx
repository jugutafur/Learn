import { useEffect, useState } from 'react';

const HockUseEfect = () =>{

  //este hock tiene efecto de ejecutarse despues de X condicion

  const[count, setCount]=useState(0);
  const[count2, setCount2]=useState(8);

  //Este hook sirve para que se ejecute despues de algo 
  //En este caso va a mostrar un console.log cuando count= 6
  // `` comillas invertidas o template literals sirve para evitar concatenar string
  //y variables con el operador + 
  useEffect(()=>{
    console.log(`el valor de count llego a ${count}`)
  },[count==6, count2==9])

  //🔹 El efecto NO requiere que ambas condiciones se cumplan a la vez.
  //🔹 Se ejecuta cuando cualquiera de las dos expresiones booleanas cambia de valor.
  
  return(
    <div>
      <h1>Component hockUseEfect</h1>
      <p>Este hock useEffect se ejecutara despues de X condicion en este cado imprime por consola "el valor de count llego a 6" cuando el valor de count este en 6 ya despues desaparece</p><br />
      <p>El contador tiene un valor de count = {count}</p>
      <button onClick={()=> setCount(count+1)}>Incrementar</button>
      <button onClick={()=> setCount(0)}>Reiniciar</button>

      <p>El contador tiene un valor de count2 = {count2}</p>
      <button onClick={()=> setCount2(count2+1)}>Incrementar</button>
      <button onClick={()=> setCount2(0)}>Reiniciar</button>
    </div>
  )
}

export default HockUseEfect;