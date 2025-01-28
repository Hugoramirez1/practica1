// conversión de number a string
let numero1 = 3;
let convertido1 = String(numero1);
console.log(convertido1, typeof(convertido1));


// conversión de string a number
let numeroTexto = "40";
let convertidoNumero = Number(numeroTexto);
console.log(convertidoNumero, typeof(convertidoNumero));

// conversión de string a boolean
let laZoe = "Zoe";
let convertida = Boolean(laZoe);
console.log(laZoe, convertida);


// diferencias entre parametro y argumentos
function saludo(nombre, apellido, edad) {
    console.log("Hola ");
}

//saludo("Agustin Naruto", "ElVerdeGreen", 12);

// Prueba en la consola estos comandos
// document.getElementsByTagName("p")
// document.getElementsByTagName("div")