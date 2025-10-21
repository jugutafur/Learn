import { useState } from "react"

function CounterTafur(initialValue = 0) {
  const [count, setCount] = useState(initialValue);

  const increment = () => setCount(previousValue => previousValue + 1)
  const decrement = () => setCount(previousValue => previousValue - 1)
  const reset = () => setCount(initialValue)

  return {
    count,
    increment,
    decrement,
    reset,
  }
}

export default CounterTafur