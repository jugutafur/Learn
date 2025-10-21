import { useState, useEffect } from "react";

const UserList = () => {
  const [albumsList, setAlbumsList] = useState([]);
  const [userList, setUserList] = useState([]);
  const [isLoading, setIsLoading] = useState(true);
  const [error, setError] = useState(null);

  const url = "https://jsonplaceholder.typicode.com/";

  //se puede traer la informacion de manera async await 
  useEffect(()=>{
    const fettUsers = async() =>{
      try{
        const response = await fetch(url + "/users" )
        if(!response.ok){
          throw new error ("Error fetching users")
        }
        const data = await response.json();
        setUserList(data);
      }catch(error){
        setError(Error);
      }finally{
        setIsLoading(false);
      }
    }

    fettUsers();
  }, []);

  //se puede traer la informacion de manera sencilla 
  useEffect (()=>{
    fetch(url + "/albums")
    .then((response)=> response.json())
    .then((data) =>setAlbumsList(data))
    .catch((error)=> console.error("Error fetching albumes : ", error))
  })

  if (isLoading){
    return <p>Cargando informacion .....</p>
  }

  //Se debe agregar ".message" para mostrar el error ya que es un objeto
  if (error){
    return <p>Error: {error.message}</p>
  }

//simple-tab-X y aria-controls= simple-tabpanel-X solo sirven para relacionar el li con el identificador  aca el elemento mas importante es key QUE AUNQUE no se setea en este bloque se debe hacer directamente en el li y solo se usa para que react pueda identificar cada elemento de la lista y asi optimizar el renderizado sin MOSTRARSE EN EL DOM
function asigKey(index){
    return {
      id: `simple-li-${index}`,
      'aria-controls': `simple-li-${index}`,
  };
}

  return (
    <div>
      <h1>component UserList</h1>
      <h1>Lista de usuarios</h1>
      <ul>
        {
          userList.map((user)=>(
              <li key={user.id} {...asigKey(user.id)}>id={user.id}, name={user.name}, email ={user.email}, city={user.address.city}</li>
          ))
        }
      </ul>
      <br /><br />  
      <p>lista de albums</p>
      <ul>
        {
          albumsList.map((album)=>(
            <li key={album.id}>id={album.id}, title={album.title}</li>
          ))
        }
      </ul>
    </div>
  )
}
export default UserList;