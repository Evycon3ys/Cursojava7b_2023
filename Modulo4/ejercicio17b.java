import java.util.Scanner;

public class ejercicio17b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar de los valores pares hasta " + numero + ":");
        
        for (int i = 2; i <= numero; i += 2) {
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

