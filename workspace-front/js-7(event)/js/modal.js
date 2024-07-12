const open = document.querySelector("#open")
const modalBox = document.querySelector("#modal-box")
const close = document.querySelector("#close")

open.addEventListener("click", () => {
    // 클릭하면 classList에 .active 스타일 추가 
    modalBox.classList.add("active")
})

close.addEventListener("click", () => {
    // 클릭하면 classList에 .active 스타일 제거 
    modalBox.classList.remove("active")    
})

