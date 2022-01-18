import java.util.*;
public class palindome {
    public static void main(String args[]){
        int num,digit=0,rev=0,copy;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=obj.nextInt();
        copy=num;
        while(num!=0){
            digit=num%10;
            rev=(rev*10)+digit;
            num=num/10;
        }
        if(rev==copy){
        System.out.println("The reverse is palindrome ");
        }
        else{
            System.out.println("The reverse is not palindrome");
        }
    }
}
