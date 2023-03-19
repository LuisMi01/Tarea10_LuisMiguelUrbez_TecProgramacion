package Ejercicio1;

import java.util.Scanner;

public class Raiz {
    public void calculoRaiz(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero a calcular la raiz cuadrada: ");
        double numero = teclado.nextDouble();

        if (numero < 0){
            System.out.println("No se puede calcular la raiz de un numero negativo");
            calculoRaiz();
        } else {
            double raiz = Math.sqrt(numero);
            System.out.println("La raiz cuadrada de " + numero + " es " + raiz);
        }
    }
}
