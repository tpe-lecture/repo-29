package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;
import tpe.oo.interfaces.api.DigitalController;

public class DualShock4 implements AnalogController, DigitalController {

    AnalogController a;
    DigitalController d;


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
    public Point getPosition() {
        // TODO Auto-generated method stub
        return null;
    }

}
