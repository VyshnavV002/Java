import java.util.*;
public class digits {
    public static void main(String args[]){
    int sum=0,d=0,num;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number ");
     num=sc.nextInt();
    while(num!=0){
        d=num%10;
        sum=sum+d;
        num=num/10;
    }
    System.out.println("Sum="+sum);
 }
}
