import java.util.Scanner;

public class Questioarray{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        int[][] numbers=new int[rows][columns];
        //input
        for(int i=0; i<rows;i++){
            //columns
            for(int j=0; j<columns; j++){
                numbers[i][j] =sc.nextInt();
            }
        }
        //output
        int x =sc.nextInt();
        for(int i=0; i<rows;i++){
            //columns
            for(int j=0; j<columns; j++){
               if(numbers[i][j] ==x){
                System.out.println("x found at location("+i + "," +j +")");
               }

            }
        }


       

    }}