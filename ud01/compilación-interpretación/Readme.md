# Python

- Co seguintes comandos instalamos o compilador de python:

Sudo apt update  
Sudo apt install python3

- Compilamos o programa de python escribindo: 

python3 multiplicacion-p.py

- Código:

       primero = float(input("Introduce el primer numero: "))
       segundo = float(input("Introduce el segundo numero: "))
       tercero = float(input("Introduce el tercer numero: "))

       resultado = primero * segundo * tercero
       print("El resultado es:", resultado)


# Java

- Co seguintes comandos instalamos o compilador de Java:

Sudo apt update  
sudo apt install default-jdk

- Compilamos o programa de java escribindo: 

javac multiplicacion-j.java

- Código:

      import java.util.Scanner;

      public class MultiplicarTresNumeros {
      public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);

      System.out.print("Introduce el primer número: ");
      double primero = teclado.nextDouble();

      System.out.print("Introduce el segundo número: ");
      double segundo = teclado.nextDouble();

      System.out.print("Introduce el tercer número: ");
      double tercero = teclado.nextDouble();

      double resultado = primero * segundo * tercero;
      System.out.println("El resultado es: " + resultado);

      teclado.close();
    

# C

- Co seguintes comandos instalamos o compilador de C:

Sudo apt update  
Sudo apt install gcc

- Compilamos o programa de java escribindo: 

gcc multiplicacion-c.c -o multiplicacion-c

- Código:

      #include <stdio.h>
      int main(void) {
      double primero, segundo, tercero;

      printf("Introduce el primer número: ");
      scanf("%lf", &primero);

      printf("Introduce el segundo número: ");
      scanf("%lf", &segundo);
  
      printf("Introduce el tercer número: ");
      scanf("%lf", &tercero);

      printf("El resultado es: %g\n", primero * segundo * tercero);

      return 0;
      }