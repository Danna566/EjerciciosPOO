/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eherciciosdepractica2;

/**
 *
 * @author macbookair DANNA LISETH GOMEZ TORO u20241220253
 */
public class EjerciciosDePractica2 {

public class Serviteca {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        // Precio por llanta según la cantidad comprada
        final double PRECIO_BAJO = 100.0; // Menos de 5 llantas
        final double PRECIO_MEDIO = 75.0; // De 5 a 10 llantas
        final double PRECIO_ALTO = 50.0;   // Más de 10 llantas

        System.out.print("Ingrese la cantidad de llantas que desea comprar: ");
        int cantidadLlantas = scanner.nextInt();

        double precioPorLlantas;

        // Determinar el precio por llanta según la cantidad
        if (cantidadLlantas < 5) {
            precioPorLlantas = PRECIO_BAJO;
        } else if (cantidadLlantas <= 10) {
            precioPorLlantas = PRECIO_MEDIO;
        } else {
            precioPorLlantas = PRECIO_ALTO;
        }

        // Calcular el total a pagar
        double totalPagar = precioPorLlantas * cantidadLlantas;

        // Mostrar resultados
        System.out.println("Precio por llanta: U$" + precioPorLlantas);
        System.out.println("Total a pagar: U$" + totalPagar);

        scanner.close();
    }
}


   
    
}
