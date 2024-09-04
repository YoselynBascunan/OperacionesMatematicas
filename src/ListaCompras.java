
public class ListaCompras {
    public static void main(String[] args) {
        // Precios de los productos
        double cocina = 299990;
        double lavadora = 234540;
        double comedor = 159990;
        double televisor = 345100;

        // Calcular el total
        double total = cocina + lavadora + comedor + televisor;

        // Calcular el IVA (19%)
        double iva = total * 0.19;

        // Calcular el total más IVA
        double totalConIva = total + iva;

        // Valor del dólar (ejemplo)
        double valorDolar = 850; // Suponiendo que 1 dólar equivale a 850 pesos chilenos

        // Calcular el total en dólares
        double totalEnDolares = totalConIva / valorDolar;

        // Mostrar los resultados
        System.out.printf("Total de la lista de compras: $%.2f%n", total);
        System.out.printf("IVA (19%%): $%.2f%n", iva);
        System.out.printf("Total más IVA: $%.2f%n", totalConIva);
        System.out.printf("Total en dólares: $%.2f%n", totalEnDolares);
    }
}
