package tpe.oo.interfaces.api;

import java.awt.Point;

public interface AnalogController {
    /**
     * Nach oben bewegen.
     */
    void up();

    /**
     * Nach unten bewegen.
     */
    void down();

    /**
     * Nach links bewegen.
     */
    void left();

    /**
     * Nach rechts bewegen.
     */
    void right();

    /**
     * Liefert die aktuelle Position zurück.
     *
     * @return Die Position.
     */
    Point getPosition();
}
