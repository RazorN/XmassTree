abstract public class Tree {
    int height = 10;
    char leaf = 'x';

    public Tree(){
    }

    public Tree(int h, char c){
        this.height = h;
        this.leaf = c;
    }

    public void setHeight(int h){
        this.height = h;
    }

    public void setLeaf(char c){
        this.leaf = c;
    }

    abstract void draw();

}
