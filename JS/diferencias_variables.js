// var, let y const
// ámbito/contexto - scope

// var
function ejemploVar() {
    debugger;
    if(true) {
        debugger;
        var numero = 10;
    }
    debugger;
    console.log(numero);
}

function ejemploLet() {
    debugger;
    if(true) {
        debugger;
        let numero = 10;
        debugger;
    }
    debugger;
    console.log(numero);
}

function ejemploConst() {
    debugger;
    const z = 30;
    debugger;
    //z = 15;
    console.log(z);

    const array = [1, 2, 3];
    array.push(4);
    array.push("Asunción");
    console.log(array);
    array = [];
}

// snake case
//let mi_perrito_en_el_agua

// camel case
//let miPerritoEnElAgua

// Pascal Case
//let MiPerritoEnElAgua

//ejemploVar();
//ejemploLet();
ejemploConst();