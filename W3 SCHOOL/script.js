function myFunction() {
    document.getElementById("hiddenText").style.display = "block";
    document.getElementById("secbtn").style.display = "block";
    document.getElementById("btn").style.display = "none";
}

function myFunction2() {
    document.getElementById("hiddenText").innerHTML = "Con el siguiente botón cambias el texto";
    document.getElementById("secbtn1").style.display = "block";
    document.getElementById("secbtn").style.display = "none";


}
function myFunction3() {
    document.getElementById("hiddenText2").style.display = "block";
    document.getElementById("hiddenText2").innerHTML = "Con este botón sigues cambiando texto";
    document.getElementById("hiddenText").style.display = "none";
    document.getElementById("volver").style.display = "block";
    document.getElementById("secbtn1").style.display = "none";
}
function myFunction4() {
    document.getElementById("hiddenText2").style.display = "none";
    document.getElementById("btn").style.display = "block";
    document.getElementById("volver").style.display = "none";
    document.getElementById("secbtn1").style.display = "none";
}



