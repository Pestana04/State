package State;

public class PersonagemEstadoAtordoado extends PersonagemEstado {

    private PersonagemEstadoAtordoado() {}
    private static PersonagemEstadoAtordoado instance = new PersonagemEstadoAtordoado();

    public static PersonagemEstadoAtordoado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Atordoado";
    }

    public boolean curar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoNormal.getInstance());
        return true;
    }

    public boolean morrer(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        return true;
    }
}