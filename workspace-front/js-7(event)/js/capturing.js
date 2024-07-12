// 모든 요소를 가져와 elements에 저장 
const elements = document.querySelectorAll('*')

for(let element of elements) {
    element.addEventListener("click", e => {
        console.log(`event.target : ${e.target.tagName}, event.currentTarget : ${e.currentTarget.tagName}`)
    }, true)
}