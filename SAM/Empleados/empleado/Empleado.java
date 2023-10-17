package com.SAM.Empleados.empleado;

public class Empleado {
    //Atributos
    private String nombre;
    private String apellido;
    private String dni;
    //constructores

    public Empleado(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }


    //GETTER AND SETTER

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //METODOS

    public void  trabajar(){
        System.out.println("Empleado: " + nombre + "esta tabajando");
    }

    public void descansar(){
        System.out.println("Empleado: "+ nombre + "esta descansando");
    }

    @Override
    public String toString() {
        return nombre + ", " + apellido;
    }
}
