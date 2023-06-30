import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número de curso:");
        int curso = scanner.nextInt();

        String tipoCurso;

        if (curso == 0) {
            tipoCurso = "Jardín de infantes";
        } else if (curso >= 1 && curso <= 6) {
            tipoCurso = "Primaria";
        } else if (curso >= 7 && curso <= 12) {
            tipoCurso = "Secundaria";
        } else {
            tipoCurso = "Tipo de curso inválido";
        }

        System.out.println("El estudiante pertenece a: " + tipoCurso);
    }
}



