function addNum(...numbers) {
    let sum = 0;
    for(let number of numbers)
        sum += number;
    return sum;
}

console.log(addNum(1,3))
console.log(addNum(1,3,5,7)) //인수의 개수와 상관없이 숫자를 더함 