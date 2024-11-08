/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet;

/**
 *
 * @author Cetecom
 */
import java.util.ArrayList;

public class Flota {
    ArrayList<VehiculoElectrico> vehiculos;

    public Flota() {
        vehiculos = new ArrayList<>();
    }

    public boolean agregarVehiculo(VehiculoElectrico vehiculo) {
        for (VehiculoElectrico v : vehiculos) {
            if (v.getCodigo().equals(vehiculo.getCodigo())) {
                return false; // El vehículo ya existe
            }
        }
        vehiculos.add(vehiculo);
        return true;
    }

    public void listarVehiculos() {
        for (VehiculoElectrico v : vehiculos) {
            v.mostrarDatos();
        }
    }

    public int cantidadTotalVehiculos() {
        return vehiculos.size();
    }
}
