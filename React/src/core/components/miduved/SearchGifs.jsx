import { useState, useEffect } from 'react'
import { SecondaryTitle } from '../../../components/text/Titles.jsx';
import { Input } from 'antd';
import serviceGif, { serviceGifByKeyword } from '../../../services/Miduved/serviceGif'
import GifCard from './GifCard.jsx';


const SearchGifs = () => {
	const [gifRandom, setGifRandom] = useState([]);
	const [keyword, setKeyword] = useState('panda');
	const [initialGifs, setInitialGifs] = useState(1);

	function changeKeyword(keyword){
    setKeyword(keyword)
  }

  function changeInitialGifs(initialGifs){
    setInitialGifs(initialGifs)
  }

	function changeKeywordRandom(){
    serviceGifByKeyword(keyword, initialGifs)
    .then(gifByKeyRandom => {
			setGifRandom(gifByKeyRandom)
		}
		)
  }

	return (
		<div>
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
				onClick={changeKeywordRandom}>
				Enviar
			</button>
    	<div style={{backgroundColor: "orange", display: "grid", gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr)", gap: "20px"}}>
				{
					gifRandom.map(gif => 
						<GifCard
						key={gif.id}
						title={gif.title}
						url={gif.url}
					/*  Tambien se puede hacer asi solo que de la forma anterior se ve mas claro, ademas se tiene mas control sobre lo que se esta pasando,,, de la siguiente manera se pasan todas las propiedades del objeto NO ES MUY RECOMENDABLE
					<GifCard 
						key={gif.id} {...gif} />*/
						/>
					)
				}
			</div>
		</div>
	)
}

export default SearchGifs;

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