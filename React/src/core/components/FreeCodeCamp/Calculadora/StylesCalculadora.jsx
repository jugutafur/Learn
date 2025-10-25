import styled from "styled-components";

export const StyleCalculadora = styled.div`
  background-color: red;
	border-radius: 20px;
	margin: 10px;
	border: 5px solid white;
	padding: 5px;
`;

export const Pantallas = styled.div`
  display: flex;               /* 🔥 necesario para que justify-content funcione */
  justify-content: flex-end;   /* 👉 alinea el texto a la derecha */
  align-items: center;         /* 👉 centra verticalmente */
  background-color: black;
  height: 83px;
  font-weight: bold;
  font-size: 38px;
  color: white;
  padding: 0 20px;             /* 🧱 espacio interno para que el texto no pegue al borde */
  border-radius: 20px;         /* opcional: para un look más suave */
	box-shadow: -1px 4px 1px 1px rgb(180, 180, 180);
	margin: 15px;
`;

export const botonCalculadora = styled.div`
	background-color: yeloow;
`;