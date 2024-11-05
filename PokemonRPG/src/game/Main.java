package game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el nombre del entrenador
        System.out.print("Ingresa el nombre de tu entrenador: ");
        String nombreEntrenador = scanner.nextLine();
        
        // Crear el entrenador con el nombre ingresado
        Entrenador entrenador = new Entrenador(nombreEntrenador);

        // Presentar opciones de Pokémon iniciales
        System.out.println("Elige tu Pokémon inicial:");
        System.out.println("1. Pikachu (Eléctrico)");
        System.out.println("2. Charmander (Fuego)");
        System.out.println("3. Bulbasaur (Planta)");
        
        // Leer la elección del usuario
        int eleccion = scanner.nextInt();

        // Crear el Pokémon inicial basado en la elección
        Pokemon pokemonElegido = null;
        switch (eleccion) {
            case 1:
                pokemonElegido = new Pokemon("Pikachu", "Eléctrico", 5, 35, 55);
                break;
            case 2:
                pokemonElegido = new Pokemon("Charmander", "Fuego", 5, 39, 52);
                break;
            case 3:
                pokemonElegido = new Pokemon("Bulbasaur", "Planta", 5, 45, 49);
                break;
            default:
                System.out.println("Opción no válida. Se elegirá Pikachu por defecto.");
                pokemonElegido = new Pokemon("Pikachu", "Eléctrico", 5, 35, 55);
                break;
        }

        // Capturar el Pokémon inicial
        entrenador.capturarPokemon(pokemonElegido);
        
        // Mostrar el equipo
        entrenador.mostrarEquipo();

        // Cerrar el escáner
        scanner.close();
    }
}



