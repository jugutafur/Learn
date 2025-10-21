import { useReducer } from "react";

//esta clase es precisamente un preámbulo a redux, ya que redux usa useReducer para determinar los cambios de estado en las stores

//dependiendo de action va a seleccionar en el switch 
//y el state va a guardar el estado
  const reducer = (state, action) => {
    switch (action.type){
      case "incrementar":
        return {count: state.count +1};
      case "decrementar":
        return {count: state.count -1};
      default:
        return state;
    }
  }

  const UseReducerAplicacion = () =>{
    <h1>desde UseReducerAplicacion</h1>
    //para tener estado mas complejos
    //useReducer(le pasamos el switch, estado inicial igual a 0 )
    const[state, dispatch] = useReducer(reducer, {count: 0 })

    return(
      <div>
        <p>Contador: {state.count}</p>
        {/*De esta manera podemos seleccionar una accion del switch que depende de la 
        accion del usuario*/}
        <button onClick={()=>dispatch({type: "incrementar"})}>Incrementar</button>
        <button onClick={()=>dispatch({type: "decrementar"})}>Decrementar</button>
      </div>
    )
  }

export default UseReducerAplicacion;