// 버튼 요소를 가져옴 
const btn1 = document.querySelector("button");

function display() {
    alert("클릭했습니다.");
}

// 버튼을 클릭하면 display 함수를 실행함
btn1.addEventListener("click", display);