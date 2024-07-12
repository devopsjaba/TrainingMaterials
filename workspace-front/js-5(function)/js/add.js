function calcSum() {        // 함수 선언 
    let sum = 0
    for(let i=1; i <= 10; i++)
        sum += i 

    console.log(`1부터 10까지 더하면 ${sum}입니다.`)
}

calcSum()       //함수 실행 



function sum(a, b) {
    let result = a + b 
    alert(`두 수의 합 : ${result}`)
}
sum(10, 20)



function calcSum(n) {        // 함수 선언 
    let sum = 0
    for(let i=1; i <= n; i++)
        sum += i 
    return sum
}
let num = parseInt(prompt("몇까지 더할까요?"))
document.write(`1부터 ${num}까지 더하면 ${calcSum(num)}입니다.`)

function multiple(a, b, c) {
    return a + b + c
}

console.log(multiple(2, 4, 8))
console.log(multiple(2, 4)) // c = undefined, 결과값 NaN 

// 매개변수의 기본값 지정 
function multiple2(a, b = 5, c = 10) {
    return a * b + c
}
console.log(multiple2(5, 10, 20))
console.log(multiple2(10, 20))      // c = 10(default)
console.log(multiple2(10))          // b = 5(default), c= 10(default)