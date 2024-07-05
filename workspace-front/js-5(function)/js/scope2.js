var hi = "좋은 아침"    //전역 변수 

function greeting() {
    console.log(hi)
}

greeting()

function change() {
    hi = "좋은 오후"
}

change()
console.log(hi)