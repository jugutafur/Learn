import React, { useState } from 'react';
import FreeCodeCampLogo from '../../../../assets/FreeCodeCamp/FreeCodeCamp.png';
import Boton from './Boton';
import { SecondaryTitle } from '../../../../components/text/Titles.jsx';
import styled from 'styled-components';
import Counter1 from './Counter1.jsx'
import Counter2 from './Counter2.jsx'

const Counter = styled.div`
  margin: 0 auto;
  margin-top: 10px;
  width: 200px;
  height: 50%;
  font-size: 160px;
  padding: 25px;
  color: white;
  display: flex;
  align-items: center;
  justify-content: center;
  border: 8px solid black;
  margin-bottom: 15px;
`;

export function ClickCounter () {
  const [click, setClik] = useState(0);

  const manejarClick = () => {
    setClik(click +10);
  }
  
  const reiniciarContador = () =>{
    setClik(0);
}

  return (
    <div>
      <SecondaryTitle>Desde ClickCounter</SecondaryTitle>
      <img
        src={FreeCodeCampLogo}
        alt='Logo FreeCodeCamp'/>
        <Counter>{click}</Counter>
        <Boton 
          text='Aumentar'
          changeClassName={true}
          manejarClick={manejarClick}/>
        <Boton 
          text='Reiniciar'
          changeClassName={false}
          manejarClick={reiniciarContador}/>
        <Counter1></Counter1>
        <Counter2></Counter2>
    </div>
  );
}
