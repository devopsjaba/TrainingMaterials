let button = document.querySelector("button")

button.addEventListener("click", () => {
    let tsNode = document.createElement("p")
    let tsTextNode = document.createTextNode("Typescript")
    tsNode.appendChild(tsTextNode)

    let basicNode = document.querySelectorAll("p")[2]
    document.body.insertBefore(tsNode, basicNode)
})