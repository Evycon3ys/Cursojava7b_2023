import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el puesto obtenido (1, 2, 3):");
        int puesto = scanner.nextInt();

        String mensaje;

        switch (puesto) {
            case 1:
                mensaje = "El primero obtiene la medalla de oro.";
                break;
            case 2:
                mensaje = "El segundo obtiene la medalla de plata.";
                break;
            case 3:
                mensaje = "El tercero obtiene la medalla de bronce.";
                break;
            default:
                mensaje = "Siga participando.";
                break;
        }

        System.out.println(mensaje);
    }
}



