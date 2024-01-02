import java.util.Scanner;

public class Arrays{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int size =sc.nextInt();
        
        int number[] = new int[size];
           for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
           }     

       // marks[0]=97;
      //  marks[1]=98;
       // marks[2]=99;
       // System.out.println(marks[0]);
       // System.out.println(marks[1]);
       for(int i=0;i<size;i++){
        System.out.println(number[i]);

       }

    }}