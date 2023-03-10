/*
Dada una cantidad de grados centígrados se debe 
mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).
*/

package guia2;

import java.util.*;

public class Ejercicio4 {

    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura Celcius: ");
    float temperaturaCelcius = leer.nextFloat(); 
    float temperaturaF = 32 + (9 * temperaturaCelcius/ 5);
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaF);
    
}
}