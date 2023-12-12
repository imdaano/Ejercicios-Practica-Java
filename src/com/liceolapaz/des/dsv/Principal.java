package com.liceolapaz.des.dsv;
import javax.swing.*;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        // Ejercicio 1:

/*
        int a = 6;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a/b);
        System.out.println(a%b);

*/

        // Ejercicio 2:  Declara 2 variables numéricas (con el valor que desees), e indica cual es mayor de los dos.
        //               Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.

/*   int num1 = 14;
        int num2 = 14;

        if (num1 < num2) {
            System.out.println("El número " + num1 + " es menor que "+ num2);
        } else if (num1 > num2) {
            System.out.println("El número " + num1 + " es mayor que "+ num2);
        } else if (num1 == num2) {
            System.out.println("Los números " + num1 + " y " + num2 + " son iguales");
        };
*/

        // Ejercicio 3: Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        // Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».

/*

        String nombre="Fernando";

        System.out.println("Bienvenido "+nombre);
*/


        // Ejercicio 4: 4) Modifica la aplicación anterior, para que nos pida el nombre que queremos
        // introducir (recuerda usar JOptionPane).

/*

        String nombre;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca su nombre:");
        nombre = teclado.nextLine();

        System.out.println("Bienvenid@ " + nombre);
*/

        // Ejercicio 5: Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
        // (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.

/*

        double pi = 3.1416;

        System.out.println("Vamos a calcular el área de un circulo.");
        System.out.println("Introduce un radio en cm: ");
        Scanner teclado = new Scanner(System.in);

        double radio = teclado.nextDouble();
        double exponente = Math.pow(radio,2);
        double areaCirculo = pi * exponente;

        System.out.println("El área del círculo es: " + areaCirculo + " cm.");
*/


        // Ejercicio 6:Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
        // Si no lo es, también debemos indicarlo.


/*

        int numero;

        System.out.println("Introduce un numero para ver si es par o impar: ");
        Scanner teclado = new Scanner(System.in);
        numero = teclado.nextInt();

        if (numero == 0) {
            System.out.println("Introduce un número que no sea 0");
        } else if (numero < 0 ) {
            System.out.println("Introduce numeros positivos");
        } else if (numero%2 != 0) {
            System.out.println("El número es impar");
        } else if (numero%2 == 0) {
            System.out.println("El número es par");
        };

*/

        // Ejercicio 7: Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla
        //              ASCII. Por ejemplo: si introduzco un 97, me muestre una a


        // NO DIMOS ESTE EJERCICIO


        // Ejercicio 9:  Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule
        //               el precio final con IVA. El IVA sera una constante que sera del 21%.


/*

        double iva = 1.21;

        System.out.println("Introduce el precio de un producto para calcular el precio final con IVA incluido:");

        double precio;
        Scanner teclado = new Scanner(System.in);
        precio = teclado.nextDouble();
        double precioFinal = precio * iva;

        System.out.println("El precio final del producto indicado con el IVA incluido es de: " + precioFinal);
*/


        // Ejercicio 10:  Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.

/*

        int numero = 1;

        while (numero<=100) {
            System.out.println("Número: " + numero);
            numero++;
        }
*/

        // Ejercicio 11: Haz el mismo ejercicio anterior con un bucle for.

/*

        for (int i = 1; i <=  100 ; i++) {
            System.out.println("Número: " + i);
        }
*/


        // Ejercicio 12:  Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3.
        //                Utiliza el bucle que desees.


        // while

/*
        int numero = 1;

        while ( numero <= 100) {

            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
            numero++;
        }
*/

/*
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
*/



        // Ejercicio 13:

        // Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá
        // tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las
        // ventas. Piensa que es lo que se repite y lo que no.


/*
        System.out.println("Introduce el numero de ventas que quieres sumar: ");
        Scanner teclado = new Scanner(System.in);

        int numVentas = teclado.nextInt();


        double sumaVentas = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.println("Introduce el importe de la venta " + i);
            double venta = teclado.nextDouble();

            sumaVentas= sumaVentas+venta;
        }

        System.out.println(sumaVentas);
*/

        // Ejercicio 15:

        // Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá
        // a pedir (do while), después muestra ese número por consola.


        System.out.println("Introduce un numero para comprobar si es entero o no: ");

        Scanner teclado = new Scanner(System.in);



    }
}