/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet;

/**
 *
 * @author Cetecom
 */
public class Auto extends VehiculoElectrico {
    private int cantidadPasajeros;
    private boolean modoAutopilot;

    
    public Auto() {
        super();
        this.cantidadPasajeros = 0;
        this.modoAutopilot = false;
    }


    public Auto(String codigo, boolean requiereMantenimiento, int cantidadPasajeros, boolean modoAutopilot) {
        super(codigo, requiereMantenimiento);
        this.cantidadPasajeros = cantidadPasajeros;
        this.modoAutopilot = modoAutopilot;
    }

    
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    public boolean isModoAutopilot() {
        return modoAutopilot;
    }

    public void setModoAutopilot(boolean modoAutopilot) {
        this.modoAutopilot = modoAutopilot;
    }

    
    @Override
    public void mostrarDatos() {
        System.out.println("Auto - Código: " + codigo + ", Pasajeros: " + cantidadPasajeros + ", Modo Autopilot: " + modoAutopilot);
    }

    
    @Override
    public double calcularCostoAlquiler(double horas) {
        double costo = VALOR_HORA_ALQUILER * horas;
        if (modoAutopilot) {
            costo += costo * 0.10; 
        }
        return costo;
    }
}
