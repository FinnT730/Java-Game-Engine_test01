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


    private boolean collision() {
        return true;
    }


}