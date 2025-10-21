import React from 'react';
import { useState } from 'react';
import { SecondaryTitle } from '../../../../components/text/Titles.jsx';

function Counter1 () {
	const [count, setCount] = useState(0);
	const increment = () => {
			setCount(count +1);
	}
	return (
		<div>
			<SecondaryTitle>Counter 1</SecondaryTitle>
			<p>Count : {count}</p>
			<button onClick={increment}>Increment</button>
		</div>
	);
}; 

export default Counter1;