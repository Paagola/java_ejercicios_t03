public class PROOF {

    public static void main(String[] args) {
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
        System.out.printf("%-15s %15f $", "Total: ", base_imp + IVA);
    }

}
