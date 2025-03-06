package com.mycompany.proyectotarea;

public class Doctor extends Persona {
    private String especialidad;
    private String universidad;
    private String hospital;

    public Doctor(String nombre, int edad, String especialidad, String universidad, String hospital) {
        super(nombre, edad);
        this.especialidad = especialidad;
        this.universidad = universidad;
        this.hospital = hospital;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getHospital() {
        return hospital;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("=== Informacion del Doctor ===");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Universidad: " + universidad);
        System.out.println("Hospital: " + hospital);
    }
}
