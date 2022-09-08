package OperacionesAlgebraicas;

import OperacionesAlgebraicas.Operaciones;

import java.util.Scanner;

public class OpeMain {
    public static void main(String[] args) {
        System.out.println("Programa que suma 2 numeros");
        int num1, num2;

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero 1");
        num1 = read.nextInt();
        System.out.println("Ingrese el valor del numero 2");
        num2 = read.nextInt();

        Operaciones Oper1 = new Operaciones(num1, num2);
        int suma = Oper1.suma();
        int resta = Oper1.resta();
        int multiplicacion = Oper1.multiplicacion();
        int division = Oper1.division();

        System.out.println("la suma de los 2 numeros es: " + suma);
        System.out.println("la resta de los 2 numeros es: " + resta);
        System.out.println("la multiplicacion de los 2 numeros es: " + multiplicacion);
        System.out.println("la division de los 2 numeros es: " + division);
    }
}
