import { PrincipalTitle } from '../../components/text/Titles.jsx';

import SelectProjects from '../../shared/components/SelectProjects/SelectProjects.jsx';
import useSelectProjects from '../../shared/components/SelectProjects/useSelectProjects.jsx';

import Testimonios from '../../core/components/FreeCodeCamp/Testimonio/Testimonios';
import { ClickCounter } from '../../core/components/FreeCodeCamp/ClickCounter/ClickCounter';
import Calculadora from '../../core/components/FreeCodeCamp/Calculadora/Calculadora';
import Access from '../../core/components/FreeCodeCamp/Access/Access';

const FreeCodeCamp = () => {
  const { opcion, handleChange } = useSelectProjects(1);
  const subProjects = [
    'Testimonios', 
    'ClickCounter', 
    'Calculadora', 
    'Access'];

  return (
    <div>
      <PrincipalTitle>Proyecto FreeCodeCamp</PrincipalTitle>
      <a href="https://www.youtube.com/watch?v=6Jfk8ic3KVk&t=7094s">Ver Tutorial</a>
      <SelectProjects subProjects={subProjects} />
      <input
        type="number"
        min={1}
        max={subProjects.length}
        onChange={handleChange}
        value={opcion} />
        <div>
          { opcion == 1 ? <Testimonios /> : null}
          { opcion == 2 ? <ClickCounter /> : null}
          { opcion == 3 ? <Calculadora /> : null}
          { opcion == 4 ? <Access /> : null}
        </div>
    </div>
  )
}

export default FreeCodeCamp;