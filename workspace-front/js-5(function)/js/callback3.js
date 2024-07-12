//3) userName, age 인수로 넘김 
function showData(name, age) {
    alert(`안녕하세요. ${name}님, 나이가 ${age}살이군요.`)
}

//2)
function getData(callback) {
    let userName = prompt("이름을 입력하세요: ")
    let age = prompt("나이를 입력하세요: ")
    callback(userName, age)
}

//1) 콜백함수를 인수로 넘김
getData(showData)