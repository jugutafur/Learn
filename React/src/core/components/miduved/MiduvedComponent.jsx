import { useState, useEffect } from 'react'
import  serviceGif, { serviceGifByKeyword } from '../../../services/Miduved/serviceGif'
import GifCard from './GifCard'
import { SecondaryTitle } from '../../../components/text/Titles.jsx';
import ListGifs from './ListGif.jsx'
import { Input } from 'antd';
import { useLocation } from 'wouter';

const  MiduvedComponent = () => {

  const URL = ['https://media0.giphy.com/media/txsJLp7Z8zAic/giphy.gif?cid=b4da437elrxhjoklbvj4b09eu5pc1hy62qg2yuh8h4g6wq4a&ep=v1_gifs_search&rid=giphy.gif&ct=g&quot',
  'https://media0.giphy.com/media/uSYQsJQWEv6O4/giphy.gif?cid=b4da437elrxhjoklbvj4b09eu5pc1hy62qg2yuh8h4g6wq4a&ep=v1_gifs_search&rid=giphy.gif&ct=g&quot']

  const URL2 = ['https://media3.giphy.com/media/EPcvhM28ER9XW/giphy.gif?cid=b4da437elrxhjoklbvj4b09eu5pc1hy62qg2yuh8h4g6wq4a&ep=v1_gifs_search&rid=giphy.gif&ct=g&quot;']

  const [valueGif, setValueGif] = useState(URL)
  const [isClicked, setIsClicked] = useState(false)
  const [keyword, setKeyword] = useState('panda')
  const [gifRandom, setGifRandom] = useState([])
  const [initialGifs, setInitialGifs] = useState(1);
  const [keyworFromForm, setKeywordFromForm] = useState('');
  const [path, pushLocation] = useLocation();

  function cambiarValor(){
    //console.log(`valor de URLResponse: ${URLResponse}`)
    setIsClicked(!isClicked);
    isClicked ? setValueGif(URL): setValueGif(URL2);
  }

  useEffect(()=>{
    serviceGif().then(gif => setValueGif(gif))
  }, [])

  function changeKeywordRandom(){
    serviceGifByKeyword(keyword, initialGifs)
    .then(gifByKeyRandom => setGifRandom(gifByKeyRandom))
  }

  //otra forma para definir una function
  const handleSubmit = event =>{
    event.preventDefault()
    pushLocation(`/searh/${keyworFromForm}`)
    console.log(keyworFromForm)
  }

  //otra forma para definir una function
  const handleChange = event => {
    setKeywordFromForm(event.target.value)
  }

  function changeKeyword(keyword){
    setKeyword(keyword)
  }

  function changeInitialGifs(initialGifs){
    setInitialGifs(initialGifs)
  }

  return (
    <section>
      <div style={{backgroundColor: "orange", display: "grid", gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr)", gap: "20px"}}>
        {
          valueGif.map(gif => 

            <GifCard  
              key={gif} 
              title={gif}
              url={gif} 
              id={gif} />
          )
        }
      </div>
      {/*<img src={valueGif} alt='gif'/>*/}
      <button onClick={()=> cambiarValor()}>Cambiar de Gif</button>
      <ListGifs valueGif={valueGif}/>


      <SecondaryTitle>Ingrese cuantos desea buscar</SecondaryTitle>
      <Input
        type='number'
        min={1}
        max={6}
        onChange={(e) => changeInitialGifs(e.target.value)}/>

      <SecondaryTitle>Ingrese la categoria</SecondaryTitle>
      <Input  
        type="text" 
        onChange={(e) => changeKeyword(e.target.value)}/>


      <button
        onClick={changeKeywordRandom}
      >Enviar</button>
      <div style={{backgroundColor: "orange", display: "grid", gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr)", gap: "20px"}}>
        {
        gifRandom.map(gif =>
          <GifCard 
            key={gif.id} 
            title={gif.title}
            url={gif.url} 
            id={gif.id} />
          /*  Tambien se puede hacer asi solo que de la forma anterior se ve mas claro, ademas se tiene mas control sobre lo que se esta pasando,,, de la siguiente manera se pasan todas las propiedades del objeto NO ES MUY RECOMENDABLE
          <GifCard 
            key={gif.id} {...gif} />*/
    )}
      </div>


      <form onSubmit={handleSubmit} style={styles.form}>
      <h2>Formulario de Registro</h2>

      <SecondaryTitle>Ingrese cuantos desea buscar</SecondaryTitle>
      <Input
        type='text'
        min={1}
        max={6}
        onChange={handleChange}
        value={keyworFromForm}/>

      <button type="submit" style={styles.button}>
        Enviar
      </button>
    </form>
      
    </section>  
  )
}

// Algunos estilos en línea simples
const styles = {
  form: {
    display: "flex",
    flexDirection: "column",
    width: "300px",
    margin: "50px auto",
    padding: "20px",
    border: "1px solid #ccc",
    borderRadius: "10px",
  },
  label: {
    marginTop: "10px",
    marginBottom: "5px",
  },
  input: {
    padding: "8px",
    borderRadius: "5px",
    border: "1px solid #aaa",
  },
  button: {
    marginTop: "15px",
    padding: "10px",
    border: "none",
    borderRadius: "5px",
    backgroundColor: "#007bff",
    color: "white",
    cursor: "pointer",
  },
};

export default MiduvedComponent;


/*****************************En caso de que el Servicio se convierta en un Custom Hook  */
/*
import { useServiceGif } from "./ServiceGif"

export default function GifList() {
	const gifs = useServiceGif()

	return (
		<div>
			{gifs.map((gif, index) => (
				<img key={index} src={gif} alt="gif" />
			))}
		</div>
	)
}*/

/*****************************En caso de que el Servicio se convierta en un Custom Hook  */