import java.util.Scanner;
public class Strings{
    
    
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("your name is:"+ name);
        System.out.println(name.length());
        //charAt
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));

        }
     }
}