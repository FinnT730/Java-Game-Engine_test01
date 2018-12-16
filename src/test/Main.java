package test;

import test.editor.Display;
import test.editor.gfx.Renderer;
import test.editor.memory.Memory;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        Component[] clist = new Component[]{new Renderer()};
        Display display = new Display(640, 640, "Demo", clist);
        Memory mem = new Memory(640,640);
        if (display.equals(null)) {
            System.gc();
        } else {
            return;
        }

    }

}
