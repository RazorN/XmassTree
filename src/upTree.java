public class upTree extends Tree {

    public upTree(){
        super();
    }

    public upTree(int h, char c){
        super(h,c);
    }

    public void draw() {
        for (int i = 0; i <= height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(leaf);
            }
            System.out.println();
        }
    }
}
