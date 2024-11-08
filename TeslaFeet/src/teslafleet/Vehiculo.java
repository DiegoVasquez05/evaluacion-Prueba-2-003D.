/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet;

/**
 *
 * @author Cetecom
 */
public interface Vehiculo {
    public static final double VALOR_HORA_ALQUILER = 15000;
    double calcularCostoAlquiler(double horas);

    
    void mostrarDatos();
}