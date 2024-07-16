const container = document.querySelector("#container")  //캐러셀 영역
const pics 
    = ["pic-1.jpg", "pic-2.jpg", "pic-3.jpg", "pic-4.jpg", "pic-5.jpg", "pic-6.jpg"]

container.style.backgroundImage = `url(images/${pics[0]})`    

const arrows = document.querySelectorAll(".arrow")      //화살표
let i = 0;      //배열 인덱스 

arrows.forEach( arrow => {
    arrow.addEventListener("click", (e) => {
        if(e.target.id === "left") {                    //왼쪽 화살표를 클릭한 경우
            i--;                                        //이전 이미지로 이동
            if(i<0) {                                   //첫번째 이미지인 경우
               i = pics.length - 1;                     //마지막 이미지로 이동 
            }
        }
        else if(e.target.id === "right") {              //오른쪽 화살표를 클릭한 경우
            i++;                                        //다음 이미지로 이동
            if(i >= pics.length) {                      //마지막 이미지인 경우 
                i = 0;                                  //첫 번째 이미지로 이동                     
            }
        }
        container.style.backgroundImage = `url(images/${pics[i]})`   //현재 이미지 표시 
    })
})

window.addEventListener("contextmenu", e => {
    e.preventDefault()
    alert("오른쪽 버튼을 사용할 수 없습니다.")
})