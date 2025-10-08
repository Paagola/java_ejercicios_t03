import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         
        // EJERCICIO 1

        System.err.println(ut.GREEN_BOLD + "EJERCICIO 1" + ut.RESET);
        System.out.println("""
                Realiza un programa que pida dos números enteros y que luego 
                muestre el resultado de su multiplicación
                """);
        
        
        System.out.println("Este programa multiplica dos números");
        System.out.printf("Introduce el primero número: ");
        int numero1 = Integer.parseInt(System.console().readLine());

        System.out.printf("Introduce el segundo número: ");
        int numero2 = Integer.parseInt(System.console().readLine());

        System.out.println(numero1 + " * " + numero2 + " = " + numero1*numero2);


        // EJERCICIO 2
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 2" + ut.RESET);
        System.out.println("""
                Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
                convertir deber ser introducida por teclado
                """);
        
        System.out.print("Por favor, introduzca la cantidad de euros que quiere converitir: ");
        double euros = Integer.parseInt(System.console().readLine());
        double pesetas = euros * 166.386;
        System.out.printf("%.2f euros son %d pesetas", euros, (int)pesetas);


        // EJERCICIO 3
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 3" + ut.RESET);
        System.out.println("""
                Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
                convertir deber ser introducida por teclado
                """);

    }
}
 