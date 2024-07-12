// .change_ 스타일 만들어 놓음

const button = document.querySelector("button")

// 1) 이미 만든 함수 연결함
/* function changeBackground() {
    document.body.style.backgroundColor = "green"
}
button.addEventListener("click", changeBackground) */

// 2) 익명 함수 
/* button.addEventListener("click", function() {
    document.body.style.backgroundColor = "green"
}) */

// 3) 화살표 함수(arrow function)
/* button.addEventListener("click" , () => {
    document.body.style.backgroundColor = "green"
}) */


button.addEventListener("click", function() {
    document.body.classList.toggle("change_")
})    

