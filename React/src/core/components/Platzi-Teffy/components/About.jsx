import SearchPost from "../../../../services/SearchPost";
import UserList from "../../../../services/UserList";

const About = () => {
  return (
    <div>
      <h2>Pagina desde About About</h2>
      <br />
      <br />
      <p>Consumo de API's externas</p><br />
      <UserList />
      <p>busqueda de post de acuerdo a string de entrada</p>
      <SearchPost />
    </div> 
  )
}

export default About;