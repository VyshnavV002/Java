import java.util.*;
public class amstrong {
    public static void main(String args[]){
        int num,copy,n,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number ");
        num=scan.nextInt();
        copy=num;
        while(num!=0){
            n=num%10;
            sum=sum+(n*n*n);
            num=num/10;
        }
        System.out.println(sum);
        if(copy==sum){
            System.out.println("The number is amstrong");
        }
        else{
            System.out.println("The number is not amstrong");
        }
    }
}
