package test.editor.memory;

public class Memory {


    private Object[] mem = null;


    public Memory() {

    }
    public Memory(int w, int h) {
        mem = new Object[w*h+1];
    }


    boolean add(Object obj, int index) {
        if(index > mem.length) {
            return false;
        }

        mem[index] = obj;

        return true;
    }



    Object getMem() {
        return mem;
    }
    

}
