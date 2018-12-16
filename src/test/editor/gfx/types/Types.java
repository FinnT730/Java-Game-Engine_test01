package test.editor.gfx.types;

public enum Types {


    Player,
    Entity,
    Soild;


    Types() {
        class player {
            Object[] Player(int x, int y, int w, int h, Types type) {
                return new Object[] {"x:" + x,"\t","y:" + y,"\t","w:" + w,"\t","h:" + h,"\t"};
            }
        }
    }
}
