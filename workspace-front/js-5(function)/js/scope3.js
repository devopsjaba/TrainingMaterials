const factor = 5 

{
    //const num = 10;     //블록 스코프
    let result = calc(10)
    document.write(`결과 :  ${result}`)
}

function calc(num) {
    return num * factor
}