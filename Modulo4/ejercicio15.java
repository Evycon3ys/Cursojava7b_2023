import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        char claseAuto = 'b'; // Puedes modificar esta variable para probar diferentes clases de auto
        
        String caracteristicas;
        
        switch (claseAuto) {
            case 'a':
                caracteristicas = "Clase A: 4 ruedas y un motor";
                break;
                
            case 'b':
                caracteristicas = "Clase B: 4 ruedas, un motor, cierre centralizado y aire";
                break;
                
            case 'c':
                caracteristicas = "Clase C: 4 ruedas, un motor, cierre centralizado, aire y airbag";
                break;
                
            default:
                caracteristicas = "Clase no reconocida";
                break;
        }
        
        System.out.println("Características del auto: " + caracteristicas);
    }
}
