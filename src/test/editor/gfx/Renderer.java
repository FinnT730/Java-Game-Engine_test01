package test.editor.gfx;

import test.editor.BaseComp;
import test.editor.gfx.testing.Bridge;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;

public class Renderer extends BaseComp {

    static int x = 50;
    static int y = 50;


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int amount = 10;

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

    private boolean renderedGrid = false;

    @Override
    public void paint(Graphics g) {

        if(!renderedGrid) {

            for (int i = 0; i < 640 * 10; i += 10) {
                for (int j = 0; j < 640 * 10; j += 10) {
                    Color col = new Color(41, 25, 23, 255);
                    g.setColor(col);
                    g.drawRect(i, j, 10, 10);
                }
            }
            renderedGrid = true;
        }

        super.paint(g);
        g.setColor(Color.BLACK);
        update(g);

    }


    @Override
    public void update(Graphics g) {

        g.fillRect(x - 10, y - 10, 10, 10);

        ArrayList<Bridge> bl = new ArrayList<>();

        for(int i = 1; i < 640; i += 10) {

            Bridge br = new Bridge(i,550);

            br.paint(g);

            bl.add(br);
        }

        bl.forEach(Bridge::addDrag);

    }

    @Override
    public void repaint() {
        renderedGrid = false;
        super.repaint();
    }
}
