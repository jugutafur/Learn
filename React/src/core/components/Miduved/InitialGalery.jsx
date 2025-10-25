import { useState, useEffect } from 'react'
import ListGifs from './ListGif.jsx'
import GifCard from './GifCard.jsx';
import serviceGif from '../../../services/Miduved/ServiceGif.jsx'

const InitialGalery = () => {

	const URL = ['https://media0.giphy.com/media/txsJLp7Z8zAic/giphy.gif?cid=b4da437elrxhjoklbvj4b09eu5pc1hy62qg2yuh8h4g6wq4a&ep=v1_gifs_search&rid=giphy.gif&ct=g&quot',
	'https://media0.giphy.com/media/uSYQsJQWEv6O4/giphy.gif?cid=b4da437elrxhjoklbvj4b09eu5pc1hy62qg2yuh8h4g6wq4a&ep=v1_gifs_search&rid=giphy.gif&ct=g&quot']

	const URL2 = ['https://media3.giphy.com/media/EPcvhM28ER9XW/giphy.gif?cid=b4da437elrxhjoklbvj4b09eu5pc1hy62qg2yuh8h4g6wq4a&ep=v1_gifs_search&rid=giphy.gif&ct=g&quot;']

	const [valueGif, setValueGif] = useState(URL);
	const [isClicked, setIsClicked] = useState(false);

	useEffect(()=>{
		serviceGif().then(gif => setValueGif(gif))
  }, [])

	function cambiarValor(){
		//console.log(`valor de URLResponse: ${URLResponse}`)
		setIsClicked(!isClicked);
		isClicked ? setValueGif(URL): setValueGif(URL2);
	}

	return(
		<div>
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
		</div>
	)
}

export default InitialGalery;