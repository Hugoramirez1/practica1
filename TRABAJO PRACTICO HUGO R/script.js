
function mostrarBoton() {  // Oculta el contenedor inicio y muestra el contenedor de creditos

    document.getElementById('inicio-container').style.display = 'none';
    document.getElementById('creditos-container').style.display = 'block';
}
function mostrarBoton2() { // Oculta el contenedor inicial y muestra el contenedor de opciones

    document.getElementById('inicio-container').style.display = 'none';
    document.getElementById('opciones-container').style.display = 'block';
}
function reproducirVideo() {  // Reproduce el video

    document.getElementById('video-container').style.display = 'block';
    video.play();

    // Video en pantalla completa
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
function volver() {  // Botón para VOLVER a opciones de inicio
    // Muestra el contenedor inicial y oculta los demas
    document.getElementById('inicio-container').style.display = 'block';
    document.getElementById('creditos-container').style.display = 'none';
    document.getElementById('opciones-container').style.display = 'none';
    document.getElementById('video-container').style.display = 'none';

}