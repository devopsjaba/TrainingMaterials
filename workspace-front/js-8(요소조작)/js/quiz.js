const title = document.querySelector("#title")
const author = document.querySelector("#author")
const save = document.querySelector("#save")
const aibooklist = document.querySelector("#aibooklist")

save.addEventListener("click", (e) => {
    e.preventDefault()

   const item = document.createElement("li")
   item.innerHTML = `
    ${title.value} - ${author.value}
    <span class="delBtn">삭제</span>               
   `
   aibooklist.appendChild(item)

   title.value = ""
   author.value = ""

    // 목록에서 제거하기
    const delBtns = document.querySelectorAll(".delBtn")

    for(let delBtn of delBtns) {
        delBtn.addEventListener("click", function() {
            let liList = this.parentNode
            liList.parentNode.removeChild(liList)
        })
    }   
   
})



