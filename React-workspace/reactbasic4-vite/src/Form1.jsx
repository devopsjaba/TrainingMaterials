import { useState } from "react"

function Form1() {
    const [name, setName] = useState("")
    const [age, setAge] = useState(0)

    const inputName = (e) => {
        console.log(e.target.value)
        setName(e.target.value) 
    }


    return(
        <>
            <h2>폼1.jsx</h2>
            이름 : <input type="text" value={name} onChange={inputName} />
            <br />
            나이 : <input type="text" value={age} onChange={(e) => {setAge(Number(e.target.value))}} ></input>
        </>
    )
}

export default Form1
