package Aufgabe1;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class BouncerCleans extends BouncerApp{

    @Override
    public void bounce() {
        loadMap("Mess");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("BouncerCleans");
    }
}
