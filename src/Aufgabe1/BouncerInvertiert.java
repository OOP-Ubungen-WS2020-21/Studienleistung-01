package Aufgabe1;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class BouncerInvertiert extends BouncerApp{

    @Override
    public void bounce() {
        loadMap("Flowers");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("BouncerInvertiert");
    }
}
