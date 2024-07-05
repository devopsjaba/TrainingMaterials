let box 
let currentBoxPosition = 100
let numberOfStep = 10
let direction = 'yes'

function boxMove() {
    numberOfStep = prompt('얼마를 이동할까요?')
    direction = prompt('왼쪽으로 이동할까요?')

    let moveStep = 1
    if(direction === 'yes') {
        while(moveStep <= numberOfStep) {
            box.style.left = (currentBoxPosition - moveStep) + 'px'
            moveStep++
        }
        currentBoxPosition = currentBoxPosition - moveStep
    } else {
        while(moveStep <= numberOfStep) {
            box.style.left = (currentBoxPosition + moveStep) + 'px'
            moveStep++
        }
        currentBoxPosition = currentBoxPosition + moveStep       
    }
}

function main() {
    box = document.querySelector('#box')
    box.style.left = currentBoxPosition + 'px'
    box.addEventListener('click', boxMove)
}

document.addEventListener('DOMContentLoaded', main)