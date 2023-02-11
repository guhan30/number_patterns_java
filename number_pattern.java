package patterns;
import java.util.Scanner;
public class number_pattern {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n =in.nextInt();
        int a=1,b=2;
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                if(row%2==1){
                    System.out.print(a++ + " ");
                    a+=1;
                }
                if(row%2==0){
                    System.out.print(b++ + " ");
                    b+=1;
                }
            }
            System.out.println();
        }
    }
}
