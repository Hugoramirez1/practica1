let names = []; // Array que almacenará los nombres ingresados

// Evento para agregar nombres
document.getElementById('addNameButton').addEventListener('click', function() {
    const nameInput = document.getElementById('nameInput');
    const name = nameInput.value.trim();

    if (name) {
        names.push(name);
        nameInput.value = ''; // Limpiar campo de entrada
        updateNameList(); // Actualizar lista de nombres
    } else {
        alert("Por favor ingrese un nombre válido.");
    }
});

// Función para actualizar la lista de nombres en la interfaz
function updateNameList() {
    const nameListDiv = document.getElementById('nameList');
    nameListDiv.innerHTML = '<strong>Lista de Nombres:</strong><br>';
    names.forEach((name, index) => {
        nameListDiv.innerHTML += `${index + 1}. ${name}<br>`;
    });
}

// Evento para generar el calendario
document.getElementById('generateCalendarButton').addEventListener('click', function() {
    // Validar que haya al menos un nombre
    if (names.length === 0) {
        alert("Por favor ingrese al menos un nombre.");
        return;
    }

    // Limpiar calendario anterior si existe
    document.getElementById('calendar').innerHTML = '';

    // Crear calendario para el mes (suponiendo que es el mes actual)
    const currentDate = new Date();
    const month = currentDate.getMonth(); // Obtener el mes actual
    const year = currentDate.getFullYear(); // Obtener el año actual

    // Obtener el primer día del mes y el número de días en el mes
    const firstDay = new Date(year, month, 1);
    const lastDay = new Date(year, month + 1, 0);

    // Obtener el número del primer sábado del mes
    let firstSaturday = firstDay.getDate() + (6 - firstDay.getDay()); // Encuentra el primer sábado

    // Mostrar calendario con los nombres asignados a los sábados
    let calendarHTML = `<h2>Calendario de ${currentDate.toLocaleString('default', { month: 'long' })} ${year}</h2>`;

    let saturdayCount = 0; // Contador de los sábados
    let nameIndex = 0; // Índice para acceder a los nombres

    for (let day = firstSaturday; day <= lastDay.getDate(); day += 7) {
        saturdayCount++;

        // Asignar nombres a cada sábado, de dos en dos
        let saturdayNames = `${names[nameIndex]} & ${names[nameIndex + 1] || 'N/A'}`;

        // Si no hay suficientes nombres, mostrar "N/A" para completar el sábado
        calendarHTML += `<div class="calendar-day">
            <strong>Sábado ${day}:</strong> ${saturdayNames}
        </div>`;

        // Incrementar el índice de nombres
        nameIndex += 2;
        if (nameIndex >= names.length) {
            nameIndex = 0; // Volver a empezar desde el principio si hay más sábados que nombres
        }
    }

    // Mostrar el calendario
    document.getElementById('calendar').innerHTML = calendarHTML;
});

