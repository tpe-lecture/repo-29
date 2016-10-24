package tpe.oo.ueberschreiben;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

import de.smits_net.games.framework.board.Board;

/**
 * Spielfeld.
 */
public class GameBoard extends Board {

    /** Alien, das durch das Bild läuft. */
    private Alien alien;
    private Alien alien1;
    private Alien alien2;
    private Alien alien3;
    private Alien alien4;
    private Alien alien5;
    private Alien alien6;
    private Alien alien7;
    private Alien alien8;
    private Alien alien9;


    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
        // neues Spielfeld anlegen
        super(10, new Dimension(400, 400), Color.BLACK);

        // Alien initialisieren
        alien = new Alien(this, new Point(100, 50 + new Random().nextInt(100)));
        alien1 = new Alien(this, new Point(200, 50 + new Random().nextInt(100)));
        alien2 = new Alien(this, new Point(300, 50 + new Random().nextInt(100)));
        alien3 = new Alien(this, new Point(400, 50 + new Random().nextInt(100)));
        alien4 = new Alien(this, new Point(500, 50 + new Random().nextInt(100)));
        alien5 = new Alien(this, new Point(600, 50 + new Random().nextInt(100)));
        alien6 = new Alien(this, new Point(700, 50 + new Random().nextInt(100)));
        alien7 = new Alien(this, new Point(800, 50 + new Random().nextInt(100)));
        alien8 = new Alien(this, new Point(900, 50 + new Random().nextInt(100)));
        alien9 = new Alien(this, new Point(70, 50 + new Random().nextInt(100)));

        // Alien soll auf Maus-Klicks reagieren
        addMouseListener(alien);
        addMouseListener(alien1);
        addMouseListener(alien2);
        addMouseListener(alien3);
        addMouseListener(alien4);
        addMouseListener(alien5);
        addMouseListener(alien6);
        addMouseListener(alien7);
        addMouseListener(alien8);
        addMouseListener(alien9);

    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     */
    @Override
    public void drawGame(Graphics g) {
        // Alien zeichnen
        alien.draw(g, this);
        alien1.draw(g, this);
        alien2.draw(g, this);
        alien3.draw(g, this);
        alien4.draw(g, this);
        alien5.draw(g, this);
        alien6.draw(g, this);
        alien7.draw(g, this);
        alien8.draw(g, this);
        alien9.draw(g, this);

    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     */
    @Override
    public boolean updateGame() {
        alien.move();
        alien1.move();
        alien2.move();
        alien3.move();
        alien4.move();
        alien5.move();
        alien6.move();
        alien7.move();
        alien8.move();
        alien9.move();

        return;
                alien.isVisible();
//        alien2.isVisible();
//        alien3.isVisible();
//        alien4.isVisible();
//        alien5.isVisible();
//        alien6.isVisible();
//        alien7.isVisible();
//        alien8.isVisible();
//        alien9.isVisible();

    }
}
