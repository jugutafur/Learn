import Testimonio from './Testimonio';
import { SecondaryTitle } from '../../../../components/text/Titles.jsx';

const Testimonios = () => {
  const participantes = [
    { 
      key: 1,
      name: 'Shawn Wang',
      city: 'Singapore',
      imagen: 'Uno',
      company: 'Amazon',
      profession: 'Software Engineer',
      testimonio: 'Its scary to change careers. I only gained confidence that I could code by working through the hundreds of hours of free lessons on freeCodeCamp. Within a year I had a six-figure job as a Software Engineer. freeCodeCamp changed my life.'
    },
    { 
      key: 2,
      name: 'Sarah Chima',
      city: 'Nigeria',
      imagen: 'Dos',
      company: 'ChatDesk',
      profession: 'Software Engineer',
      testimonio: 'freeCodeCamp was the gateway to my career as a software developer. The well-structured curriculum took my coding knowledge from a total beginner level to a very confident level. It was everything I needed to land my first dev job at an amazing company.'
    },
    { 
      key: 3,
      name: 'Emma Bostian',
      city: 'Sweden',
      imagen: 'Tres',
      company: 'Spotify',
      profession: 'Software Engineer',
      testimonio: 'Ive always struggled with learning JavaScript. Ive taken many courses but freeCodeCamps course was the one which stuck. Studying JavaScript as well as data structures and algorithms on freeCodeCamp gave me the skills and confidence I needed to land my dream job as a software engineer at Spotify.'
    }
  ];

	return (
    <div>
      <SecondaryTitle>Esto es lo que dicen nuestros alumnos sobre FreeCodeCamp:</SecondaryTitle>
      <div style={{backgroundColor: "orange", display: "grid", gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr)", gap: "20px"}}>
        {
          participantes.map(participante => (
            <Testimonio
              key={participante.key}
              name={participante.name}
              city={participante.city}
              imagen={participante.imagen}
              profession={participante.profession}
              company={participante.company}
              testimonio={participante.testimonio}
            />
          ))
        }
      </div>
    </div>
	)
}

export default Testimonios;