import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Competidor 1: Elija su jugada (0 para piedra, 1 para papel, 2 para tijera):");
        int jugada1 = scanner.nextInt();

        System.out.println("Competidor 2: Elija su jugada (0 para piedra, 1 para papel, 2 para tijera):");
        int jugada2 = scanner.nextInt();

        String resultado;

        if (jugada1 == jugada2) {
            resultado = "Empate";
        } else if ((jugada1 == 0 && jugada2 == 2) || (jugada1 == 1 && jugada2 == 0) || (jugada1 == 2 && jugada2 == 1)) {
            resultado = "Competidor 1 es el ganador";
        } else {
            resultado = "Competidor 2 es el ganador";
        }

        System.out.println(resultado);
    }
}





