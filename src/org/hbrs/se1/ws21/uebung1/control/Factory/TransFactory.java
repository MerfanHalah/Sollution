package org.hbrs.se1.ws21.uebung1.control.Factory;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws21.uebung1.control.Translator;

public class TransFactory {
    public static Translator createGermanTranslator() {

        return new GermanTranslator();

    }
}
