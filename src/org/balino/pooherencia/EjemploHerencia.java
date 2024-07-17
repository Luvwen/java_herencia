package org.balino.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();

        alumno.setNombre("Andres");
        alumno.setApellido("Guzman");

        profesor.setNombre("Luci");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");


        System.out.println("alumno " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("profesor " + profesor.getNombre() + " " + profesor.getApellido()
                + " " + profesor.getAsignatura());
    }
}
