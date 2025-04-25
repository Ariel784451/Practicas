import javax.swing.*;
import java.awt.*;

public class Circulo {
    public Punto centro;
    public float radio;
    public Circulo(Punto centro, float radio) {
        this.centro=centro;
        this.radio=radio;
    }
    public String toString() {
        return String.format("(%s , %.2f)",this.centro,this.radio);
    }
    public void dibujaCirculo(Graphics g) {
        g.setColor(Color.RED);
        int numLados = 100;
        int[] xPoints = new int[numLados];
        int[] yPoints = new int[numLados];

        int centroX = (int) centro.x;
        int centroY = (int) centro.y;
 
        int radio = (int) this.radio;
  
        for (int i = 0; i < numLados; i++) {
            double angulo = 2 * Math.PI * i / numLados;
            
 
            xPoints[i] = centroX + (int) (radio * Math.cos(angulo));
            yPoints[i] = centroY + (int) (radio * Math.sin(angulo));
        }
 
        g.drawPolygon(xPoints, yPoints, numLados);
    }
    public static void main(String[]args) {
        Punto p1= new Punto(0,0);
        Circulo c1=new Circulo(p1, 50);
        System.out.println(c1);
    }
}
