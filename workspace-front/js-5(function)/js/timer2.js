let counter = 0;

let timer = setInterval(() => {
    console.log("좋은 오후입니다.")
    counter++;      //인사말 표시 횟수 1 증가
    if (counter == 5)   // 타이머 종료함
        clearInterval(timer);
}, 2000)