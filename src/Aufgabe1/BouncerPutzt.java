package Aufgabe1;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class BouncerPutzt extends BouncerApp{

    @Override
    public void bounce() {
        loadMap("Mess2");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("BouncerPutzt");
    }
}