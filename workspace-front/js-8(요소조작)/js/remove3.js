const pspan = document.querySelectorAll("p > span")   // 모든 삭제버튼을 가져옴 

for(let span_ of pspan) {
    span_.addEventListener("click", function() {        // 항목 클릭시 실행하는 함수
        this.parentNode.remove(this)                    // 부모노드에서 삭제함 
    })
}