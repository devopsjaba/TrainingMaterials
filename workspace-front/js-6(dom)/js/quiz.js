const a = document.querySelector("#number1")
const b = document.querySelector("#number2")
const button = document.querySelector("button")
let result = document.querySelector("#result")

button.onclick = function() {
  result.innerText = getGCD(a.value, b.value)
}


function getGCD(a, b) {
    let max = a > b ? a : b;
    let gcd = 0;
    for(let i = 1; i <= max; i++) { // 모든 i에 대해, i가 a와 b의 공통 약수인지 검사
        if (a % i === 0 && b % i === 0) { //a를 i로 나눈 나머지가 0임, 이는 i가 a의 약수임
            gcd = i;    // for 루트에서 더 큰 공약수를 찾을때마다 gcd 갱신됨
        }      
    }
    return gcd;   
}