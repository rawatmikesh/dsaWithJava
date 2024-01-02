import java.util.Scanner;
public class Factorial{
    public static int getfactorial(int n){
        int factorial=1;
        for(int i=n;i>=1;i--){
            factorial =i*factorial;
        }
        System.out.println(factorial);
        return factorial;
        
    }
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        //int b =sc.nextInt();

       //System.out.println(getgreaternooftwo(a,b)) ;
       getfactorial(n);
     }
}