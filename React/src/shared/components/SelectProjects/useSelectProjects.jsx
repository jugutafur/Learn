import { useState } from "react";

function useSelectProjects(initialValue = 1) {
  const [opcion, setOpcion] = useState(initialValue);

  const handleChange = (e) => {
    setOpcion(Number(e.target.value));
  };

return { opcion, handleChange };
}

export default useSelectProjects;