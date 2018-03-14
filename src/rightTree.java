public class rightTree extends Tree {

    public rightTree(){
        super();
    }

    public rightTree(int h, char c){
        super(h,c);
    }

    public void draw() {
        for(int i = 0;i<=height;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(leaf);
            }
            System.out.println();
        }
        for(int i = height;i>=0;i--) {
            for (int j = i-1; j > 0; j--) {
                System.out.print(leaf);
            }
            System.out.println();
        }
    }
}
