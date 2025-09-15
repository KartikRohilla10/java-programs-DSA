import java.util.Scanner;

public class Zpattern {

            static void printZpattern(int n ){
                for (int i = n ; i>0 ; i--){
                    if (i==n || i ==1){
                    for (int j =n ; j>0 ; j--){
                        System.out.print("*");
                    }
                System.out.println("");
            }
                    else{
                    for (int k=i-1;k>0;k--){
                        System.out.print(" ");
                    }
                    System.out.println("*");
                    }
                }
            }

    public static void main(String[] args) {
        printZpattern(30);

        // Scanner sc = new Scanner(System.in());
        // int a = sc.nextInt();
        // printZpattern1(5);
    }
}
