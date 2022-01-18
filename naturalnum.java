import java.util.*;
public class naturalnum {
    public static void main(String args[]){
        int n,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the limit ");
        n=scan.nextInt();
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("Sum="+sum);
    }
}
