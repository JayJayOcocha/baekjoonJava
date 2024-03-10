import java.util.Scanner;

public class 코딩은체육 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        if(t % 4 == 0){
            int quotient = t / 4;
            // System.out.println(quotient);
            for(int i = 0; i< quotient; i++){
                System.out.print("long ");
            }
            System.out.println("int");
        }
        else{
            System.out.println("4의 배수가 아닙니다");
        }
    }
}
