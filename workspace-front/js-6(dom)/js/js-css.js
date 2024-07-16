const title = document.querySelector("#title")  //#title 요소를 가져옴
const userName = document.querySelector("#desc p") 

title.onclick = () => {
    title.style.backgroundColor = "black"   //title 요소의 배경색 수정함 
    title.style.color = "white"         //title 요소의 글자색 수정함 
}

userName.onclick = () => {
    userName.style.color = "red"
}