// var, let y const
// ámbito/contexto - scope

// var
function ejemploVar() {
    
    if(true) {
        
        var numero = 10;
    }
    
    console.log(numero);
}

function ejemploLet() {
    
    if(true) {
        
        let numero = 10;
       
    }
    
    console.log(numero);
}

function ejemploConst() {
    
    const z = 30;
    
    //z = 15;
    console.log(z);

    const array = [1, 2, 3];
    array.push(4);
    array.push("Asunción");
    console.log(array);
   ;
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