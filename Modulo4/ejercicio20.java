import java.util.Random;

public class ejercicio20 {
    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        
        System.out.println("Generando 10 números aleatorios:");
        
        do {
            int numero = random.nextInt(100); // Genera un número aleatorio entre 0 y 99
            System.out.println(numero);
            
            if (numero > maximo) {
                maximo = numero;
            }
            
            if (numero < minimo) {
                minimo = numero;
            }
            
            contador++;
        } while (contador < 10);
        
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}



