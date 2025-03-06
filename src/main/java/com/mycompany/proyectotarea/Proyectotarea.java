package com.mycompany.proyectotarea;


public class Proyectotarea {

    public static void main(String[] args) {
        // Crear un objeto de la clase Deportista
        Deportista jugador = new Deportista("Leonel Messi", 36, "Futbol", "Profesional");
        Doctor doctorCortes = new Doctor("Javier Cortes", 50, "Oncologo", "Universidad Complutense de Madrid", "Hospital Universitario Vall d'Hebron");

        // Mostrar información del deportista
        System.out.println("=== Informacion del Deportista ===");
        jugador.mostrarInformacion();

        // Simular un entrenamiento
        System.out.println("\n=== Entrenamiento ===");
        jugador.entrenar();

        // Modificar algunos atributos
        System.out.println("\n=== Modificacion de datos ===");
        jugador.setDeporte("Padel");
        jugador.setNivelCompetencia("Aficionado");

        // Mostrar la información actualizada
        System.out.println("\n=== Informacion actualizada ===");
        jugador.mostrarInformacion();
        
        // mostrar informacion del doctor
        doctorCortes.mostrarInformacion();
    }

}
