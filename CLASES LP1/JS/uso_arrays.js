// zona segura
document.addEventListener("DOMContentLoaded", function(){
    const frutas = ["pomelo", "naranja"];
    const verduras = ["locote"];

    const vero = {
        nombre: "Veronica Belen"
        , apellido: "Vera Irala"
        , edad: null
    };
    const ale = {
        nombre: "Alexis"
        , apellido: "Aguilera"
        , edad: 29
    };
    const george = {
        nombre: "Jorge"
        , apellido: "Acuña"
        , edad: 28
    };

    // estaba muy loco ese día
    vero.edad = calcularEdad("1991/05/09");

    const personas = [vero, ale];
    console.log(personas);
    personas.push(george);
    console.log(personas);

    // length es el numero de elementos
    // para encontrar un elemento conocido
    // se usa la []
    console.log(frutas);
    console.log(frutas.length);
    console.log(frutas[frutas.length -1]);
    frutas.push("piña");
    console.log(frutas);
    frutas.shift();
    console.log(frutas);
    frutas.pop();
    console.log(frutas);

    console.log(verduras);
    console.log(personas);

    const item1 = document.getElementById('vero');
    item1.innerText = `${vero.nombre} ${vero.apellido}, su edad es ${vero.edad}`;
});

function calcularEdad(fechaNacimiento) {
    //debugger;
    // Instancia de Date
    const hoy = new Date();
    const [anio, mes, dia] = fechaNacimiento.split('/').map(Number);
    const fechaNac = new Date(anio, mes - 1, dia);

    let edad = hoy.getFullYear() - fechaNac.getFullYear();
    const mesActual = hoy.getMonth();
    const diaActual = hoy.getDate();

    // Ajustar si aún no ha pasado el cumpleaños este año
    if (mesActual < fechaNac.getMonth() || (mesActual === fechaNac.getMonth() && diaActual < fechaNac.getDate())) {
        edad--;
    }

    return edad;
}

// Ejemplo de uso
//console.log(calcularEdad("1992/10/05")); // Devuelve la edad correcta