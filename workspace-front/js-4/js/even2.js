// 입력한 숫자가 모두 짝수인지 체크하시오.
// 두수 모두 짝수입니다 / 짝수가 아닌 수가 있습니다.

const num1 = parseInt(prompt("첫번째 양의 정수 : "))
const num2 = parseInt(prompt("두번째 양의 정수 : "))
let str;

if(num1 % 2 == 0 && num2 % 2 == 0) {
    str = "두수 모두 짝수입니다"
} else {
    str = "짝수가 아닌 수가 있습니다."
}
alert(str)