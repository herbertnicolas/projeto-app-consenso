const url = "localhost:8080/usuarios"

// form.addEventListener("submit", (e) => {
//     e.preventDefault()
// })
console.log("TESTE")

fetch(url)
        .then((res) => res.json())
        .then((data) => console.log(data))
        .catch((error) => console.log("ERROR"));

function sendToBack() {
    
}
