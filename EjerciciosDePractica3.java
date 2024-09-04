/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosdepractica3;

/**
 *
 * @author macbookair Danna Liseth Gomez Toro u20241220253
 */
public class EjerciciosDePractica3 {

public class ProveedorReproductoresMusica {

    public static void main(String[] args) {
        // Definición de constantes
        final double IVA = 0.19; // IVA del 19%
        final double DESCUENTO_PRECIO_ALTO = 0.10; // Descuento del 10% si el precio es U$500 o más
        final double DESCUENTO_MARCA_NOSY = 0.05; // Descuento del 5% para la marca "NOSY"
        final double PRECIO_MINIMO_DESCUENTO = 500.0; // Precio mínimo para aplicar el descuento del 10%

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el precio del reproductor
        System.out.print("Ingrese el precio del reproductor: U$ ");
        double precio = scanner.nextDouble();

        // Solicitar al usuario la marca del reproductor
        System.out.print("Ingrese la marca del reproductor: ");
        String marca = scanner.next();

        // Inicializar el descuento total
        double descuentoTotal = 0.0;

        // Calcular el descuento del 10% si el precio es U$500 o más
        if (precio >= PRECIO_MINIMO_DESCUENTO) {
            descuentoTotal += precio * DESCUENTO_PRECIO_ALTO;
        }

        // Calcular el descuento del 5% si la marca es "NOSY"
        if (marca.equalsIgnoreCase("NOSY")) {
            descuentoTotal += precio * DESCUENTO_MARCA_NOSY;
        }

        // Calcular el precio después de aplicar los descuentos
        double precioConDescuento = precio - descuentoTotal;

        // Calcular el IVA sobre el precio con descuento
        double ivaCalculado = precioConDescuento * IVA;

        // Calcular el total final a pagar
        double totalAPagar = precioConDescuento + ivaCalculado;

        // Mostrar el resultado
        System.out.printf("Precio original: U$%.2f%n", precio);
        System.out.printf("Descuento total: U$%.2f%n", descuentoTotal);
        System.out.printf("Precio con descuentos: U$%.2f%n", precioConDescuento);
        System.out.printf("IVA: U$%.2f%n", ivaCalculado);
        System.out.printf("Total a pagar: U$%.2f%n", totalAPagar);

        // Cerrar el scanner
        scanner.close();
    }
}


   
    }
    

