import javax.swing.*;
import java.awt.*;

import java.awt.Graphics;
public class Linea {
    public Punto p1;
    public Punto p2;
    public Linea (Punto p1, Punto p2) {
        this.p1=p1;
        this.p2=p2;
    }
    public String toString() {
        return String.format("(%s , %s)",this.p1,this.p2);
    }
    public void dibujaLinea(Graphics g) {
        g.setColor(Color.BLACK);
        int[] xPoints = { (int) p1.x, (int) p2.x };
        int[] yPoints = { (int) p1.y, (int) p2.y };
        g.drawPolygon(xPoints, yPoints, 2);
    }
    public static void main(String [] args) {
        Punto p1 = new Punto(5,5);
        Punto p2 = new Punto(2,8);
        Linea l1 = new Linea(p1,p2);
        System.out.println(l1);
    }
}

