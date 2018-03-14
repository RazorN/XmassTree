public class leftTree extends Tree {

    public leftTree(){
        super();
    }

    public leftTree(int h, char c){
        super(h,c);
    }

    public void draw() {
        for(int i=0;i<height;i++){
            for(int j=0;j<height-i-1;j++)
                System.out.print(" ");
            for(int k=0;k<i+1;k++)
                System.out.print(leaf);
            System.out.println();
        }
        for(int i=height-2;i>=0;i--){
            for(int j=height-i-1;j>0;j--)
                System.out.print(" ");
            for(int k=i+1;k>0;k--)
                System.out.print(leaf);
            System.out.println();
        }
    }
}
