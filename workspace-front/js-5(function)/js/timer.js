/* function greeting() {
    console.log("좋은 아침입니다.");
}

setInterval(greeting, 2000) */

/* setInterval(() => {
    console.log("좋은 아침입니다.");
}, 2000); */

let timer = setInterval(() => {
    console.log("좋은 아침입니다.");
}, 2000);

clearInterval(timer)
