import { useState } from 'react'
import './App.css'
import { BrowserRouter as Router } from 'react-router-dom';

//Global State
import { useContext, createContext } from 'react'
import Nav from './shared/components/Nav.jsx';

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

function ThemeButton (){
  const {theme, toogleTheme} = useContext(ThemeContex);
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
    <div className="App">
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
