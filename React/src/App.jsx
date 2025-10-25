import { useState } from 'react'
import './App.css'
import { BrowserRouter as Router } from 'react-router-dom';

//Global State
import { useContext, createContext } from 'react'
import Nav from './shared/components/Nav.jsx';

//UN CONSUMIDOR Y UN PROVEEDOR 

//EL PROVEEDOR O PROVIDER en este caso 
// <Xxxxx.Provider>
//  dentro de este tap estaran todos los compoentes que pueden usar ese contexto desde cualquier punto
//</Xxxxx.Provider>

//UN CONSUMIDOR es decir cualquier componente dentro del provider usara para invocar o usar el createContext();

//esto es un Estado Goblal que es independiente de cualquier componente
//Cualquier componente puede usar este Estado Global
const ThemeContex = createContext();
//Para usar el Estado Global se requiere un proveedor quien es el intermediario
//para que los demas componente puedan usar el Estado Global 
//En ultimas este proveedor es como un wrapper o un encapsulador quien precisamente 
//contiene este este Estado Global
function ThemeProvider({children}){
  //Se define un estado local donde se define el Thema de la aplicacion
  const[theme, setTheme]= useState("light")
  const toogleTheme =() => {
    setTheme((prevTheme)=>(prevTheme==="light"?"dark":"light"))
  }
  return (
    <ThemeContex.Provider value={{theme, toogleTheme}}>
      {children}
    </ThemeContex.Provider>
  )
}

function ThemeButton (){  // si te das cuenta este componente esta dentro del provider es decir que este componente podra invocar o usar el createContext(); y SOLO SI PODRA USARLO CON el hoock useContext();
  const {theme, toogleTheme} = useContext(ThemeContex);  ///const {objeto que retornaA, objeto que retornaB} = useContext(objeto que recibeA);
  return (
    <div>
      <p>Desde ThemeButton</p>
      <button onClick={toogleTheme}
        style={{
          backgroundColor: theme === "light"? "#0d1aceff":"#ee0b0bff",
          color: theme === "light"? "#000":"#2fe20bff"
        }}>
        Cambiar Thema
      </button>
    </div>
  )
}

function App() {
  return (
    <div className="container">
      <Router>
        <Nav/>
      </Router>

      {/*Lo siguiente se va a renderizar en todas los layout
       lo cual es otro tabs de navegacion y un boton para cambiar el tema
       Estos 2 componentes estan contenidos en <ThemeProvider> componente que permite acceder al estado global*/}
       <ThemeProvider>
        <ThemeButton/>
      </ThemeProvider>
    </div>
  )
}

export default App
