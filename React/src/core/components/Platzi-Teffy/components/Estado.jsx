import { useState } from "react";

import Counter from "../Estado/Counter";
import ToggleButton from "../Estado/ToggleButton";
import NameForm from "../Estado/NameForm";

const Estado = () => {
  const [count, setCount]= useState(3);

  return ( 
    <div>
      <h2>pagina de estados de React</h2>
      <Counter/>
      <ToggleButton/>
      <NameForm/>
    </div>
  )
}

export default Estado;