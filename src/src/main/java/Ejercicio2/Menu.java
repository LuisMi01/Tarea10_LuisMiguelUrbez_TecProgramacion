package Ejercicio2;

import java.util.Scanner;

public class Menu {
    public void menu() {
        Scanner teclado = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        boolean salir = false;
        do {
            int opcion;
            System.out.println("------Bienvenido a la calculadora------");
            System.out.println("1.- Restar");
            System.out.println("2.- Sumar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("5.- Resto");
            System.out.println("6.- Salir");

            opcion = teclado.nextInt();

            try {
                switch (opcion) {
                    case 1:
                       operaciones.resta();
                        break;
                    case 2:
                        operaciones.suma();
                        break;
                    case 3:
                        operaciones.multiplicacion();
                        break;
                    case 4:
                        operaciones.division();
                        break;
                    case 5:
                        operaciones.resto();
                        break;
                    case 6:
                        System.out.println("Adios");
                        salir = true;
                        break;

                    default:
                        System.out.println("Debe ingresar un numero entre el 1 y 6");
                }
            } catch (Exception ex) {
                System.out.println("Debes ingresar un numero.");
                menu();
            }


        }while(!salir);
    }
}
