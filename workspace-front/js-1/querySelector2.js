const list = document.querySelector(".list");
const items = list.children;

console.log(items)
console.log(items[0])
console.log(items[1])
console.log(items[2])
console.log(items[3])

//부모 요소 선택하기
const item2 = document.querySelector(".item2")
console.log(item2.parentElement)

//형제 요소 선택하기
const item3 = document.querySelector(".item3")
console.log(item3.previousElementSibling)
console.log(item3.nextElementSibling)