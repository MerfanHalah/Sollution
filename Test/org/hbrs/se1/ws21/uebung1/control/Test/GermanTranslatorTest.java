package org.hbrs.se1.ws21.uebung1.control.Test;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {
    GermanTranslator g = null;

    @BeforeEach
    void create() {
        g = new GermanTranslator();
    }

    @org.junit.jupiter.api.Test
    void translateNumber() {
        assertEquals("drei", g.translateNumber(3));
        assertEquals("Übersetzung der Zahl 14 nicht möglich\n" +
                "Versionsnummer des Translators: 1.0", g.translateNumber(14));
        assertEquals("Übersetzung der Zahl -7 nicht möglich\n" +
                "Versionsnummer des Translators: 1.0", g.translateNumber(-7));
        assertEquals("Übersetzung der Zahl 0 nicht möglich\n" +
                "Versionsnummer des Translators: 1.0", g.translateNumber(0));

    }
}