const title = document.querySelector("#title"); // 제목 부분을 가져옴
const userName = document.querySelector("#desc p"); // 이름 부분을 가져옴
const pImage = document.querySelector("#profile img"); // 이미지 부분을 가져옴

title.onclick = () => title.innerText = "프로필";
userName.onclick = () => userName.innerHTML = `이름 : <b>신사임당</b>`;
pImage.onclick = () => pImage.src = "images/person2.png";
