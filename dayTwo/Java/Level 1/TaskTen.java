import java.util.Scanner;

public class TaskTen{
    public static void main(String[] args){

        Scanner input = new Scanner (System.in);
        System.out.println("Enter Number ");
        int FirstNumber = input.nextInt();

        System.out.println("Enter Second Number: ");
        int SecondNumber = input.nextInt();

        System.out.println("Enter Second Number: ");
        int ThirdNumber = input.nextInt();


int Average = (FirstNumber + SecondNumber + ThirdNumber)/3;

System.out.println("Average is " + Average);


}
    
}
