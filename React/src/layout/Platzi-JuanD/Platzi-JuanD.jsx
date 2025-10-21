
import { useState } from "react";
import React from "react";
import { ToDoCounter } from "./../../core/components/platzi-JuanD/ToDoCounter/ToDoCounter.jsx";
import { ToDoSearch } from "./../../core/components/platzi-JuanD/ToDoSearch/ToDoSearch";
import { CreateToDoButton } from "./../../core/components/platzi-JuanD/CreateToDoButton/CreateToDoButton";
import { ToDoItem } from "./../../core/components/platzi-JuanD/ToDoItem/ToDoItem";
import { TodoList } from "./../../core/components/platzi-JuanD/TodoList/TodoList";
import { useLocalStorage } from './../../core/components/platzi-JuanD/hocks/useLocalStorage.jsx'
import { ItemsLoading } from "./../../core/components/platzi-JuanD/Stateloadings/ItemsLoading/ItemsLoading.jsx";
import { ItemsError } from "./../../core/components/platzi-JuanD/Stateloadings/ItemsError/ItemsError.jsx";
import { AddNewItems } from "./../../core/components/platzi-JuanD/Stateloadings/AddNewItems/AddNewItems.jsx";


const PlatziJuanD = () => {
  const {
    item: toDo,
    saveItem,
    loading,
    error,
  } = useLocalStorage("MisToDos_V1", []);
  //const [toDo, setToDo] = React.useState(parsedToDos);
  const [searchValue, setSearchValue] = React.useState("");
  const totalToDo = toDo.length;
  //const toDoCompleted = toDo.filter(todo=> todo.completed == true).length;   //otra forma
  const toDoCompleted = toDo.filter((todo) => !!todo.completed).length; //!!Doble negacion

  const searchToDos = toDo.filter((toDo) => {
    const todoText = toDo.text.toLowerCase();
    const searchText = searchValue.toLowerCase();
    return todoText.includes(searchText);
  });

  //marcar tarea como completada
  const completedToDo = (text) => {
    const newToDos = [...toDo]; //Con los ... creo una copia
    const toDoIndex = newToDos.findIndex((todo) => todo.text === text);
    newToDos[toDoIndex].completed = true;
    saveItem(newToDos);
  };

  //Eliminar tarea
  const deleteToDo = (text) => {
    const newToDos = [...toDo]; //Con los ... creo una copia
    const toDoIndex = newToDos.findIndex((todo) => todo.text === text);
    newToDos.splice(toDoIndex, 1);
    saveItem(newToDos);
  };

  return (
    <>
    <h1>Proyecto de Platzi-JuanD</h1>
      <ToDoCounter totalToDo={totalToDo} toDoCompleted={toDoCompleted} />
      <ToDoSearch searchValue={searchValue} setSearchValue={setSearchValue} />
      <TodoList>
        {loading && <ItemsLoading />}
        {error && <ItemsError />}
        {!loading && searchToDos.length == 0 && <AddNewItems />}
        {searchToDos.map((todo) => (
          <ToDoItem
            key={todo.text} // Esto es necesario y lo usa como un identificador unico por cada elemento en este caso usamos la propieda text Ya que seria logico PENSAR que cada Todo es unico y que no se va a repetir
            text={todo.text}
            completed={todo.completed}
            onComplete={() => completedToDo(todo.text)}
            onDelete={() => deleteToDo(todo.text)}
          />
        ))}
      </TodoList>
      <CreateToDoButton />
    </>
  );
}


export default PlatziJuanD;