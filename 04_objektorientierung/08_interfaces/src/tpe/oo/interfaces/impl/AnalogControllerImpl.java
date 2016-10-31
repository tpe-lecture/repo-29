package tpe.oo.interfaces.impl;

import java.awt.Point;

import tpe.oo.interfaces.api.AnalogController;

public class AnalogControllerImpl implements AnalogController {

    private double x,y;

    @Override
    public void up(double percentage) {
        // TODO Auto-generated method stub
        y-= percentage;
    }

    @Override
    public void down(double percentage) {
        // TODO Auto-generated method stub
        y += percentage;
    }

    @Override
    public void left(double percentage) {
        // TODO Auto-generated method stub
        x += percentage;
    }

    @Override
    public void right(double percentage) {
        // TODO Auto-generated method stub
        x -= percentage;
    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
      //  return null;
        return new Point ((int)x , (int) y);
    }

}
