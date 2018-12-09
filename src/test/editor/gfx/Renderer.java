package test.editor.gfx;

import test.editor.BaseComp;
import test.editor.gfx.testing.Bridge;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Random;

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

        int height = 250;

        int[][] pos = new int[640][640];

        for(int i = 1; i < 640; i += 10) {


            pos[i][height] = 1;

            Bridge br = new Bridge(i,height);



            br.paint(g);
        }


    }


    @Override
    public void repaint() {
        this.getGraphics().setColor(new Color(57, 131, 26, 217));
        this.getGraphics().create(x - 10,y - 10, 10, 10).draw3DRect(x - 10, y - 10,10,10,true);
        renderedGrid = false;
        super.repaint();
    }
}
