package com.mycompany.proyectotarea;
// Código por Ivan Maradiaga
public class Deportista extends Persona {
    private String deporte;
    private String nivelCompetencia; // Ej: "Aficionado" o "Profesional"

    // Constructor
    public Deportista(String nombre, int edad, String deporte, String nivelCompetencia) {
        super(nombre, edad); // Llama al constructor de Persona
        this.deporte = deporte;
        this.nivelCompetencia = nivelCompetencia;
    }

    // Getters y Setters
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public String getNivelCompetencia() {
        return nivelCompetencia;
    }

    public void setNivelCompetencia(String nivelCompetencia) {
        this.nivelCompetencia = nivelCompetencia;
    }

    // Implementar el método abstracto de Persona
    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Deporte: " + deporte);
        System.out.println("Nivel de Competencia: " + nivelCompetencia);
    }

    // Método específico de Deportista
    public void entrenar() {
        System.out.println(getNombre() + " está entrenando para mejorar en " + deporte + ".");
    }
}
