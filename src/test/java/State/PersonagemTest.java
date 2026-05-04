package State;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonagemTest {

    @Test
    void deveIniciarNormal() {
        Personagem p = new Personagem();
        assertEquals("Normal", p.getNomeEstado());
    }

    @Test
    void deveEnvenenar() {
        Personagem p = new Personagem();
        p.envenenar();
        assertEquals("Envenenado", p.getNomeEstado());
    }

    @Test
    void deveCurarEnvenenado() {
        Personagem p = new Personagem();
        p.envenenar();
        p.curar();
        assertEquals("Normal", p.getNomeEstado());
    }

    @Test
    void deveMorrer() {
        Personagem p = new Personagem();
        p.morrer();
        assertEquals("Morto", p.getNomeEstado());
    }
}