/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        
     Flota flota = new Flota();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Menú de opciones
            System.out.println("\n--- Menu TeslaFleet ---");
            System.out.println("1. Agregar Auto");
            System.out.println("2. Agregar Moto");
            System.out.println("3. Agregar Bicicleta Electrica");
            System.out.println("4. Listar Vehiculos");
            System.out.println("5. Ver Cantidad Total de Vehiculos");
            System.out.println("6. Calcular Costo de Alquiler para Todos los Vehiculos");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Agregar Auto
                    agregarAuto(flota, scanner);
                    break;
                case 2:
                    // Agregar Moto
                    agregarMoto(flota, scanner);
                    break;
                case 3:
                    // Agregar Bicicleta Eléctrica
                    agregarBicicletaElectrica(flota, scanner);
                    break;
                case 4:
                    // Listar Vehículos
                    flota.listarVehiculos();
                    break;
                case 5:
                    // Ver Cantidad Total de Vehículos
                    System.out.println("Cantidad total de vehiculos en la flota: " + flota.cantidadTotalVehiculos());
                    break;
                case 6:
                    // Calcular Costo de Alquiler para Todos los Vehículos
                    System.out.println("Costo de alquiler por 2 horas:");
                    for (VehiculoElectrico v : flota.vehiculos) {
                        System.out.println(v.getCodigo() + ": " + v.calcularCostoAlquiler(2) + " COP");
                    }
                    break;
                case 7:
                    // Salir
                    System.out.println("chaoo...");
                    break;
                default:
                    System.out.println("Opción no valida, intente de nuevo.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    // Métodos para agregar vehículos

    private static void agregarAuto(Flota flota, Scanner scanner) {
        System.out.print("Ingrese el codigo del auto: ");
        String codigo = scanner.next();
        System.out.print("¿Requiere mantenimiento? (true/false): ");
        boolean requiereMantenimiento = scanner.nextBoolean();
        System.out.print("Ingrese la cantidad de pasajeros: ");
        int cantidadPasajeros = scanner.nextInt();
        System.out.print("¿Tiene modo autopilot? (true/false): ");
        boolean modoAutopilot = scanner.nextBoolean();

        Auto auto = new Auto(codigo, requiereMantenimiento, cantidadPasajeros, modoAutopilot);
        if (flota.agregarVehiculo(auto)) {
            System.out.println("Auto agregado exitosamente.");
        } else {
            System.out.println("El auto con este codigo ya existe.");
        }
    }

    private static void agregarMoto(Flota flota, Scanner scanner) {
        System.out.print("Ingrese el codigo de la moto: ");
        String codigo = scanner.next();
        System.out.print("¿Requiere mantenimiento? (true/false): ");
        boolean requiereMantenimiento = scanner.nextBoolean();
        System.out.print("Ingrese la capacidad de la bateria (en kWh): ");
        double capacidadBateria = scanner.nextDouble();
        System.out.print("¿Tiene modo eco? (true/false): ");
        boolean modoEco = scanner.nextBoolean();

        Moto moto = new Moto(codigo, requiereMantenimiento, capacidadBateria, modoEco);
        if (flota.agregarVehiculo(moto)) {
            System.out.println("Moto agregada exitosamente.");
        } else {
            System.out.println("La moto con este codigo ya existe.");
        }
    }

    private static void agregarBicicletaElectrica(Flota flota, Scanner scanner) {
        System.out.print("Ingrese el codigo de la bicicleta eléctrica: ");
        String codigo = scanner.next();
        System.out.print("¿Requiere mantenimiento? (true/false): ");
        boolean requiereMantenimiento = scanner.nextBoolean();
        System.out.print("Ingrese el tipo de frenos (Ej. Disco, Tambor): ");
        String tipoFrenos = scanner.next();
        System.out.print("Ingrese la capacidad de la bateria (en km): ");
        double capacidadBateria = scanner.nextDouble();

        BicicletaElectrica bicicleta = new BicicletaElectrica(codigo, requiereMantenimiento, tipoFrenos, capacidadBateria);
        if (flota.agregarVehiculo(bicicleta)) {
            System.out.println("Bicicleta electrica agregada exitosamente.");
        } else {
            System.out.println("La bicicleta con este codigo ya existe.");
        }
    }
 }




