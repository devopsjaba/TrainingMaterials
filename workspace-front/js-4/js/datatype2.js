let userInput = prompt("아무 숫자나 입력하세요: ")
console.log(typeof(userInput))

userInput1 = userInput * 10      // 1000
console.log(userInput1)
console.log(typeof(userInput1))
console.log(typeof(userInput))
console.log(typeof(parseInt(userInput)))

let userInput2 = prompt("현재 체온은 ? : ")
console.log(typeof(parseFloat(userInput2)))         // 36.5

let num = 10            // 원래 값 숫자형
let isEmpty = true      // 원래 값 논리형 
num.toString()          // '10'   10진수 문자열 
num.toString(2)         //  '10'   2진수 문자열
isEmpty.toString()      // 'true'

let isFull = false      // 원래 값 논리형
let initValue = null    // 원래 값 null형
console.log(typeof(String(isFull)))     // 'false'
console.log(typeof(String(initValue)))  // 'null' 

console.log(typeof(Boolean(5 * 4)))                     // true
console.log(typeof(Boolean("Hi, nice meet you")))       // true 
console.log(typeof(Boolean(undefined)))                 // false
