package com.SAM.Empleados.empleado;

public class EmpleadoMarketing extends Empleado{

    private String area;

    public EmpleadoMarketing(String nombre, String apellido, String dni, String area) {
        super(nombre, apellido, dni);
        this.area = area;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing: " + getNombre() + " esta trabajando en el area: " + area );
    }

    public void trabajar(Integer horasExtras){
        System.out.println("Empleado de Marketing: " + getNombre() + " esta trabajando en area: " + area + " Horas extras: " + horasExtras);
    }
}
