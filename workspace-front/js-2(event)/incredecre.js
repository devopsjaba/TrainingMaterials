const increase = document.querySelector(".increase")
const decrease = document.querySelector(".decrease")
let num = 0

//increase 클릭할때마다 1 증가하기
increase.addEventListener("click", e=>{
    e.preventDefault()
    //num값 1씩 증가
    num+=3
    console.log(num)
})

//increase 클릭할때마다 1 감소하기
decrease.addEventListener("click", e=>{
    e.preventDefault()
    //num값 1씩 감소
    num-=3
    console.log(num)
})