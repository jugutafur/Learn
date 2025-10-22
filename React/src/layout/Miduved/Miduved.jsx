import { PrincipalTitle } from '../../components/text/Titles.jsx';
import useSelectProjects from '../../shared/components/SelectProjects/useSelectProjects.jsx';

import SelectProjects from '../../shared/components/SelectProjects/SelectProjects.jsx';
import InitialGalery from '../../core/components/miduved/InitialGalery.jsx'
import SearchGifs from '../../core/components/miduved/SearchGifs.jsx'
import FormGifs from '../../core/components/miduved/FormGifs.jsx'

const Miduved = () => {
  const { opcion, handleChange } = useSelectProjects(1);
  const subProjects = [
    'InitialGalery',
    'SearchGifs',
    'FormGifs'];

  return (
    <div>
      <PrincipalTitle>Proyecto Miduve</PrincipalTitle>
      <a href="https://www.youtube.com/watch?v=2qgs7buSnHQ&list=PLV8x_i1fqBw0B008sQn79YxCjkHJU84pC&index=3">Ver Tutorial</a>
      <SelectProjects subProjects={subProjects} />
      <input 
        type="number"
        min={1}
        max={subProjects.length}
        onChange={handleChange} 
        value={opcion}/>
        <div>
          { opcion == 1 ? <InitialGalery/> : null }
          { opcion == 2 ? <SearchGifs/> : null }
          { opcion == 3 ? <FormGifs/> : null }
        </div>
    </div>
  )
}

export default Miduved;