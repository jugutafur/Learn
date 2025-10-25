import { useEffect, useState} from 'react';
import { evaluate } from 'mathjs';
import { StyleCalculadora, Pantallas } from './StylesCalculadora.jsx';
import { SecondaryTitle } from '../../../../components/text/Titles.jsx'
import './StylesCalculadora.css'

function Calculadora() {
  const [ input, setInput ] = useState(0);
  const [ operar, setOperar ] = useState({estado: false, cantidad:0});
  const [ error, setError ] = useState('');
  const [ showError, setShowError] = useState(false);
  const operadores = ['+', '-', '*', '/'];

  const agregarInput = value =>{

    // si input es 0 y se intenta poner un operador, se bloquea
    if (input === 0 && operadores.includes(value)) {
      setShowError(true);
      return setError('ingrese un numero');
    }

    // obtenemos el último carácter actual
    const ultimo = input.toString().slice(-1);

    // si el último y el actual son operadores, no se agrega
    if (operadores.includes(ultimo) && operadores.includes(value)) {
      setShowError(true);
      setError("🚫 No se permite agregar dos operadores seguidos");
      return 
    }

    // concatenar normalmente
    setInput(input === 0 ? value : input + value);
    setShowError(false);
  };

  const calcularResultado = ()=> {

  // si el input no existe o es 0, se detiene
    if (!input || input === 0) { //En cas de darle igual sin ningun String
      setShowError(true);
      setError("Ingrese una operación válida antes de calcular");
      return;
    }

  // si el input es un número simple (sin operadores), no tiene sentido evaluarlo
    if (!/[+\-*/]/.test(input)) { //En caso de solo ingresar un solo numero
      setShowError(true);
      setError("Debe ingresar una operación para calcular");
      return;
  }


  const ultimo = input.toString().slice(-1);
    if(operadores.includes(ultimo)){ //Si es un Operador
      setShowError(true);
      setError('Por ingrese valores validos')   
    }else{
      setShowError(false);
      setInput(evaluate(input))
    }
  }

  return (
    <div>
      <SecondaryTitle>Calculadora</SecondaryTitle>
      <StyleCalculadora>
        {
          error && showError && <p style={{color: 'white'}}>{error}</p>
        }
        <Pantalla input={input} />
        <div className='fila'>
          <Boton manejarClick={agregarInput}>1</Boton>
          <Boton manejarClick={agregarInput}>2</Boton>
          <Boton manejarClick={agregarInput}>3</Boton>
          <Boton manejarClick={agregarInput}>-</Boton>
        </div>
        <div className='fila'>
          <Boton manejarClick={agregarInput}>4</Boton>
          <Boton manejarClick={agregarInput}>5</Boton>
          <Boton manejarClick={agregarInput}>6</Boton>
          <Boton manejarClick={agregarInput}>+</Boton>
        </div>
        <div className='fila'>
          <Boton manejarClick={agregarInput}>7</Boton>
          <Boton manejarClick={agregarInput}>8</Boton>
          <Boton manejarClick={agregarInput}>9</Boton>
          <Boton manejarClick={agregarInput}>*</Boton>
        </div>
        <div className='fila'>
          <Boton manejarClick={calcularResultado}>=</Boton>
          <Boton manejarClick={agregarInput}>0</Boton>
          <Boton manejarClick={agregarInput}>.</Boton>
          <Boton manejarClick={agregarInput}>/</Boton>
        </div>
        <div className='fila'>
          <BotonClear manejarClear={()=>setInput(0)}>Clear</BotonClear>
        </div>
      </StyleCalculadora>
    </div>
  );
}

export default Calculadora;

function Boton(props){
  //Con esta funcion determinamos si lo que esta dentro de un boton es un caracter de operador ya que si es asi va a tener un color de fondo verde o si es un numero va a tener un fondo de color blanco
  const esOperador = valor =>{
    return isNaN(valor) && (valor !== '.') && (valor !== '='); //si todo es cierto devulve un TRUE
  };

  return (
    <div
      className={`boton-calculadora${esOperador(props.children)? '-operador' : ''}`.trimEnd()}
      onClick={() => props.manejarClick(props.children)}>
      {props.children}
    </div>
  );
}

const Pantalla = ({ input }) =>{
  return (
    <Pantallas>
      {input}
    </Pantallas>
  );
}

const BotonClear =(props) =>{
  return(
    <div 
    className='boton-clear'
    onClick={props.manejarClear}>
      {props.children}
    </div>
  )
}