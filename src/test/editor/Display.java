package test.editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

public class Display {


    static JFrame frame = null;


    public Display(int w, int h, String name, Component[] comps) {
        frame = new JFrame(name);
        frame.setSize(w, h);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (Component o : comps) {
            if (o instanceof BaseComp) {
                frame.add(o);
                frame.addKeyListener((KeyListener) o);
                frame.addMouseListener((MouseListener) o);
            } else {
                o = null;
            }
            System.gc();
        }

    }


}
