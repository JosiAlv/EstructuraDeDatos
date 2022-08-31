package OperacionesAlgebraicas;

import java.util.Scanner;

public class Suma2Numeros {
    public static void main(String[] args) {
        System.out.println("Programa que suma 2 numeros");
        int a,b,sum,res,mul,div;

        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el valor del numero 1");
        a = read.nextInt();
        System.out.println("Ingrese el valor del numero 2");
        b = read.nextInt();
        sum = a + b;
        res = a - b;
        mul = a * b;
        div = a / b;

        System.out.println("la suma de los 2 numeros es: " + sum);
        System.out.println("la resta de los 2 numeros es: " + res);
        System.out.println("la multiplicacion de los 2 numeros es: " + mul);
        System.out.println("la division de los 2 numeros es: " + div);
    }
}

