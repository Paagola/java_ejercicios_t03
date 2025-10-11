import java.util.Scanner;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) throws Exception {
         
        // Sistema para que muestre en la división los decimales necesarios solo
        DecimalFormat df = new DecimalFormat("#.#######################"); //máximo 15 decimales


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

        System.out.printf("x = %.1f%ny = %.1f%nx + y = %.1f%nx - y = %.1f%nx / y = %s%nx * y = %.1f%n%n", 
                        x, y, x + y, x - y, df.format(x / y), x * y);

        
        //EJERCICIO 5
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 5" + ut.RESET);
        System.out.println("""
                Escribe un programa que calcule el área de un rectángulo
                """);
        
        System.out.print("""
                        \t        Área de un rectángulo
                        -----------------------------------------------------
                        """);
        System.out.print("Por favor introduzca la longitud de la base (cm): ");
        Double base_rect = s.nextDouble();
        s.nextLine();
        System.out.printf("Introduzca la altura (cm): ");
        Double altura_rect = s.nextDouble();

        System.out.println("El área del rectángulo es " + altura_rect * base_rect + " cm^2\n");


        //EJERCICIO 6
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 6" + ut.RESET);
        System.out.println("""
               Escribe un programa que calcule el área de un triángulo
                """);
        
        System.out.print("""
                        \t        Área de un triángulo
                        -----------------------------------------------------
                        """);

        System.out.print("Por favor introduzca la longitud de la base (cm): ");
        Double base_trian = s.nextDouble();
        s.nextLine();
        System.out.printf("Introduzca la altura (cm): ");
        Double altura_trian = s.nextDouble();

        System.out.println("El área del triángulo es " + (altura_trian * base_trian) / 2 + " cm^2\n");


        //EJERCICIO 7
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 7" + ut.RESET);
        System.out.println("""
               Escribe un programa que calcule la factura a través de la base imponible
                """);
        System.out.print("Introduce la base imponible (precio del artículo sun IVA): ");
        Double base_imp = Double.parseDouble(System.console().readLine());
        Double IVA = (base_imp / 100) * 21;

        System.out.printf("%n%-15s %15.2f $%n%-15s %15.2f $%n", "Base imponible:", base_imp, "IVA (21%)", IVA);
        System.err.println("---------------------------------");
        System.out.printf("%-15s %15.2f $%n%n", "Total: ", base_imp + IVA);


        //EJERCICIO 8
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 8" + ut.RESET);
        System.out.println("""
               Escribe un programa que calcule el salario semanal de un empleado en base a las horas trabajadas, 
               a razón de 12 euros la hora.
                """);
        System.err.printf("Introduzca el número de horas trabajadas durante la semana:");
        Double hora_trab = Double.parseDouble(System.console().readLine());
        int eur_hor = 12;
        System.out.printf("Su salario semanal es de %d euros%n%n", Math.round(hora_trab * eur_hor));


        //EJERCICIO 9
        System.err.println(ut.GREEN_BOLD + "EJERCICIO 9" + ut.RESET);
        System.out.println("""
               Escribe un programa que calcule el volumen de un cono según la fórmula
                V = (1 / 3) * 3.14159265 * r^2 * h 
                """);
        System.out.print("Por favor, introduzca la altura (cm): ");
        Double alt_cono = Double.parseDouble(System.console().readLine());

        System.out.print("Introduce el radio de la base (cm): ");
        Double rad_cono = Double.parseDouble(System.console().readLine());

        // Calculamos el volumen del cono
        Double vol_cono = ((double)1/3) * Math.PI * Math.pow(rad_cono, 2) * alt_cono;

        System.out.printf("El volumen del cono es de %s cm^3%n%n", df.format(vol_cono));
        
    }
}
 