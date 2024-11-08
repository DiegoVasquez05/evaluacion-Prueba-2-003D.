/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet;

/**
 *
 * @author Cetecom
 */
public class BicicletaElectrica extends VehiculoElectrico {
    private String tipoFrenos;
    private double capacidadBateria; // en km

    // Constructor vacío
    public BicicletaElectrica() {
        super();
        this.tipoFrenos = "";
        this.capacidadBateria = 0;
    }

    // Constructor sobrecargado
    public BicicletaElectrica(String codigo, boolean requiereMantenimiento, String tipoFrenos, double capacidadBateria) {
        super(codigo, requiereMantenimiento);
        this.tipoFrenos = tipoFrenos;
        this.capacidadBateria = capacidadBateria;
    }

    // Métodos accesadores y mutadores
    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    // Sobrescribir el método mostrarDatos
    @Override
    public void mostrarDatos() {
        System.out.println("Bicicleta Eléctrica - Código: " + codigo + ", Tipo de Frenos: " + tipoFrenos + ", Capacidad Batería: " + capacidadBateria + " km");
    }

    // Sobrescribir el método calcularCostoAlquiler
    @Override
    public double calcularCostoAlquiler(double horas) {
        double costo = VALOR_HORA_ALQUILER * horas;
        if (capacidadBateria < 20) {
            costo -= costo * 0.05; // Descuento del 5% si la capacidad de la batería es menor a 20 km
        }
        return costo;
    }
}
