const SelectProjects = ({ subProjects}) => {
	
	return (
		<div>
			<h1>Selección de Proyecto</h1>
      <ul>
        {
          subProjects.map((projectName, index) => {
            return <li key={index}>{index + 1}. {projectName}</li>
          })
        }
      </ul>
		</div>
	)
}

export default SelectProjects;