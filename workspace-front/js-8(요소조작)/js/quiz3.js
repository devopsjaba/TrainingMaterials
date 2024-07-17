/*
    - button, div

    - "알림 내용이 표시됩니다"

    - 웹 브라우저 창의 오른쪽 위에 (div)배치하고 새로운 요소를 연결함 
    - 버튼을 클릭하면 div 요소를 만들고 innerText 사용해서 내용을 추가함 
    - css 스타일 추가
    - 미리 만든 div와 새로 만든 div 요소를 연결함 
    - setTimeout() 메서들 사용해서 새로 만든 div 요소가 3초 후 자동으로 삭제되도록 함 

*/
const btn = document.querySelector("#btn")
const notiBox = document.querySelector("#noti-box")

btn.addEventListener("click", () => {
    const noti = document.createElement('div')
    noti.classList.add('noti')
    noti.innerText = "알림 내용이 표시됩니다"
    notiBox.appendChild(noti)

    setTimeout(() => {
        noti.remove()
    }, 3000)
})