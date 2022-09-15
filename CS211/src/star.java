// created by Taesik Kim for CS211 practice (Fall 2018)


import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;

class starAttribute {
  int x;
  int y;
  int size;
  int speedX;
  int speedY;
  int zoom;
  int angle;
  Color color;
}


public class star extends JFrame {

  public static ArrayList<starAttribute> myStar = new ArrayList<>();
  static int width;
  static int height;

  static int howMany;
  static int zoom = 1;

  public star() {
    super("CS211: Star Creator");
    setBounds(0, 0, width, height);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }

  public static void createStar() {
    Random rand = new Random();
    int R, G, B;

    for (int i = 0; i < howMany; i++) {
      starAttribute s = new starAttribute();
      R = rand.nextInt(256);
      G = rand.nextInt(256);
      B = rand.nextInt(256);
      s.color = new Color(R, G, B);
      s.x = rand.nextInt(width);
      s.y = rand.nextInt(height);
      s.size = rand.nextInt(10) + 10;
      s.speedX = rand.nextInt(3) + 1;
      s.speedY = rand.nextInt(3) + 1;
      if (rand.nextInt(2) == 0) {
        s.zoom = -1;
      } else {
        s.zoom = 1;
      }
      s.angle = rand.nextInt(36);
      myStar.add(s);
    }
  }

  public void paint(Graphics g) {

    g.setColor(Color.BLACK);
    g.fillRect(0, 0, getWidth(), getHeight());

    for (int i = 0; i < myStar.size(); i++) {

      g.setColor(myStar.get(i).color);

      myStar.get(i).size += myStar.get(i).zoom;
      if (myStar.get(i).size > 40 || myStar.get(i).size < 1) {
        myStar.get(i).zoom *= -1;
        myStar.get(i).size += myStar.get(i).zoom;
      }

      myStar.get(i).angle++;
      if (myStar.get(i).angle > 360) {
        myStar.get(i).angle = 0;
      }

      myStar.get(i).x += myStar.get(i).speedX;
      if (myStar.get(i).x > width || myStar.get(i).x < 0) {
        myStar.get(i).speedX = myStar.get(i).speedX * -1;
      }

      myStar.get(i).y += myStar.get(i).speedY;
      if (myStar.get(i).y > height || myStar.get(i).y < 0) {
        myStar.get(i).speedY = myStar.get(i).speedY * -1;
      }

      drawStar(g, myStar.get(i).x, myStar.get(i).y, myStar.get(i).size, myStar.get(i).angle);
    }

    try {
      Thread.sleep(10);
    } catch (Exception exc) {
    }

    repaint();
  }


  public void drawStar(Graphics g, int sx, int sy, int size, int angle) {

    int[] xCoords = new int[10];
    int[] yCoords = new int[10];
    int ang = 90 - angle;
    double rad;
    double PI = 3.14159;

    for (int i = 0; i < 10; i++) {
      if (i % 2 == 0)
        rad = size * 0.38;
      else
        rad = size;
      xCoords[i] += (int) (rad * Math.cos(PI * ang / 180.0));
      yCoords[i] -= (int) (rad * Math.sin(PI * ang / 180.0));
      ang += 36;
      xCoords[i] += sx;
      yCoords[i] += sy;
    }
    g.fillPolygon(xCoords, yCoords, 10);
  }

  public static void main(String[] args) {
    // width = 800;
    // height = 600;
    // howMany=100;
    width = Integer.parseInt(args[0]);
    height = Integer.parseInt(args[1]);
    howMany = Integer.parseInt(args[2]);
    createStar();
    new star();
  }
}
