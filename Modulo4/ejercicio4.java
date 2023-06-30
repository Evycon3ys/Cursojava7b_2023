import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una categoría ('a', 'b' o 'c'):");
        char categoria = scanner.nextLine().charAt(0);

        String relacion;

        switch (Character.toLowerCase(categoria)) {
            case 'a':
                relacion = "hijo";
                break;
            case 'b':
                relacion = "padres";
                break;
            case 'c':
                relacion = "abuelos";
                break;
            default:
                relacion = "Categoría inválida";
                break;
        }

        System.out.println("La relación correspondiente a la categoría '" + categoria + "' es: " + relacion);
    }
}



