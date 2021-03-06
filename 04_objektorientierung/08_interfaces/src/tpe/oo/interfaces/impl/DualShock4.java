package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController, DigitalController {

    private AnalogController a = new AnalogControllerImpl();
    private DigitalController d = new DigitalControllerImpl();

    @Override
    public void up(double percentage) {
        // TODO Auto-generated method stub
        a.up(percentage);
    }

    @Override
    public void down(double percentage) {
        // TODO Auto-generated method stub
        a.down(percentage);
    }

    @Override
    public void left(double percentage) {
        // TODO Auto-generated method stub
        a.left(percentage);
    }

    @Override
    public void right(double percentage) {
        // TODO Auto-generated method stub
        a.right(percentage);
    }

    @Override
    public void up() {
        // TODO Auto-generated method stub
        d.up();
    }

    @Override
    public void down() {
        // TODO Auto-generated method stub
        d.down();
    }

    @Override
    public void left() {
        // TODO Auto-generated method stub
        d.left();
    }

    @Override
    public void right() {
        // TODO Auto-generated method stub
        d.right();
    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
        //return null;
        Point resultAnalog = a.getPosition();
        Point resultDigital = d.getPosition();
        Point result = new Point();

        result.x = resultAnalog.x + resultDigital.x;
        result.y = resultAnalog.y + resultDigital.y;

        return result;
    }

}
