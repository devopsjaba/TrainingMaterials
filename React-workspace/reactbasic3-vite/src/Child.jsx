// function Child({ p1 }) {
//     return(
//         <>
//             <h2>Child.jsx입니다.</h2>
//             <h3>{p1}</h3>
//         </>
//     )
// }

function Child(props) {
    const p1 = props.p1
    return(
        <>
            <h2>Child.jsx입니다.</h2>
            <h3>{p1}</h3>
        </>
    )
}

export default Child