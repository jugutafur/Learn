import { useState } from 'react';

const NameForm = () =>{
  const [name, setName] = useState("")

  //El evento de onChange se puede hacer de 2 formas 
  //1ra la funcion set esta en el elemento 
  //2da el elemento llama a una funcion para hacer set a la variable

  //Aunque las 2 formas funcionan de manera correcta es mejor usar la 
  //2da pues es mas mantenible
  const [lastName, setLastName] = useState("");
  const changeLastName = (event)=> setLastName(event.target.value);
  return(
    <div>
      <h1>Componente de NameForm</h1>

      {/* Primera forma de hacer el onChange */}
      <input type="text" 
      placeholder='Ingrese tu nombre' 
      value={name} 
      onChange={(event)=>setName(event.target.value)}
      />
      
      {/* Segunda forma de hacer el onChange */}
      <input type="text"
      placeholder='Ingresa tu apellido'
      value={lastName}
      onChange={changeLastName} />

      {/* Si inicialmente esta vacio name ,,, imprime pepito */}
      <p>Hola {name||"pepito"} {lastName||"perez"}</p>
    </div>
  )
}

export default NameForm;