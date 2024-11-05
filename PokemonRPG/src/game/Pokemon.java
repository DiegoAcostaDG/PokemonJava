package game;

public class Pokemon {
    private String nombre;
    @SuppressWarnings("unused")
    private String tipo;
    private int nivel;
    private int vida;
    private int ataque;

    public Pokemon(String nombre, String tipo, int nivel, int vida, int ataque) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
    }

    public void atacar(Pokemon enemigo) {
        enemigo.recibirDanio(ataque);
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida < 0) vida = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivel() {
        return nivel;
    }

    // Otros métodos y atributos (getters, setters, etc.)
}


