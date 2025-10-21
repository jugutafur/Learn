import { useState } from "react";

const Counter = () => {
    const [count, setCount]= useState(3);

    return (
        <div>
            <h2>Contador: {count}</h2>
            <button onClick={() => setCount(count + 1)}>Incrementar</button>
            <button onClick={() => setCount(count - 1)}>Decrementar</button>
        </div>
    )
}

export default Counter;