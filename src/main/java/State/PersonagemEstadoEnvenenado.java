package State;

public class PersonagemEstadoEnvenenado extends PersonagemEstado {

    private PersonagemEstadoEnvenenado() {}
    private static PersonagemEstadoEnvenenado instance = new PersonagemEstadoEnvenenado();

    public static PersonagemEstadoEnvenenado getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Envenenado";
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