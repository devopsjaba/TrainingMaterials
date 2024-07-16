const items = document.querySelectorAll("li")   //모든 항목 가져오기 

for(let item of items) {
    item.addEventListener("click", function() {
        this.parentNode.removeChild(this)       // 부모노드에서 삭제
    })
}

// 화살표 함수에서 사용한 this는 window 객체를 가리킴 
// for(let item of items) {
//     item.addEventListener("click", () => {
//         this.parentNode.removeChild(this)       // 부모노드에서 삭제
//     })
// }