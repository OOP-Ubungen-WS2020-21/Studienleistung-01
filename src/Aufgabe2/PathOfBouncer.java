package Aufgabe2;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class PathOfBouncer extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Path");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("PathOfBouncer");
    }
}
