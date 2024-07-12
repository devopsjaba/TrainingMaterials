/* 요소를 1개 선택하고 변수를 만들어서 저장 
const frame = document.querySelector("#wrap");
console.log(frame)*/

/* 클래스명이 box1인 요소 선택하기  
const box1 = document.querySelector("#wrap .box1");
console.log(box1);*/

/* 요소를 여러 개 선택하기 */
const items = document.querySelectorAll("#wrap article");
// console.log(items)
/* 
for(let item of items) {
   console.log(item); 
}
 */

for(let i=0; i<items.length; i++) {
    console.log(items[i])
}


