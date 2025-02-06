// 🎮 Función para mostrar una interfaz específica
function mostrarInterfaz(id) {
    document.querySelector(".container").classList.add("oculto"); 
    document.getElementById(`interfaz${id.charAt(0).toUpperCase() + id.slice(1)}`).classList.remove("oculto");
}

function mostrarInterfaz(id) {
    document.querySelector(".container").style.display = "none";
    document.getElementById(`interfaz${id.charAt(0).toUpperCase() + id.slice(1)}`).style.display = "block";
}

function volver() {
    document.querySelectorAll(".interfaz").forEach(interfaz => interfaz.style.display = "none");
    document.querySelector(".container").style.display = "block";
}