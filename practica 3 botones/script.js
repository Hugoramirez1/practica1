// Función para mostrar el slider de volumen
function mostrarSlider() {
    // Oculta el contenedor inicial y muestra el contenedor de volumen
    document.getElementById('inicio-container').style.display = 'none';
    document.getElementById('volumen-container').style.display = 'block';
}

// Función para volver al botón inicial
function volver() {
    // Muestra el contenedor inicial y oculta el de volumen
    document.getElementById('inicio-container').style.display = 'block';
    document.getElementById('volumen-container').style.display = 'none';
}

// Función para actualizar el volumen del audio
document.getElementById('slider').addEventListener('input', function() {
    var volumen = this.value / 100;  // Convierte el valor del slider de 0 a 100 a un número entre 0 y 1
    var audio = document.getElementById('audio'); // Obtiene el elemento de audio

    audio.volume = volumen;  // Ajusta el volumen del audio
    document.getElementById('valor-volumen').textContent = this.value;  // Muestra el valor actual del volumen
});
