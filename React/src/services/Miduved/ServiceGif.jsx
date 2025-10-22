import { useState, useEffect } from 'react'

export default function serviceGif() {
	const URLGif = 'https://api.giphy.com/v1/gifs/search?api_key=EjT1o5AGex1QiTx5VrMiot9CZyulAIoO&q=panda&limit=4&offset=0&rating=g&lang=en&bundle=messaging_non_clips'
	
	const URLGifBorrar = 'https://jsonplaceholder.typicode.com/users'

	return fetch(URLGif)
		.then(res => res.json())
		.then(response =>{
			const { data = []} = response
			const gifResponse = data.map(image => image.images.original.url)
			console.log(gifResponse)
			//setGifResponse(gifResponse)
			console.log("paso por aqui 222")
			return gifResponse
		})
		.catch((error) => console.error('Error Fetching Gifs 111'))
}

export function serviceGifByKeyword(keyword, initialGifs){
	const URLGif = `https://api.giphy.com/v1/gifs/search?api_key=EjT1o5AGex1QiTx5VrMiot9CZyulAIoO&q=${keyword}&limit=${initialGifs}&offset=0&rating=g&lang=en&bundle=messaging_non_clips`

	return fetch(URLGif)
		.then(res => res.json())
		.then( response => {
			const { data = []} = response
		const gifReponseByWKeyword = data.map(image => {
			const { id, title, } = image
			const { url } = image.images.original
			return { id, title, url }
		})
		return gifReponseByWKeyword
	})
}


//***************tambien es posible hacer lo anterior conviertiendo el servicio en customHook */

/*
import { useState, useEffect } from "react"

export function useServiceGif() {
	const [gifResponse, setGifResponse] = useState([])

	useEffect(() => {
		const URLGif = "https://api.giphy.com/v1/gifs/trending?api_key=TU_API_KEY"

		fetch(URLGif)
			.then(res => res.json())
			.then(response => {
				const { data = [] } = response
				const gifs = data.map(img => img.images.original.url)
				setGifResponse(gifs)
			})
			.catch(error => console.error('Error Fetching Gifs 111', error))
	}, [])

	return gifResponse
}
*/


//***************tambien es posible hacer lo anterior conviertiendo el servicio en customHook */