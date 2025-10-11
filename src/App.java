import java.util.Scanner;
import java.text.DecimalFormat;

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
        System.out.printf("%n");


        // EJERCICIO 2
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 2" + ut.RESET);
        System.out.println("""
                Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere 
                convertir deber ser introducida por teclado
                """);
        
        System.out.print("Por favor, introduzca la cantidad de euros que quiere converitir: ");
        double euros = Integer.parseInt(System.console().readLine());
        double pesetas = euros * 166.386;
        System.out.printf("%.2f euros son %d pesetas%n%n", euros, (int)pesetas);


        // EJERCICIO 3
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 3" + ut.RESET);
        System.out.println("""
                Realiza una conversión de pesetas a euros. La cantidad de pesetas 
                que se quiere convertir deber ser introducida por teclado.
                """);
        
        System.out.print("Por favor, introduzca la cantidad de pesetas que quiere converitir: ");
        int psetas = Integer.parseInt(System.console().readLine());
        double eros = psetas / 166.386;
        System.out.printf("%d pesetas son %.2f euros%n%n", psetas, eros);


        // EJERCICIO 4
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 4" + ut.RESET);
        System.out.println("""
                Escribe un programa que sume, reste, multiplique y divida dos números 
                introducidos por teclado. 
                Los números que introduce el usuario podría tener decimales.
                """);
        Scanner s = new Scanner(System.in);
        

        System.out.print("Por favor introduzca el primero número: ");
        double x = s.nextDouble();
        s.nextLine();
        System.out.print("Introduzca el segundo número: ");
        double y = s.nextDouble();
        s.nextLine();
        // Sistema para que muestre en la división los decimales necesarios solo
        double division = x / y;
        DecimalFormat df = new DecimalFormat("#.#######################"); //máximo 8 decimales
        // Impresión por pantalla de resultado
        System.out.printf("x = %.1f%ny = %.1f%nx + y = %.1f%nx - y = %.1f%nx / y = %s%nx * y = %.1f%n%n", 
                        x, y, x + y, x - y, df.format(division), x * y);

        
        //EJERCICIO 5
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 5" + ut.RESET);
        System.out.println("""
                Escribe un programa que calcule el área de un rectángulo
                """);
        
        System.out.print("""
                        \t          Área de un rectángulo
                        -----------------------------------------------------
                        """);
        System.out.print("Por favor introduzca la longitud de la base (cm): ");
        Double base = s.nextDouble();
        s.nextLine();
        System.out.printf("Introduzca la altura (cm): ");
        Double altura = s.nextDouble();

        System.out.println("El área del rectángulo es " + altura * base + " cm^2");

    }
}
 