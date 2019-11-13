package com.company;

import java.awt.*;
import java.util.Random;

public class Animator {

    Graphics g;
    public Animator(Graphics g){
        this.g = g;
    }

    public void draw (int x, int y){
        Random r = new Random();
        Color c = new Color(r.nextInt(256), r.nextInt(256),r.nextInt(256));
        g.setColor(c);
        g.fillOval(x,y,10,10);
    }
}
