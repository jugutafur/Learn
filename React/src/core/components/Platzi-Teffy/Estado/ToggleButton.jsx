import { useState } from "react";

const ToggleButton = ()=>{
  const [isActive, setIsActive] = useState(false);
  return (
    <div>
      <h1>Componente ToggleButton</h1>
      <button onClick={()=> setIsActive(!isActive)}>
        {isActive ? "Activo": "Inactivo"}
      </button>
    </div>
  )
}

export default ToggleButton;