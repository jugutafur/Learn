import styled from 'styled-components';

//Este coomponente se modifica los estilo por medio de sus props
//y se puede reutilizar en cualquier parte de la aplicacion
//Solo hay que importar el componente y usarlo
//Ademas se puede modificar su estilo por medio de props
//y se puede agregar funcionalidad por medio de eventos como onClick, onMouseOver, etc


//Se debe isntalar la dependencia styled-components
//npm install styled-components
//y luego importar styled from 'styled-components'

//Styled components es una libreria que permite escribir CSS en JS
//Style components crea componentes de React con estilos encapsulados
//que no afectan a otros componentes


//dentro del tempalte literal se agrega uan funcion flecha
//que recibe las props del componente
//y retorna un string con el estilo correspondiente
//En este caso si la prop primary es true el fondo sera azul
//si no sera gris
const StyleButton = styled.button`
	background-color: ${props => props.primary ? 'blue' : 'gray'};
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;

	&:hover {
			background-color: pink;
	}
`;

const Button = ({children, primary}) => {
	return (
		<StyleButton primary={primary}>{children}</StyleButton>
	)
}

export default Button;