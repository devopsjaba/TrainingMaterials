let data = 5
console.log(typeof(data))
console.log(typeof(3.145))

console.log(typeof("10"))
console.log(typeof("좋은 아침입니다."))
console.log(typeof(""))     // 빈 문자열 

let name = "도레미"
let classroom = 200
//console.log(name +"님, " + classroom + "호 강의실로 입실하세요.")
console.log(
        `${name}님,
         ${classroom} 호 강의실로 입실하세요.`
    )

console.log(10 > 2)

let userName
console.log(userName)

let proBaseStadium = {
    name : "라이온스파크",
    date : "2024-07-03",
    customers : 20000,
    finished : true 
}

proBaseStadium = {name : "라이온스파크2", date : "2024-07-04", customers : 20000, finished : false}
console.log(proBaseStadium)

console.log(proBaseStadium.name)
console.log(proBaseStadium["finished"])

emptyArr = []       //빈 배열
colors = ["red", "blue", "green"]   //문자열 배열
arr = [10, "banana", true]          //여러 자료형으로 구성된 배열
console.log(arr)
console.log(arr[2])                 //인덱스는 0부터 시작됨 
console.log(arr.length)             //length 프로퍼티 제공

let one = "20"      //문자열
let two = 10        //숫자형

let result = one + two      //"2010"
console.log(result)

result = one - two          //10
console.log(result)         //뺄셈, 곱셈, 나누기는 숫자끼리만 문자열을 숫자로 바꿔서 인식함

console.log(Number(true))                //1
console.log(Number("20"))                //20
console.log(Number("Hi?"))              // 변환 규칙에 해당안됨