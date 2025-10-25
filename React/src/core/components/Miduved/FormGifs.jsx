import { useState } from 'react'
import { SecondaryTitle } from '../../../components/text/Titles.jsx';
import { Input } from 'antd';
import { useLocation } from 'wouter';
import { serviceGifByKeyword } from '../../../services/Miduved/ServiceGif.jsx';
import GifCard from './GifCard.jsx';

const FormGifs = () => {
	const [ keyworFromForm, setKeywordFromForm ] = useState('');
	const [ amount, setAmount] = useState(0);
	const [ gifs, setGifs ] = useState([]);
  const [ path, pushLocation ] = useLocation();

	//otra forma para definir una function
	const handleSubmit = event =>{
		event.preventDefault()
		pushLocation(`/searh/${keyworFromForm}`)
		console.log(`valor de keyworFromForm ${keyworFromForm}`)
		console.log(`valor de amount ${amount}`)
		serviceGifByKeyword(keyworFromForm, amount)
		.then(responseGifs => { 
			setGifs(responseGifs) 
			console.log(`valor de gifs ${gifs}`)
		})
	}

	//otra forma para definir una function
	const handleChangeKeyword = event => {
		setKeywordFromForm(event.target.value)
	}

	const handleChangeAmount = event => {
		setAmount(event.target.value)
	}

	return (
		<div>
			<form onSubmit={handleSubmit} style={styles.form}>
			<h2>Formulario de Registro</h2>
			<SecondaryTitle>Ingrese el Keyword desea encontrar</SecondaryTitle>
			<Input
				type='text'
				min={1}
				max={6}
				onChange={handleChangeKeyword}
				value={keyworFromForm}/>
			<SecondaryTitle>Ingrese cuantos desea buscar</SecondaryTitle>
			<Input
				type='number'
				min={1}
				max={6}
				onChange={handleChangeAmount}
				value={amount}/>

			<button type="submit" style={styles.button}>
				Enviar
			</button>
		</form>
		<div style={{backgroundColor: "orange", display: "grid", gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr)", gap: "20px"}}>
			{
				gifs.map(gif => 
					<GifCard
					key={gif.id}
					title={gif.title}
					url={gif.url}/>
				)
			}
		</div>
		</div>
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

export default FormGifs;