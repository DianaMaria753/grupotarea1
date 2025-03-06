/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doctor;

/**
 *
 * @author Usuario
 */
public class Doctor {
    private String nombre;
    private int edad;
    private String profesion;
    private String universidad;
    private String hospital;

    public Doctor(String nombre, int edad, String profesion, String universidad, String hospital) {
        this.nombre = nombre;
        this.edad = edad;
        this.profesion = profesion;
        this.universidad = universidad;
        this.hospital = hospital;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getHospital() {
        return hospital;
    }

    public void mostrarInformacion() {
        System.out.println("=== Informacion del Doctor: ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Profesion: " + profesion);
        System.out.println("Universidad: " + universidad);
        System.out.println("Trabaja : " + hospital);
    }

    public static void main(String[] args) {
        Doctor doctorCortes = new Doctor("Javier Cortes", 50, "Oncologo", "Universidad Complutense de Madrid", "Hospital Universitario Vall d'Hebron");
        doctorCortes.mostrarInformacion();
    }
}