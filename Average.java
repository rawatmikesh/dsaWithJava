import java.util.Scanner;
public class Average{
    public static int average(int a, int b ,int c){
        int pverage = (a+b+c)/3;
        return pverage;
    }
     public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();


        int average =average(a,b ,c);
        System.out.println(average);
     }}