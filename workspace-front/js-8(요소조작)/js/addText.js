const orderButton = document.querySelector("#order")      //버튼
const orderInfo = document.querySelector("#orderInfo")    //주문 생산 영역
const define = document.querySelector("#container > h2")  //주문 정의 요소  

orderButton.addEventListener("click", () => {
    let newP = document.createElement("p")                      // 새로운 p 요소 노드 만듦
    let textNode = document.createTextNode(define.innerText)    // 텍스트 노드 만듦
    newP.appendChild(textNode)          // 텍스트 노드를 p 요소 노드에 추가함  
    newP.style.fontSize = "0.8em"
    newP.style.color = "blue"
    orderInfo.appendChild(newP)         // p 요소를 orderInfo에 추가함
}, { once : true})