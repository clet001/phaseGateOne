import java.util.Scanner;

public class TaskFour{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter First Number ");
        int firstNumber = input.nextInt();

        System.out.println("Enter Second Number ");
        int secondNumber = input.nextInt();

        System.out.println("Enter Second Number ");
        int thirdNumber = input.nextInt();

        
        int largest = firstNumber;

        if( secondNumber > largest){
        System.out.println(" Second Number is the largest");
}       
        else if( thirdNumber > largest){
        System.out.println(" Third Number is the largest");
}       




    }
    
}
