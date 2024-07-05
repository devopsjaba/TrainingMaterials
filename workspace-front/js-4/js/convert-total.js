/*
    섭씨온도 = (화씨온도 - 32) / 1.8
*/

let fah = parseFloat(prompt("변환할 화씨온도 입력 : "))
let cel = ((fah - 32) / 1.8).toFixed(1)
alert(`화씨 ${fah}도는 섭씨 ${cel}도 입니다.`)