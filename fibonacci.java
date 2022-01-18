import java.util.*;
public class fibonacci {
    public static void main(String args[]){
        int n,first=0,second=1,third;
        Scanner scan=new Scanner(System.in);
        System.out.println("The limit ");
        n=scan.nextInt();
        System.out.print(first+" "+second);
        for(int i=3;i<=n;i++){
            third=first+second;
            System.out.print(" "+third);
            first=second;
            second=third;
        }
    }
}
