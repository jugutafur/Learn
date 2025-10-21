import { useState, useEffect } from "react";

const SearchPost = () =>{

  const[query, setQuery]= useState("");
  const[posts, setPosts]= useState([]);

  const url = `https://jsonplaceholder.typicode.com/posts?title_like=${query}`;

  useEffect(()=>{
    fetch(url)
    .then((response)=>response.json())  //indicando que la respuesta es de origin json
    .then((data)=> setPosts(data))       //guardar el response en el objeto
    .catch((error)=>console.error("Error fetching posts ", error))
  }, [query])  //cada vez que query cambie se ejecuta el useEffect

  return(
    <div>
      <br /><br />
      <h1>desde SearchPost</h1><br />
      <p>este es un filtro dinamico que muestra los titulos que tienen coincidencias con la busqueda</p> <br />
      <input type="text" 
      placeholder="Buscar post"origina
      value={query}
      onChange={(event)=> setQuery(event.target.value)} />

      <ul>
        {
          posts.map((posts)=>(
            <li key={posts.id}>{posts.title}</li>
          ))
        }
      </ul>
    </div>
  )
}

export default SearchPost;