/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosdepractica1;

/**
 *
 * @author macbookair DANNA LISETH GOMEZ TORO u20241220253
 */
public class EjerciciosDePractica1 {
    
public class TiendaComputadoras {

    public static void main(String[] args) {
        // Precio de cada computadora
        final double PRECIO_COMPUTADORA = 500.0;
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de computadoras a comprar
        System.out.print("Ingrese la cantidad de computadoras que desea comprar: ");
        int cantidad = scanner.nextInt();

        // Calcular el total sin descuento
        double totalSinDescuento = cantidad * PRECIO_COMPUTADORA;
        double descuento = 0.0; 
        
        // Determinar el porcentaje de descuento basado en la cantidad
        if (cantidad < 5) {
            descuento = totalSinDescuento * 0.10; // 10% de descuento
        } else if (cantidad >= 5 && cantidad < 10) {
            descuento = totalSinDescuento * 0.20; // 20% de descuento
        } else {
            descuento = totalSinDescuento * 0.40; // 40% de descuento
        }

        // Calcular el total con descuento
        double totalConDescuento = totalSinDescuento - descuento;

        // Mostrar el resultado
        System.out.printf("Total sin descuento: U$%.2f%n", totalSinDescuento);
        System.out.printf("Descuento aplicado: U$%.2f%n", descuento);
        System.out.printf("Total con descuento: U$%.2f%n", totalConDescuento);

        // Cerrar el scanner
        scanner.close();
    }
}


    
}
