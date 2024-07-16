const btn = document.querySelector("button")    //버튼 요소 가져옴

btn.onclick = function() {
    document.body.classList.toggle("dark")   //버튼 클릭할 때마다 .dark 스타일 토클
}