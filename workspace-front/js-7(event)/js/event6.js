/*
    버튼 클릭했을 때 문서의 배경색(#222), 글자색(#fff)로 변경하시오.
*/
const button = document.querySelector("button")

button.onclick = function() {
    document.body.style.backgroundColor = "#222"
    document.body.style.color = "#fff"
}