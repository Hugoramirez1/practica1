// Función para mostrar el slider de volumen
function mostrarSlider() {
    // Oculta el contenedor inicial y muestra el contenedor de volumen
    document.getElementById('inicio-container').style.display = 'none';
    document.getElementById('volumen-container').style.display = 'block';
}
function mostrarSlider2() {
    // Oculta el contenedor inicial y muestra el contenedor de opciones
    document.getElementById('inicio-container').style.display = 'none';
    document.getElementById('opciones-container').style.display = 'block';
}
function reproducirVideo() {
    document.getElementById('video-container').style.display = 'block'; // Obtiene el elemento de video
    video.play();

    // Poner el video en pantalla completa
    if (video.requestFullscreen) {
        video.requestFullscreen();  // Para navegadores modernos
    } else if (video.mozRequestFullScreen) {
        video.mozRequestFullScreen();  // Para Firefox
    } else if (video.webkitRequestFullscreen) {
        video.webkitRequestFullscreen();  // Para Chrome, Safari y Opera
    } else if (video.msRequestFullscreen) {
        video.msRequestFullscreen();  // Para Internet Explorer/Edge
    }
}
// Función para volver al botón inicial
function volver() {
    // Muestra el contenedor inicial y oculta los demas
    document.getElementById('inicio-container').style.display = 'block';
    document.getElementById('volumen-container').style.display = 'none';
    document.getElementById('opciones-container').style.display = 'none';
    document.getElementById('video-container').style.display = 'none';

}

// Función para actualizar el volumen del audio
document.getElementById('slider').addEventListener('input', function () {
    var volumen = this.value / 100;  // Convierte el valor del slider de 0 a 100 a un número entre 0 y 1
    var audio = document.getElementById('audio'); // Obtiene el elemento de audio

    audio.volume = volumen;  // Ajusta el volumen del audio
    document.getElementById('valor-volumen').textContent = this.value;  // Muestra el valor actual del volumen
});
