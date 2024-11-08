/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teslafleet;

/**
 *
 * @author Cetecom
 */
public abstract class VehiculoElectrico implements Vehiculo {
    protected String codigo;
    protected boolean requiereMantenimiento;

    
    public VehiculoElectrico() {
        this.codigo = "";
        this.requiereMantenimiento = false;
    }

    
    public VehiculoElectrico(String codigo, boolean requiereMantenimiento) {
        this.codigo = codigo;
        this.requiereMantenimiento = requiereMantenimiento;
    }

    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isRequiereMantenimiento() {
        return requiereMantenimiento;
    }

    public void setRequiereMantenimiento(boolean requiereMantenimiento) {
        this.requiereMantenimiento = requiereMantenimiento;
    }

    
    @Override
    public abstract void mostrarDatos();
}