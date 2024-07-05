const box = document.querySelector("#box")

box.addEventListener("mouseenter", () => {
    box.style.backgroundColor = "hotpink"
})

box.addEventListener("mouseleave", () => {
    box.style.backgroundColor = "aqua"
})

