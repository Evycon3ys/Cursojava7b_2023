import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine().toLowerCase();
        
        int cantidadDias;
        
        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
                
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
                
            case "febrero":
                cantidadDias = 28;
                break;
                
            default:
                cantidadDias = -1; // Valor inválido para indicar un mes no reconocido
                break;
        }
        
        if (cantidadDias != -1) {
            System.out.println(nombreMes + " tiene " + cantidadDias + " días.");
        } else {
            System.out.println("Mes inválido.");
        }
        
        scanner.close();
    }
}


