/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciosdepracticaswitch1;

/**
 *
 * @author macbookair DANNA LISETH GOMEZ TORO u20241220253
 */
public class EjerciciosDePracticaSwitch1 {

public class EmpresaAutomotriz {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Menú para seleccionar el tipo de carro
        System.out.println("Seleccione el tipo de carro:");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        System.out.print("Ingrese su opción (1-3): ");
        int tipoCarro = scanner.nextInt();

        // Variable para almacenar el tipo de carro
        @SuppressWarnings("UnusedAssignment")
        String tipoSeleccionado = "";

        // Selección del tipo de carro
        switch (tipoCarro) {
            case 1 -> tipoSeleccionado = "Auto";
            case 2 -> tipoSeleccionado = "SUV";
            case 3 -> tipoSeleccionado = "Camioneta";
            default -> {
                System.out.println("Opción no válida.");
                scanner.close();
                return; // Finaliza el programa si la opción es inválida
            }
        }

        // Menú para seleccionar el color
        System.out.println("Seleccione el color del carro:");
        System.out.println("1. Negro");
        System.out.println("2. Blanco");
        System.out.println("3. Rojo");
        System.out.print("Ingrese su opción (1-3): ");
        int colorCarro = scanner.nextInt();

        // Variable para almacenar el color seleccionado
        String colorSeleccionado = "";

        // Selección del color del carro
        switch (colorCarro) {
            case 1 -> colorSeleccionado = "Negro";
            case 2 -> colorSeleccionado = "Blanco";
            case 3 -> colorSeleccionado = "Rojo";
            default -> {
                System.out.println("Opción no válida.");
                scanner.close();
                return; // Finaliza el programa si la opción es inválida
            }
        }

        // Mostrar la selección final
        System.out.println("Usted ha seleccionado: " + tipoSeleccionado + " de color " + colorSeleccionado + ".");

        // Cerrar el scanner
        scanner.close();
    }
}


   
    
}
