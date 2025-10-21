import React, {useState} from 'react';
import { SecondaryTitle } from '../../../../components/text/Titles.jsx';

const useCounter2 = ()=> {
	const [counter, setCounter] = useState(0);

	const incrementar = () => setCounter(counter+1);
	const decrementar = () => setCounter(counter-1);
	const reset = () => setCounter(0);

	return {
		counter,
		incrementar,
		decrementar,
		reset
	}
}

function Counter2(){
	const {counter, incrementar, decrementar, reset } = useCounter2();
	return (
		<div>
			<SecondaryTitle>Counter 2</SecondaryTitle>
			<h2>{counter}</h2>
			<button onClick={incrementar}>+</button>
			<button onClick={decrementar}>-</button>
			<button onClick={reset}>reset</button>
		</div>
	);
};

export default Counter2;