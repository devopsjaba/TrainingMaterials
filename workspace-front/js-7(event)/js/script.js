//서브메뉴 링크 액션을 처리하는 함수
function handleMenuAction(event) {
    event.preventDefault()
    alert(`클릭한 링크 : ${event.target.textContent}`)
}

// 드롭다운 링크에 이벤트 리스너 할당
document.querySelectorAll('.dropdown-content a').forEach(item => {
    item.addEventListener('click', handleMenuAction, false)
})

window.addEventListener('click', function(event) {
    if(!event.target.matches('.dropbtn')) {
        let dropdowns = document.getElementsByClassName("dropdown-content")
        for(let i = 0; i < dropdowns.length; i++) {
            let openDropdown = dropdowns[i]
            if(openDropdown.style.display === 'block') {
                openDropdown.style.display = 'none'
            }
        }
    }

}, true)