package Aufgabe2;

import de.ur.mi.bouncer.apps.BouncerApp;
import de.ur.mi.bouncer.apps.BouncerLauncher;

public class BouncerImTunnel extends BouncerApp {

    @Override
    public void bounce() {
        loadMap("Tunnel");
    }

    public static void main(String[] args) {
        BouncerLauncher.launch("BouncerImTunnel");
    }
}
