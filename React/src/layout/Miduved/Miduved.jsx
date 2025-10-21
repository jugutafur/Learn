import { useState } from 'react'
import MiduvedComponent from '../../core/components/miduved/MiduvedComponent'
import { PrincipalTitle } from '../../components/text/Titles.jsx';

const Miduved = () => {
  return (
    <div>
      <PrincipalTitle>Proyecto Miduve</PrincipalTitle>
      <a href="https://www.youtube.com/watch?v=2qgs7buSnHQ&list=PLV8x_i1fqBw0B008sQn79YxCjkHJU84pC&index=3">Ver Tutorial</a>
      <MiduvedComponent />
    </div>

  )
}

export default Miduved;