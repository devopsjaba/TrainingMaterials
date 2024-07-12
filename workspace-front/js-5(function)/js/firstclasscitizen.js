let init = () => {
    return function(a, b) {
        return a - b > 0 ? a - b : b - a;
    }
}
// 소괄호를 추가해 반환된 함수 실행하기 
console.log(`init(20,10) : ${init()(10,20)}`)