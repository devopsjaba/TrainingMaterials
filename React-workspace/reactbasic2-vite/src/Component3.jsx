function Component3() {
    const name = "이순신"
    const person = {
        name: "신사임당",
        age: 20,
        mobile: "010-1212-1356",
    }

    return (
        <>
            <h2>안녕하세요. Component3입니다.</h2>
            <h2>반갑습니다. {name} </h2>

            <h2>사람이름 : {person.name}</h2>
            <h2>사람나이 : {person.age}</h2>
            <h2>사람전화번호 : {person.mobile}</h2>
        </>
    )
}

export default Component3