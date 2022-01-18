import java.util.*;
public class factorial {
    public static void main(String args[]){
        int num,f=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=scan.nextInt();
        while(num!=0){
            f=num*f;
            num--;
        }
        System.out.println("Factorial="+f);
    }
    
}
