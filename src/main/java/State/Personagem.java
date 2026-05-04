package State;

public class Personagem {

    private PersonagemEstado estado;

    public Personagem() {
        this.estado = PersonagemEstadoNormal.getInstance();
    }

    public void setEstado(PersonagemEstado estado) {
        this.estado = estado;
    }

    public boolean envenenar() {
        return estado.envenenar(this);
    }

    public boolean atordoar() {
        return estado.atordoar(this);
    }

    public boolean curar() {
        return estado.curar(this);
    }

    public boolean morrer() {
        return estado.morrer(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }
}