package State;

public class PersonagemEstadoNormal extends PersonagemEstado {

    private PersonagemEstadoNormal() {}
    private static PersonagemEstadoNormal instance = new PersonagemEstadoNormal();

    public static PersonagemEstadoNormal getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Normal";
    }

    public boolean envenenar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoEnvenenado.getInstance());
        return true;
    }

    public boolean atordoar(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoAtordoado.getInstance());
        return true;
    }

    public boolean morrer(Personagem personagem) {
        personagem.setEstado(PersonagemEstadoMorto.getInstance());
        return true;
    }
}