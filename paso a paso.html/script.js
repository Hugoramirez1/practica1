// 📌 Función que se ejecuta cuando se presiona el botón principal
function mostrarBoton() {
    let botonOculto = document.getElementById("btnOculto"); 

    // 🔄 Alterna la visibilidad del botón oculto
    if (botonOculto.style.display === "none" || botonOculto.style.display === "") {
        botonOculto.style.display = "block"; 
    } else {
        botonOculto.style.display = "none"; 
    }
}

// 📌 Función que se ejecuta cuando se presiona el botón secundario
function accionSecundaria() {
    alert("¡Me has encontrado! 😃");
}
