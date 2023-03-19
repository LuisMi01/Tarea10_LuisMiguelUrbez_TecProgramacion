package Ejercicio2;

import java.util.Scanner;

public class Operaciones implements Calculos{
    Scanner teclado = new Scanner(System.in);
    int num1;
    int num2;
    int maximo = 2147483647;
    int minimo = -2147483648;

    public void preguntar() throws DesbordaCapacidadExcepcion{
        System.out.println("Ingrese el primer numero: ");
            num1 = teclado.nextInt();
            if (num1 > maximo || num1 < minimo) {
                try {
                    throw new DesbordaCapacidadExcepcion("El numero ingresado desborda la capacidad de esta calculadora");
                } catch (DesbordaCapacidadExcepcion e) {
                    System.out.println(e.getMessage());
                }
            }

        System.out.println("Ingrese el segundo numero: ");
       num2 = teclado.nextInt();
            if (num2 > maximo || num2 < minimo) {
                try {
                    throw new DesbordaCapacidadExcepcion("El numero ingresado desborda la capacidad de esta calculadora");
                }catch (DesbordaCapacidadExcepcion e){
                    System.out.println(e.getMessage());
                }
            }

    }
    public int suma() throws DesbordaCapacidadExcepcion {
        System.out.println("Vamos a hacer una suma");
        preguntar();
        int resultado = num1 + num2;
        if (resultado > maximo || resultado < minimo){
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }else {
            System.out.println("El resultado de la suma es: " + resultado);
            return resultado;
        }
    }
    public int resta() throws DesbordaCapacidadExcepcion{
        System.out.println("Vamos a hacer una resta");
        preguntar();
        int resultado = num1 - num2;
        if (resultado > maximo || resultado < minimo) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }else {
            System.out.println("El resultado de la resta es: " + resultado);
            return resultado;
        }
    }
    public int multiplicacion() throws DesbordaCapacidadExcepcion{
        System.out.println("Vamos a hacer una multiplicacion");
        preguntar();
        int resultado = num1 * num2;
        if (resultado > maximo || resultado < minimo) {
            throw new DesbordaCapacidadExcepcion("El resultado desborda la capacidad de esta calculadora");
        }else {
            System.out.println("El resultado de la multiplicacion es: " + resultado);
            return resultado;
        }
    }
    public int division() throws DesbordaCapacidadExcepcion {
        System.out.println("Vamos a hacer una division");
        preguntar();
        int resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
        return resultado;
    }
    public int resto() throws DesbordaCapacidadExcepcion {
        System.out.println("Vamos a hacer un resto de una division");
        preguntar();
        int resultado = num1 % num2;
        System.out.println("El resultado del resto de la division es: " + resultado);
        return resultado;
    }
}
