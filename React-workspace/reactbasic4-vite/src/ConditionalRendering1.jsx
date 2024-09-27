function ConditionalRedering1() {
    const condition = false


    return(
        <>
            <h2>조건부 랜더링1.jsx</h2>
            {condition ? <h2>참</h2> : <h2>거짓</h2>}
        </>
    )
}

export default ConditionalRedering1