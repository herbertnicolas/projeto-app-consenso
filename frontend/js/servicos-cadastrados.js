const id = localStorage.getItem("id")


document.addEventListener('DOMContentLoaded', () => {
        
    fetch("http://localhost:8080/servicos", {
        method: "GET",
        headers: {
            "Content-Type": "application/json",
        },
    })
    .then((response) => response.json())
    .then((data) => {
        
        for (let index = 0; index < data.length; index++) {
            console.log(data[index].usuario.idUsuario)
            console.log(id)
            if(data[index].usuario.idUsuario == id){
                const nome = data[index].nome
                const idServico = data[index].idServico

                displayNone()
                creatDiv(nome,idServico)
            }
        }

    })
    .catch((error) => {
        console.error("Error:", error);
    }); 

})

function creatDiv(nome,id) {

    //criando paragrafo  ---paragrafo 1 (Instalação)--- 
    const divNew = document.createElement("div")
    const paragrafo1 = document.createElement("p")
    const strong1 = document.createElement("strong")
    const a1 = document.createElement("a")
    const img1 = document.createElement("img")
    const texto1 = document.createTextNode(nome)
    const a2 = document.createElement("a")
    const img2 = document.createElement("img")
    


    
    //logica --- paragrafo1 (Instalação) ---
    divNew.className = "alert alert-success div-agendamento"
    a1.href = "../index.html"
    a2.href="../pages/servicos-cadastrados.html"
    strong1.className = "a1"
    img1.className = "a1-img"
    img1.src = "../img/edit_square_FILL0_wght400_GRAD0_opsz48.png"
    img2.className = "a2-img"
    img2.src = "../img/delete_FILL0_wght400_GRAD0_opsz48.png"
    divNew.id = id
    img2.onclick = deletaItem(divNew)
    
    
    //appende ---instalação---
    strong1.appendChild(texto1)
    a1.appendChild(img1)
    a2.appendChild(img2)
    paragrafo1.appendChild(strong1)
    paragrafo1.appendChild(a1)
    paragrafo1.appendChild(a2)
    


    
    //append ---div---
    divNew.appendChild(paragrafo1)
    


    
    
    //    paragrafro ---istalação---
    document.getElementById("div-p").appendChild(divNew)
}

function displayNone(){

    const divDisplay = document.getElementById("div-p-alert")
    
    divDisplay.className = "display"
}

function deletaItem(divNew){
    // const idServico = divNew.id
    console.log("id serv: " + divNew.id)
    fetch(`http://localhost:8080/servicos/${divNew.id}`, {
        method: "DELETE",
        headers: {
            "Content-Type": "application/json",
        },
    })
    .then((response) => response.json())
    .then((data) => { 
        
    })
    .catch((error) => {
        console.error("Error:", error);
    }); 
}