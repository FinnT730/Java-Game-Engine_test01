package test.editor.gfx;

import test.editor.BaseComp;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Renderer extends BaseComp {

    static int x = 50;
    static int y = 50;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int amount = 2;

        int i = e.getKeyCode();
        if (i == KeyEvent.VK_A) {
            x -= amount;
            this.repaint();
        }
        if (i == KeyEvent.VK_S) {
            y += amount;
            this.repaint();
        }
        if (i == KeyEvent.VK_W) {
            y -= amount;
            this.repaint();
        }
        if (i == KeyEvent.VK_D) {
            x += amount;
            this.repaint();
        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.gc();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void paint(Graphics g) {

        for (int i = 0; i < 640 * 10; i += 10) {
            for (int j = 0; j < 640 * 10; j += 10) {
                g.drawRect(i, j, 10, 10);
            }
        }

        super.paint(g);
        update(g);

    }


    @Override
    public void update(Graphics g) {

        g.fillRect(x - 10, y - 10, 10, 10);


    }


    @Override
    public void repaint() {
        super.repaint();
    }
}
