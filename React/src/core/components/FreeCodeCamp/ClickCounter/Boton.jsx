import React from 'react';
import './ClickCounter.css';

function Boton({text, changeClassName, manejarClick}){
  return (
    <button
      className={ changeClassName ? 'boton-Click' : 'boton-Reiniciar' }
      onClick={manejarClick}>
      {text}
    </button>
  );
}

export default Boton ;