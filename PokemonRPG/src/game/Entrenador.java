package game;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private String nombre;
    private List<Pokemon> equipo;
    private int medallas;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
        this.medallas = 0; // Inicialmente, el entrenador no tiene medallas
    }

    public void capturarPokemon(Pokemon pokemon) {
        if (equipo.size() < 6) {
            equipo.add(pokemon);
            System.out.println(nombre + " ha capturado a " + pokemon.getNombre() + "!");
        } else {
            System.out.println(nombre + " ya tiene un equipo completo.");
        }
    }

    public void mostrarEquipo() {
        System.out.println("Equipo de " + nombre + ":");
        for (Pokemon pokemon : equipo) {
            System.out.println("- " + pokemon.getNombre() + " (Nivel: " + pokemon.getNivel() + ")");
        }
    }

    public void ganarMedalla() {
        medallas++;
        System.out.println(nombre + " ha ganado una medalla! Total de medallas: " + medallas);
    }

    public String getNombre() {
        return nombre;
    }

    public int getMedallas() {
        return medallas;
    }

    public List<Pokemon> getEquipo() {
        return equipo;
    }
}

