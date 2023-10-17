package com.SAM.Empleados.empleado;

public class EmpleadoRRHH extends Empleado{
    private Integer altasLogradas;

    public EmpleadoRRHH(String nombre, String apellido, String dni, Integer altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de RRHH: " + getNombre() + "se encuentra trabajando y cuenta con " + altasLogradas + " Altas logradas");
    }

}
