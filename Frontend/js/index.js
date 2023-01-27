document.addEventListener('DOMContentLoaded', () => {
    const div1 = document.getElementById("div-p")
    const i = 1

    // const array = [1, 2, 3]

    // array.map((elemento, index) => {
    //     return (<h1 key={index}>{elemento}</h1>)
    // })


    if (i == 1) {
        


    //paragrafo ---Instalação--- 
        const divNew = document.createElement("div")
        const paragrafo1 = document.createElement("p")
        const strong1 = document.createElement("strong")
        const a1 = document.createElement("a")
        const img1 = document.createElement("img")
        const texto1 = document.createTextNode("Instalação")
        const a2 = document.createElement("a")
        const img2 = document.createElement("img")


    //paragrafo ---Prestador---
        const paragrafo3 = document.createElement("p")
        const strong3 = document.createElement("strong")
        const texto3 = document.createTextNode("Prestador:" + "")



        //logica --- paragrafo1 ---
        divNew.className = "alert alert-success div-agendamento"
        a1.href = "index.html"
        strong1.className = "a1"
        img1.className = "a1-img"
        img1.src = "img/edit_square_FILL0_wght400_GRAD0_opsz48.png"
        img2.className = "a2-img"
        img2.src = "img/delete_FILL0_wght400_GRAD0_opsz48.png"

        strong1.appendChild(texto1)
        a1.appendChild(img1)
        a1.appendChild(img2)
        paragrafo1.appendChild(strong1)
        paragrafo1.appendChild(a1)
        divNew.appendChild(paragrafo1)




        //    paragrafro ---istalação---
        document.getElementById("agenda").appendChild(divNew)

    }


    // adicionando o background dos meus agendamentos
    // function adicionandoBg(c,d,h,){

    //     const client = c
    //     const data = d
    //     const hora = h

    //     const j = document.createElement("div")
    //     const p = document.createElement("p")
    //     const s = document.createElement("strong")
    //     const a = document.createElement("a")
    //     const i = document.createElement("img")
    //     const t = document.createTextNode("Instalação")

    //     j.className = "alert alert-success div-agendamento"
    //     a.href = "index.html"
    //     i.className = "a1-img"
    //     i.src = "img/edit_square_FILL0_wght400_GRAD0_opsz48.png"

    //     s.appendChild(t)
    //     a.appendChild(i)
    //     p.appendChild(s)
    //     p.appendChild(a)
    //     j.appendChild(p)




    // }   
})