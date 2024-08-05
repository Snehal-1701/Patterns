import java.util.*;

class Demo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();
        int column = row-1;

        for(int i=0; i<=row; i++) {
            for(int j=0; j<=column; j++) {
                if(i==0 || j==0 || i==row || j==column) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }        
            }
            System.out.println();
        }
    }
}