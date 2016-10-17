package tpe.oo.vererbung;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

import de.smits_net.games.framework.board.Board;
import de.smits_net.games.framework.image.ImageBase;
import de.smits_net.games.framework.sprite.Sprite;

/**
 * Spielfeld.
 */
public class GameBoard extends Board{
// TODO: Von Board ableiten

    /** Alien, das durch das Bild läuft. */
    private AlienSprite alien;
    private AlienSprite alien2;
    private AlienSprite alien3;
    private AlienSprite alien4;
    private AlienSprite alien5;

    /** Asteroid. */
    private Sprite asteroid;
    private Sprite asteroid2;

    /** Hintergrundbild. */
    private Image background;

    /**
     * Erzeugt ein neues Board.
     */
    public GameBoard() {
// TODO: Einkommentieren
//        // neues Spielfeld anlegen
        super(10, new Dimension(800, 600), Color.BLACK);
//
//        // Hintergrundbild laden
        background = ImageBase.loadImage("assets/background");


        // TODO: Alien und Asteroid anlegen und positionieren
        alien = new AlienSprite(this,new Point(200,20));
        alien2 = new AlienSprite(this,new Point(200,60));
        alien3 = new AlienSprite(this,new Point(200,100));
        alien4 = new AlienSprite(this,new Point(200,150));
        alien5 = new AlienSprite(this,new Point(200,200));
        asteroid = new Asteroid(this,new Point(250,290));
        asteroid2 = new Asteroid(this,new Point(190,170));
    }

    /**
     * Hintergrund zeichnen.
     */
    protected void drawBackground(Graphics g) {
        g.drawImage(background, 0, 0, null);
    }

    /**
     * Spielfeld neu zeichnen. Wird vom Framework aufgerufen.
     *
     * @param g Der Grafik-Kontext
     */
    public void drawGame(Graphics g) {
        // TODO: Alle Objekte zeichnen

        asteroid.draw(g);
        asteroid2.draw(g);
        alien.draw(g);
        alien2.draw(g);
        alien3.draw(g);
        alien4.draw(g);
        alien5.draw(g);

    }

    /**
     * Spielsituation updaten. Wird vom Framework aufgerufen.
     *
     * @return Spiel läuft weiter, solange diese methode <code>true</code>
     *      zurück gibt
     */
    public boolean updateGame() {

        // TODO: Die Objekte bewegen
        alien.move();
        alien2.move();
        alien3.move();
        alien4.move();
        alien5.move();
        asteroid.move();
        asteroid2.move();
        // Kollision erkennen
// TODO: Einkommentieren
        if ((alien.intersects(asteroid)||alien.intersects(asteroid2)) && (alien.isActive())) {
            alien.explode();
        }else if((alien2.intersects(asteroid)||alien2.intersects(asteroid2)) && (alien2.isActive())){
            alien2.explode();
        }else if((alien3.intersects(asteroid)||alien3.intersects(asteroid2)) && (alien3.isActive())){
            alien3.explode();
        }else if((alien4.intersects(asteroid)||alien4.intersects(asteroid2)) && (alien4.isActive())){
            alien4.explode();
        }else if((alien5.intersects(asteroid)||alien5.intersects(asteroid2)) && (alien5.isActive())){
            alien5.explode();
        }





        return true;
    }
}
