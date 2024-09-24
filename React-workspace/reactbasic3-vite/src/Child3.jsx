// function Child3({ p1, p2, p3, person }) {
//     return(
//         <>
//             <h2>Child3.jsx입니다.</h2>
//              <h3>{p1}</h3>
//              <h3>{p2}</h3>
//              <h3>{p3}</h3> 
//              <h2>이름 : {person.name}</h2>           
//              <h2>이름 : {person.age}</h2>       
//         </>
//     )
// }

function Child3(props) {
    return(
        <>
            <h2>Child3.jsx입니다.</h2>
             <h3>{props.p1}</h3>
             <h3>{props.p2}</h3>
             <h3>{props.p3}</h3> 
             <h2>이름 : {props.person.name}</h2>           
             <h2>이름 : {props.person.age}</h2>       
        </>
    )
}

export default Child3