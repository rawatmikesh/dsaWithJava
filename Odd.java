import java.util.Scanner;
public class Odd{
    public static void printodd(int a){
        int sum=0;
        for(int i=0;i<=a;i++){      
              if(a%2!=0){
            sum=sum+i;
        }
        }
        System.out.println(sum);
    }
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
    
        printodd(a);
     }
}