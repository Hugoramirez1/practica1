// Función para mostrar una interfaz específica
function mostrarInterfaz(id) {
    // Ocultar todas las interfaces
    var interfaces = document.querySelectorAll(".interfaz");
    interfaces.forEach(function(interfaz) {
        interfaz.style.display = "none"; // Ocultamos todas las interfaces
    });

    // Mostrar la interfaz seleccionada
    document.getElementById(`interfaz${id.charAt(0).toUpperCase() + id.slice(1)}`).style.display = "block";
}

// Función para volver a la interfaz principal
function volver() {
    document.getElementById("interfazVolumen").style.display = "none"; // Ocultar Volumen
    document.getElementById("interfazOpciones").style.display = "none"; // Ocultar Opciones
    document.getElementById("interfazJuego").style.display = "none"; // Ocultar Juego
    document.querySelector(".container").style.display = "block"; // Mostrar Interfaz Principal
}
