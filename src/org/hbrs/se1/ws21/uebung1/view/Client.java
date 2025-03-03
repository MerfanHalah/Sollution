package org.hbrs.se1.ws21.uebung1.view;

import org.hbrs.se1.ws21.uebung1.control.Factory.TransFactory;
import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws21.uebung1.control.Translator;

public class Client {

    /*
     * Methode zur Ausgabe einer Zahl auf der Console
     */
    public void display(int aNumber) {
        // In dieser Methode soll die Methode translateNumber
        // mit dem übergegebenen Wert der Variable aNumber
        // aufgerufen werden.
        //
        // Strenge Implementierung gegen das Interface Translator gewuenscht!

        Translator erg = TransFactory.createGermanTranslator();


        System.out.println("Das Ergebnis der Berechnung: " +
                erg.translateNumber(aNumber));

    }
}
