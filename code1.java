import java.util.*;
class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int row = sc.nextInt();
        int column = row + (row-1);
        int mid = column/2;
        for(int i=1; i<=row; i++) {
            for(int j=0; j<mid; j++) {
                System.out.print("  ");
            }
           
            for(int j=1; j<=column-(2*mid); j++) {
                if(j%2 == 1) {
                    System.out.print(i+ " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            mid--;
        }
    }
}