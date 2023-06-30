import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        if ((numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36)) {
            if (numero >= 1 && numero <= 12) {
                System.out.println("El número pertenece a la primera docena.");
            } else if (numero >= 13 && numero <= 24) {
                System.out.println("El número pertenece a la segunda docena.");
            } else {
                System.out.println("El número pertenece a la tercera docena.");
            }
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }
    }
}

