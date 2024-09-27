import { useState } from "react"

function ConditionalRendering2() {

    const [isLogin, setIsLogin] = useState(false)

    return(
        <>
            <h2>조건부 랜더링2.jsx</h2>
            <button onClick={() => setIsLogin(!isLogin)}>{isLogin ? "Logout" : "Login"}</button>
        </>
    )
}

export default ConditionalRendering2