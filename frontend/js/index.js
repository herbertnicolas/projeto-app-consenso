const url = "https://08da-2804-7f7-d584-4c52-2542-50fb-287e-7bdc.sa.ngrok.io"

form.addEventListener("submit", (e) => {
    e.preventDefault()
})

function sendToBack() {
    console.log("TESTE")
    fetch(url)
        .then((res) => res.json())
        .then((data) => console.log(data))
        .catch((error) => console.log("ERROR"));
}
