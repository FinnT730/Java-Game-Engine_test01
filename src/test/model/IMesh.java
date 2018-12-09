package test.model;

public interface IMesh {


    int[] vert();

    int[] tri();

    void render();

    void update();

    void addTri(int x, int y, int z);

    void addVert(int x, int y);


}
