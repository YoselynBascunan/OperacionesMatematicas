import java.util.Scanner;

public class CalcularIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar peso y altura al usuario
        System.out.print("Ingrese su peso en kilogramos: ");
        double peso = scanner.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        double altura = scanner.nextDouble();

        // Calcular el IMC
        double imc = peso / (altura * altura);

        // Mostrar el resultado en consola
        System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f%n", imc);

        scanner.close();
    }
}
