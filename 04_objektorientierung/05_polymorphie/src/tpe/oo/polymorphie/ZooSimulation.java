package tpe.oo.polymorphie;

import tpe.oo.polymorphie.tiere.Affe;
import tpe.oo.polymorphie.tiere.Giraffe;
import tpe.oo.polymorphie.tiere.Gorilla;
import tpe.oo.polymorphie.tiere.ZooTier;

/**
 * Simulationsklasse.
 */
public final class ZooSimulation {

    /**
     * Konstruktor.
     */
    private ZooSimulation() {
        // keine Objekte benötigt
    }

    /**
     * Main-Methode.
     *
     * @param args Kommandozeilen-Argumente.
     */
    public static void main(String[] args) {
        Futterstelle futterstelle = new Futterstelle();

        ZooTier[] tiere = new ZooTier[3];

        Affe charlie = new Affe("Charlie");
        Gorilla buck = new Gorilla("Buck");
        Giraffe debbie = new Giraffe("Debbie");

        tiere[0] = charlie;
        tiere[1] = buck;
        tiere[2] = debbie;

        for (int i = 0; i < tiere.length; i++) {
            System.out.println(tiere[i]);
        }

        System.out.println("Fütterung...");

        for (int i = 0; i < tiere.length; i++) {
            futterstelle.gibFutter(tiere[i]);
        }

        for (int i = 0; i < tiere.length; i++) {
            System.out.println(tiere[i]);
        }

//        System.out.println(charlie);
//        System.out.println(buck);
//        System.out.println(debbie);
//
//        System.out.println("Fütterung...");
//
//        futterstelle.gibFutter(charlie);
//        futterstelle.gibFutter(buck);
//        futterstelle.gibFutter(debbie);
//
//        System.out.println(charlie);
//        System.out.println(buck);
//        System.out.println(debbie);
    }
}
