const button = document.querySelector("#btn")

button.addEventListener("click", () => {
    //텍스트 상자의 내용
    const word = document.querySelector("#word").value  
    //결과값 표시할 영역
    const result = document.querySelector("#result")
    //문자열의 길이
    let count = word.length
    //결과값 표시
    result.innerText = `${count}`
})