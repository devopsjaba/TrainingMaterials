import { useState } from 'react'
import './App.css'
import Child from './Child'
import Child2 from './Child2'
import Child3 from './Child3'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <h2>App.jsx입니다.</h2>
      <Child p1="안녕 이제 3주 남았네요. 화이팅합시다!" />
      <Child2 p1="hi kosta" p2={100} p3="지금 리액트를 공부하고 있습니다."/>
      <Child3 p1="시간이 4달 한주가 금방 가네요"
              p2={200}
              p3="하루 하루 시간이 금입니다"
              person={{name: "이순신", age: 30}} />
    </>
  )
}

export default App
