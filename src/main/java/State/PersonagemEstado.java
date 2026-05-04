package State;

public abstract class PersonagemEstado {

    public abstract String getEstado();

    public boolean envenenar(Personagem personagem) {
        return false;
    }

    public boolean atordoar(Personagem personagem) {
        return false;
    }

    public boolean curar(Personagem personagem) {
        return false;
    }

    public boolean morrer(Personagem personagem) {
        return false;
    }
}