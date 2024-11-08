/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet;

/**
 *
 * @author Cetecom
 */
public class Moto extends VehiculoElectrico {
    private double capacidadBateria; // en kWh
    private boolean modoEco;

    // Constructor vacío
    public Moto() {
        super();
        this.capacidadBateria = 0;
        this.modoEco = false;
    }

    // Constructor sobrecargado
    public Moto(String codigo, boolean requiereMantenimiento, double capacidadBateria, boolean modoEco) {
        super(codigo, requiereMantenimiento);
        this.capacidadBateria = capacidadBateria;
        this.modoEco = modoEco;
    }

    // Métodos accesadores y mutadores
    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isModoEco() {
        return modoEco;
    }

    public void setModoEco(boolean modoEco) {
        this.modoEco = modoEco;
    }

    // Sobrescribir el método mostrarDatos
    @Override
    public void mostrarDatos() {
        System.out.println("Moto - Código: " + codigo + ", Capacidad Batería: " + capacidadBateria + " kWh, Modo Eco: " + modoEco);
    }

    // Sobrescribir el método calcularCostoAlquiler
    @Override
    public double calcularCostoAlquiler(double horas) {
        double costo = VALOR_HORA_ALQUILER * horas;
        if (modoEco) {
            costo += costo * 0.08; // Incremento del 8% si usa el modo eco más de la mitad del tiempo
        }
        return costo;
    }
}
