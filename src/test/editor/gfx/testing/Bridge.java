package test.editor.gfx.testing;

import java.awt.*;
import java.util.Random;

public class Bridge extends Component {


    private static int x = 0,y = 0;

    public Bridge() {

    }
    public Bridge(int q, int w) {
        x = q;
        y = w;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(new Color(new Random().nextInt(255),new Random().nextInt(255),new Random().nextInt(255)));
        g.fillRect(x - 10,y - 10,10,10);
        super.paint(g);
    }


    @Override
    public void update(Graphics g) {
        super.update(g);
    }



    public void addDrag() {
        int i = this.getY();
        for(int m = i; m > 0; m -= 5) {
            if((x % m + i) == 1) {
                x = i;
                this.repaint();
            }
        }
    }



    private boolean collision() {
        return true;
    }


}
