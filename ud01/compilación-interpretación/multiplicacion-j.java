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
    }
}