import { useState } from "react";
import NameForm from '../Estado/NameForm';


const Contact = () =>{

 const dias = ["lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"];

  return (
    <div>
      <h2>Pagina desde Contact Contact</h2>
      <ul>
        {
          dias.map((item, index)=>(
            <li key={index}>{item}</li>
          ))
        }
      </ul>
      <NameForm/>
    </div>
    
   

  )
}

export default Contact;