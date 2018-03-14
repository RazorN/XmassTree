public class downTree extends Tree {

    public downTree(){
        super();
    }

    public downTree(int h, char c){
        super(h,c);
    }

    public void draw() {
        for(int i = 0;i<height;i++) {
            for(int j=0;j<i;j++)
                System.out.print(" ");
            for(int j=0;j<height*2-i-i-1;j++)
                System.out.print(leaf);
            for(int j=0;j<=i;j++)
                System.out.print(" ");
            System.out.println();
        }
    }
}
