/*
    프롬프트 창에 숫자를 입력했을 때(isNaN()), 그 숫자를 함수로 넘겨주고, 
    함수에서는 숫자가 양수인지, 음수인지, 0인지 판단해서
    알림 창에 보여주는 프로그램을 작성하시오.

    50
    50은 양수입니다.

    0
    0은 0입니다.

    -20
    -20은 음수입니다.

*/
function isNumber(n) {
    if(n > 0)
        alert(`${n}은 양수입니다.`);
    else if (n < 0)
        alert(`${n}은 음수입니다.`);
    else
        alert(`${n}은 0입니다.`);
}

const number = parseInt(prompt("숫자를 입력하세요 : "))
if(!isNaN(number)) {    //숫자일 경우에만 실행
    isNumber(number);
}
