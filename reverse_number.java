import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        int n,r;
        System.out.println("Enter the number ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            r=n%10;
            System.out.println(" "+r);
            n=n/10;
        }
    }


    }

