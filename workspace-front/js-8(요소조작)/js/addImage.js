const today = new Date()        // 현재 날짜와 시간 정보를 담은 객체 
const hrs = today.getHours()    // 현재 시간 중 시(hour) 정보를 가져옴 
const container = document.querySelector("#container")

let newImg = document.createElement("img")
newImg.src = (hrs < 11) ? "images/1.jpg" : "images/2.jpg"
container.appendChild(newImg)