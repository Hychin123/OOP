package TP7;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class graphic extends ex {
  public void draw(Graphics g) {
    g.setColor(Color.blue);
    g.fillRect((int) x - 1, (int) y - 2, 10, 10);
  }
}

class Mywindow extends JFrame {
  public Mywindow(String title, graphic pg) {
    super(title);
    this.pg = pg;
  }

  @Override
  public void paid(Graphics g) {
    super.paint(g);
    pg.draw(g);
  }
}

class Testpoint {
  public static void main(String[] args) {
    graphic pg = new graphic();
    pg.x = 2;
    pg.y = 3;
    pg.translate(-2, 7);
    System.out.println(pg.distance());// 12
    JFrame win = new JFrame("It is my window.");
    win.setSize(300, 300);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    win.setVisible(true);
    pg.draw(win.getContentPane().getGraphics());
  }
}
