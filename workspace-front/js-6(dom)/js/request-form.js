const selectMenu = document.querySelector("#major") // 선택 목록을 가져옴 

function showSelect() {
    let selectedText 
        = selectMenu.options[selectMenu.selectedIndex].innerText
    alert(`[${selectedText}]를 선택했습니다.`)    
}

selectMenu.onchange = showSelect