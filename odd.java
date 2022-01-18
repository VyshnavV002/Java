import java.util.*;
public class odd {
    public static void main(String args[]){
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=scan.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }

    }
    
}
