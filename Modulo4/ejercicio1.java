import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación de la primera evaluación:");
        double evaluacion1 = scanner.nextDouble();

        System.out.println("Ingrese la calificación de la segunda evaluación:");
        double evaluacion2 = scanner.nextDouble();

        System.out.println("Ingrese la calificación de la tercera evaluación:");
        double evaluacion3 = scanner.nextDouble();

        double promedio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;

        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
}
