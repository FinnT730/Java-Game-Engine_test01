package test;

import test.editor.Display;
import test.editor.gfx.Renderer;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Component[] clist = new Component[]{new Renderer()};
        Display display = new Display(640, 640, "Demo", clist);
        if (display.equals(null)) {
            System.gc();
        } else {
            return;
        }

    }

}
