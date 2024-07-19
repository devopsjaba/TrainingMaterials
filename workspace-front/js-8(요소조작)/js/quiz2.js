const username = document.querySelector("#username")
const major = document.querySelector("#major")
const btn = document.querySelector("form > button")

/*
    -웹문서에 이미 <tbody> 태그가 만들어져 있음
    -새로운 tr 요소 생성
    -2개의 td 요소 생성
        - td 요소를 만들고, '이름'에 있는 값을 가져옴
        - td 요소를 만들고, '분야'에 있는 값을 가져옴 
    -2개의 td 요소를 tr 요소에 연결   
    - tr 요소를 tbody 요소에 연결      
*/
btn.addEventListener("click", (e) => {
    e.preventDefault()
    
    let tbody = document.querySelector("#attendant > tbody")
    let newTr = document.createElement("tr")

    // 첫번째 셀에 입력한 이름 
    let nameTd = document.createElement("td")
    nameTd.innerText = username.value 
    username.value =""

     // 두번째 셀에 입력한 분야 
     let majorTd = document.createElement("td") 
     majorTd.innerText = major.value  
     major.value = ""

     // 두 셀을 새줄에 추가하기 
     newTr.appendChild(nameTd)
     newTr.appendChild(majorTd)

     // 새 줄(행)을 tbody에 추가하기 
     tbody.appendChild(newTr)
})