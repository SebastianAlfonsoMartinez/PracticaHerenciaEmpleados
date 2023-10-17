package com.SAM.Empleados;

import com.SAM.Empleados.empleado.EmpleadoMarketing;
import com.SAM.Empleados.empleado.EmpleadoProduccion;
import com.SAM.Empleados.empleado.EmpleadoRRHH;

public class Main {
    public static void main(String[] args) {

        EmpleadoMarketing empleado1 = new EmpleadoMarketing("Pedro", "Picapiedra", "75425", "Redes sociales");
        empleado1.trabajar();
        empleado1.trabajar(5);
        System.out.println(empleado1.toString());
        EmpleadoProduccion empleado2 = new EmpleadoProduccion("Pablo", "Picapiedra", "45875", 10 );
        empleado2.trabajar();
        empleado2.descansar();
        EmpleadoRRHH empleado3 = new EmpleadoRRHH("Barbara", "Perez", "1548556", 10);
        empleado3.trabajar();
        empleado3.descansar();

        empleado1.setNombre("Luis");
        System.out.println(empleado1.toString());
    }
}