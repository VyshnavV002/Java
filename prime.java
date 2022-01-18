import java.util.*;
public class prime {
    public static void main(String args[]){
    int num,flag=0;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number ");
    num=scan.nextInt();
    for(int i=2;i<=num/2;i++){
        if(num%i==0)
        {
           flag=1;
           break;
        }
    }
    if(flag==1)
        System.out.println("It is not prime ");
     else
        System.out.println("It is  prime");
    
 }
    
}
