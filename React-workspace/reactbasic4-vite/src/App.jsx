import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import Form1 from "./Form1";
import Form2 from "./Form2";
import ConditionalRedering1 from "./ConditionalRendering1";
import ConditionalRendering2 from "./ConditionalRendering2";

function App() {
  const [count, setCount] = useState(0);

  const up = () => {
    //alert("up 함수 호출");
    setCount(count + 1)
  };

  const down = () => {
    setCount(count - 1)
  }

  return (
    <>
      <h1>React useState</h1>
      <h2>count 값: {count}</h2>
      <div className="card">
        <button onClick={up}>+</button>
        <button onClick={down}>-</button>
      </div>
      <Form1 />
      <Form2 />
      <ConditionalRedering1 />
      <ConditionalRendering2 />
    </>
  );
}

export default App;
