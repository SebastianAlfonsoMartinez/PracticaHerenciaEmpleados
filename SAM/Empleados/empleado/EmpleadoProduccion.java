package com.SAM.Empleados.empleado;

public class EmpleadoProduccion extends  Empleado{

    private Integer tiempoExperiencia;

    public EmpleadoProduccion(String nombre, String apellido, String dni, Integer tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }

    @Override
    public void trabajar() {
        System.out.println("Empleado de produccion: " + getNombre() + " esta trabajando y tiene " + tiempoExperiencia + " años de experiencia.");
    }
}
