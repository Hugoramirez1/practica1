/*Ejercicio 2 :  
Objetivo: Practicar el uso de arreglos (arrays) de tipo String y bucles for-each 
para mostrar datos en consola.

📋 Enunciado:
Crea un programa en Java que realice lo siguiente:

Declare un array de tipo String que contenga automáticamente 5 nombres.

Muestre en pantalla todos los nombres usando un bucle.

❗ No se debe solicitar al usuario que ingrese los nombres. Los valores deben estar ya cargados en el código.

💡 Pistas:
Los nombres pueden ser: "Ana", "Luis", "Carlos", "Marta", "Sofía".

Usa un bucle for-each para recorrer el array y mostrar cada nombre.
*/
public class Nombres2 {
    public static void main(String[] args) {
        // Declarar un array de tipo String con nombres cargados automáticamente
        String[] nombres = { "Ana", "Luis", "Carlos", "Marta", "Sofía" };

        // Mostrar los nombres usando un bucle for-each
        System.out.println("Lista de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
