package test.editor;

import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public abstract class BaseComp extends Component implements MouseListener, KeyListener {

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        System.gc();
    }


    @Override
    public void update(Graphics g) {
        super.update(g);
    }


}
