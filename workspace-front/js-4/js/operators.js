console.log(3 == "3")
console.log(3 != "3")

console.log(3 === "3")
console.log(3 !== "3")

let x = 10
if (x > 5) {
    console.log("x는 5보다 큽니다")
}

let userInput = prompt("이름을 입력하세요: ")
/* if(userInput == null) {
    alert("취소했습니다.")
} else {
    alert(userInput)
} */
if(userInput !== null) {
    alert(userInput)
}

let score = prompt("프로그래밍 점수 : ")
if (score != null) {
    if(parseInt(score) >= 90) {
        alert("A 학점")
    } else if (parseInt(score) >= 80) {
        alert("B 학점")
    } else {
        alert("C 학점")
    }
}
