import java.util.Scanner;

public class PrintPattern1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer:");
        int length = in.nextInt();
        System.out.println()
        for(int i = 1; i<=length; i++){
            for(int n = 1; n<=i; n++){
                System.out.print(n);
            }
            System.out.println();
        }

    }
}