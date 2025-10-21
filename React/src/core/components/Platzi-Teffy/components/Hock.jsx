import HockUseEfect from "../Hock/HockUseEfect";
import CounterTafur from "../Hock/Personalized/CounterTafur";
import UseReducerAplicacion from "../Hock/UseReducerAplicacion";

const Hock = () => {

  const {count, increment, decrement, reset} = CounterTafur(10);
   
  return(
      <div>
          <h1>Pagina de Hock's</h1>
          <HockUseEfect/><br /><br />
          <h1>en el siguiente hock es un ejemplo de uso de useReducer la entrada para entender Redux</h1>
          <UseReducerAplicacion/><br />
          <h1>A continuacion va el contador personalizado CounterTafur</h1>
          <p>valor de CounterTafur: {count}</p>
          <button onClick={increment}>Incrementar</button>
          <button onClick={decrement}>Decrementar</button>
          <button onClick={reset}>Reiniciar</button>
      </div>
  )
}

export default Hock;