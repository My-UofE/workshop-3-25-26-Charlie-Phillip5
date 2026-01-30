import java.util.Scanner;

public class PrintPattern2{
    public static void main(String[] arg){
        Scanner in = new Scanner(System.in);
        
        boolean rightNum = false;
        int input = 0;
        while(!rightNum){
            System.out.println("Enter an integer 1 to 5");
            input = in.nextInt();
            if (input > 5) {System.out.println("Too big!");}
            else if (input < 1) {System.out.println("Too small!");}
            else{rightNum = true;}
        }

        
        for (int i = 1; i<=input; i++){
            for (int x = i; x<=i+input-1; x++){
                System.out.print(x);
            }
            for(int x = i+input-1; x>=i; x-= 1){
                System.out.print(x);
            }
            System.out.println();
        }
        for (int i = input; i>=1; i-= 1){
            for (int x = i; x<=i+input-1; x++){
                System.out.print(x);
            }
            for(int x = i+input-1; x>=i; x-= 1){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}